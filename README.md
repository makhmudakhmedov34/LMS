Library Management System (LMS)

This is a simple Java-based Library Management System (LMS) that allows Admins and Normal Users to interact with a library database via a console menu. The system supports basic operations such as viewing books, placing orders, borrowing and returning books, as well as admin tasks like adding or deleting books.

Features:

Admin

View Books
Add Book
Delete Book
Search
Delete All Data
View Orders
Exit

Normal User

View Books
Search
Place Order
Borrow Book
Calculate Fine
Return Book
Exit


Project Structure

src/
└── main/
    └── java/
        └── com/
            └── all_books/
                └── library/
                    ├── AddBook.java
                    ├── Admin.java
                    ├── Book.java
                    ├── BorrowBook.java
                    ├── Borrowing.java
                    ├── CalculateFine.java
                    ├── Database.java
                    ├── DeleteAllData.java
                    ├── DeleteBook.java
                    ├── Exit.java
                    ├── IOOperation.java
                    ├── Main.java
                    ├── NormalUser.java
                    ├── Order.java
                    ├── PlaceOrder.java
                    ├── ReturnBook.java
                    ├── Search.java
                    ├── User.java
                    ├── ViewBooks.java
                    └── ViewOrders.java
└── test/
    └── java/
        └── testing/
            ├── LibraryServiceTest.java
            └── DatabaseTest.java

How to Run

1. Clone the repository (if using Git):
git clone <repository-url>

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).

3. Run the application via the Main.java file.

4. Navigate menus via numeric input in the console.

Requirements

Java 8 or higher
IDE (e.g., IntelliJ, Eclipse) or terminal with javac and java

Author

makhmudakhmedov34
