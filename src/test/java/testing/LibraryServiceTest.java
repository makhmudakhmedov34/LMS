package testing;

import com.all_books.LibraryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryServiceTest {

//    private LibraryService libraryService;
//
//    @BeforeEach
//    void setUp() {
//        libraryService = new LibraryService();
//    }
//
//    @Test
//    void testAddBook() {
//        int initialSize = libraryService.getBooks().size();
//        libraryService.addBook("Test Book", "Test Author", "12345", 5);
//        assertEquals(initialSize + 1, libraryService.getBooks().size());
//    }
//
//    @Test
//    void testAddUser() {
//        int initialSize = libraryService.getUsers().size();
//        libraryService.addUser("Test User", "test@example.com", "67890");
//        assertEquals(initialSize + 1, libraryService.getUsers().size());
//    }
//
//    @Test
//    void testIssueBook() {
//        libraryService.addBook("Test Book", "Test Author", "12345", 5);
//        libraryService.addUser("Test User", "test@example.com", "67890");
//
//        String bookId = libraryService.getBooks().get(0).getId();
//        String userId = libraryService.getUsers().get(0).getId();
//
//        libraryService.issueBook(userId, bookId);
//        assertEquals(4, libraryService.getBooks().get(0).getQuantity());
//    }
//
//    @Test
//    void testReturnBook() {
//        libraryService.addBook("Test Book", "Test Author", "12345", 5);
//        libraryService.addUser("Test User", "test@example.com", "67890");
//
//        String bookId = libraryService.getBooks().get(0).getId();
//        String userId = libraryService.getUsers().get(0).getId();
//
//        libraryService.issueBook(userId, bookId);
//        libraryService.returnBook(userId, bookId);
//        assertEquals(5, libraryService.getBooks().get(0).getQuantity());
//    }getQuantity
}
