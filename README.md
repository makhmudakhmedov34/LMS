📚 Library Management System

A Java-based application for managing library operations including user management, book cataloging, order processing, and borrowing records.

🚀 Features

🧑‍🤝‍🧑 User Management
- Create/administer different user types (Admin/Normal)
- Secure login functionality
- Persistent user data storage

📖 Book Operations
- Add/remove books from catalog
- Track book availability
- Search and retrieve book information

💰 Order Processing
- Create and manage book orders
- Track order history

🔄 Borrowing System
- Check-out and return books
- Automatic due date calculation
- Borrowing history tracking

🛠️ Technical Implementation

🏗️ System Architecture

classDiagram
class Database{
-users: List<User>
-books: List<Book>
-orders: List<Order>
-borrowings: List<Borrowing>
+addUser()
+login()
+addBook()
+deleteBook()
}
Database --> User
Database --> Book
Database --> Order
Database --> Borrowing


📂 File Structure
src/
├── main/
│ ├── java/com/all_books/library/
│ │ ├── Database.java # Core data management
│ │ ├── User.java # User base class
│ │ ├── Admin.java # Admin implementation
│ │ ├── NormalUser.java # Regular user
│ │ ├── Book.java # Book entity
│ │ ├── Order.java # Order processing
│ │ └── Borrowing.java # Loan management
│ └── resources/ # Data storage
│ ├── Users
│ ├── Books
│ ├── Orders
│ └── Borrowings
└── test/
└── java/com/all_books/library/
└── DatabaseTest.java # Comprehensive test suite


🧪 Testing Framework

✅ Verified Functionality

@Test
void testCompleteWorkflow() {

// 1. Initialize fresh database
Database db = new Database();
// 2. Add test user
User user = new NormalUser("John", "123", "john@test.com");
db.addUser(user);

// 3. Add test book
Book book = new Book();
book.setName("Clean Code");
db.addBook(book);

// 4. Create order
Order order = new Order(book, user, 29.99, 1);
db.addOrder(order, book, 0);

// 5. Verify all operations
assertEquals(1, db.users.size());
assertEquals(1, db.books.size());
assertEquals(1, db.orders.size());


📊 Test Coverage
- Database initialization
- CRUD operations for all entities
- File persistence verification
- Edge case validation

⚙️ Setup Instructions

1. **Requirements**
   - JDK 17+
   - Maven 3.8+

2. **Installation**

git clone https://github.com/yourrepo/library-system.git
cd library-system
mvn clean install

3. **Running Tests**

mvn test

📝 Usage Examples

**Adding a New Book:**
Book newBook = new Book();
newBook.setName("Design Patterns");
newBook.setAuthor("Gamma et al.");
newBook.setQty(10);
database.addBook(newBook);


**User Login:**
int loginStatus = database.login("secure123", "user@email.com");
if(loginStatus == 0) {
System.out.println("Login successful!");
}


🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Open a Pull Request
