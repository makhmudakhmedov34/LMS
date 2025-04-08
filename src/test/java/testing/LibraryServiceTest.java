package testing;

import com.all_books.library.*;
import com.all_books.library.Order;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    public static Database db;
    private static final String TEST_BOOK_NAME = "Test Book";

    @TempDir
    File tempDir;

    @BeforeEach
    void setUp() throws Exception {
        // Redirect file paths to temporary directory
        System.setProperty("user.dir", tempDir.getAbsolutePath());
        db = new Database();
    }

    @AfterEach
    void tearDown() {
        db.deleteAllData();
    }

    @Nested
    class InitializationTests {
        @Test
        void testDatabaseInitializationCreatesFiles() {
            assertTrue(new File("src/main/resources/Users").exists());
            assertTrue(new File("src/main/resources/Books").exists());
            assertTrue(new File("src/main/resources/Orders").exists());
            assertTrue(new File("src/main/resources/Borrowings").exists());
        }
    }

    @Nested
    class UserTests {
        @Test
        void testAddUser() {
            User user = new NormalUser("John", "123", "john@test.com");
            db.addUser(user);

            assertEquals(1, db.getAllUsers().size());
            assertTrue(db.getAllUsers().stream().anyMatch(n ->n.getName().equals("John")));
        }

        @Test
        void testLoginSuccess() {
            User user = new NormalUser("John", "john@test.com", "123");
            db.addUser(user);

            int result = db.login("123", "john@test.com");
            assertEquals(0, result);
        }

        @Test
        void testLoginFailure() {
            assertEquals(-1, db.login("invalid", "credentials"));
        }
    }

    @Nested
    class BookTests {
        @Test
        void testAddBook() {
            Book book = createTestBook();
            db.addBook(book);

            assertEquals(1, db.getAllBooks().size());
            assertEquals(TEST_BOOK_NAME, db.getAllBooks().get(0).getName());
        }

        @Test
        void testDeleteBook() {
            Book book = createTestBook();
            db.addBook(book);
            db.deleteBook(0);

            assertEquals(0, db.getAllBooks().size());
        }

        @Test
        void testGetBook() {
            Book book = createTestBook();
            db.addBook(book);

            int index = db.getBook(TEST_BOOK_NAME);
            assertEquals(0, index);
            assertEquals(TEST_BOOK_NAME, db.getBook(index).getName());
        }
    }

    @Nested
    class DataPersistenceTests {
        @Test
        void testSaveAndLoadUsers() {
            User user = new NormalUser("John", "123", "john@test.com");
            db.addUser(user);

            Database newDb = new Database();
            assertEquals(1, newDb.getAllUsers().size());
        }

        @Test
        void testDeleteAllData() {
            db.deleteAllData();
            assertFalse(new File("src/main/resources/Users").exists());
            assertFalse(new File("src/main/resources/Books").exists());
        }
    }

    @Nested
    class OrderTests {
        @Test
        void testAddOrder() {
            Book book = createTestBook();
            db.addBook(book);
            User user = new NormalUser("John", "123", "john@test.com");
            com.all_books.library.Order order = new Order(book, user, 29.99, 1);

            db.addOrder(order, book, 0);
            assertEquals(1, db.getAllOrders().size());
        }
    }

    @Nested
    class BorrowingTests {
        @Test
        void testBorrowBook() {
            Book book = createTestBook();
            db.addBook(book);
            User user = new NormalUser("John", "123", "john@test.com");
            Borrowing borrowing = new Borrowing(
                    LocalDate.now(),
                    LocalDate.now().plusDays(14),
                    book,
                    user
            );

            db.borrowBook(borrowing, book, 0);
            assertEquals(1, db.getBrws().size());
        }
    }

    private Book createTestBook() {
        Book book = new Book();
        book.setName(TEST_BOOK_NAME);
        book.setAuthor("Test Author");
        book.setQty(5);
        return book;
    }
}
