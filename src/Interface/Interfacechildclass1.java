package Interface;

interface InterfaceA {
    void display();
    static void show() {
    	System.out.println("Showing in InterfaceA");
    }
}

interface InterfaceB {
    void display();
    static void show() {
    	System.out.println("Showing in InterfaceB");
    }

}

public class Interfacechildclass1 implements InterfaceA, InterfaceB {

    public void display() {
        System.out.println("Display method implemented in ChildClass");
    }
    public static void main(String[] args) {
    	Interfacechildclass1 obj=new Interfacechildclass1();
    	InterfaceA.show();
    	InterfaceB.show();
    	obj.display();
    	InterfaceA a=obj;
    	a.display();
    	InterfaceB b=obj;
    	b.display();
    	
    }
}