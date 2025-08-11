package labsession4;
class FinalVariable {
	//final variable
    final int x = 10;  

    void display1() {
        System.out.println("Final variable");
    }
}

// Final method 
class FinalMethod {
    final void display2() {
        System.out.println("This is a final method ");
    }
}

// Final class 
final class FinalClass {
    void display3() {
        System.out.println("This is a final class");
    }
}

public class FinalKeyword{
    public static void main(String[] args) {
      
        FinalVariable obj1= new FinalVariable();
        obj1.display1();

  
        FinalMethod obj2 = new FinalMethod();
        obj2.display2();

        FinalClass obj3= new FinalClass();
        obj3.display3();
    }
}
