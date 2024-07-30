package Bookdetails;
import java.util.Date;

public class Book {
    private int bookId;
    private String bookName;
    private Date bookReleaseDate;
    private int bookAuthor;

    public Book(int bookId, String bookName, Date bookReleaseDate, int bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookReleaseDate = bookReleaseDate;
        this.bookAuthor = bookAuthor;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBookReleaseDate() {
        return bookReleaseDate;
    }

    public void setBookReleaseDate(Date bookReleaseDate) {
        this.bookReleaseDate = bookReleaseDate;
    }

    public int getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(int bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}

public interface BookDAO {
    void insertBook(Book book) throws SQLException;
    List<Book> selectAllBooks() throws SQLException;
    List<Book> selectBooksByName(String name) throws SQLException;
}

public class BookDAOImpl implements BookDAO {
    private Connection connection;

    public BookDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertBook(Book book) throws SQLException {

    }

    @Override
    public List<Book> selectAllBooks() throws SQLException {
        
    }

    @Override
    public List<Book> selectBooksByName(String name) throws SQLException {
        
    }
}