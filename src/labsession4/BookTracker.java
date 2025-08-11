/*Library Book Tracker
Fields: title, author, isbn, isAvailable
Use encapsulation to:
Issue a book (setAvailable(false))
Return a book (setAvailable(true))
Get book info
Write a small test class to simulate issuing and returning books.*/
package labsession4;

public class BookTracker {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;


    public BookTracker(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; 
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;  
    }

 
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("issued");
        } else {
            System.out.println(" already issued.");
        }
    }

  
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(" returned");
        } else {
            System.out.println(" not issued");
        }
    }

   
    public void displayInfo() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
        System.out.println(isAvailable ? "Available" : "Not Available");
    }

    
    public static void main(String[] args) {
        BookTracker b1 = new BookTracker("Science", "ABC", "978");
        BookTracker b2 = new BookTracker("Telugu", "XYZ", "97789");

        b1.displayInfo();
        b1.issueBook();
        b1.returnBook();
        
        b2.displayInfo();
    }
}
