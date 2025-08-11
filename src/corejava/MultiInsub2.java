package corejava;

public class MultiInsub2 extends MultiInsub1 {
    void displaySub2() {
        System.out.println("This is Subclass 2 (Child)");
    }

    public static void main(String[] args) {
        MultiInsub2 obj = new MultiInsub2();
        obj.displaySuper();  // from Superclass
        obj.displaySub1();   // from Subclass 1
        obj.displaySub2();   // from Subclass 2
    }
}

