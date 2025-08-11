package Exception;

class InvalidBookException extends Exception {
    public InvalidBookException(String msg) { super(msg); }
}

class InvalidUserException extends Exception {
    public InvalidUserException(String msg) { super(msg); }
}

class InvalidIdException extends Exception {
    public InvalidIdException(String msg) { super(msg); }
}

class Book {
    int id; String title; double price;

    Book(int id, String title, double price) throws InvalidIdException, InvalidBookException {
        if (id <= 0) throw new InvalidIdException("Invalid Book ID");
        if (title == null || title.isEmpty()) throw new InvalidBookException("Title cannot be empty");
        if (price <= 0) throw new InvalidBookException("Price must be > 0");

        this.id = id; this.title = title; this.price = price;
    }

    void show() { System.out.println("Book: " + id + " " + title + " ₹" + price); }
}

class User {
    int id; String name;

    User(int id, String name) throws InvalidIdException, InvalidUserException {
        if (id <= 0) throw new InvalidIdException("Invalid User ID");
        if (name == null || name.trim().isEmpty()) throw new InvalidUserException("Name cannot be empty");

        this.id = id; this.name = name;
    }

    void show() { System.out.println("User: " + id + " " + name); }
}

public class Exception1 {
    public static void main(String[] args) {
        try {
            Book b = new Book(1, "Java", 299);
            User u = new User(10, "Sindhu");
            b.show(); 
            u.show();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
