package corejava;
public class Garbagecollection {
    
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        // By nulling the reference
        Garbagecollection obj = new Garbagecollection();
        obj = null;

        // By assigning reference to another object
        Garbagecollection obj1 = new Garbagecollection();
        Garbagecollection obj2 = new Garbagecollection();
        obj1 = obj2;  

        // Object is out of scope
        {
            Garbagecollection obj3 = new Garbagecollection();
        } // obj3 goes out of scope after this block

        
        System.gc();
    }
}
