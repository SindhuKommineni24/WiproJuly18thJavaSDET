package college;

public class Student {
	private String s_name="sindhu";
    private int s_Id=423;
    private String s_department="electronics";
    
    private void get_sname() {
    	System.out.println("student name is "+s_name);
    }
    private void get_sid() {
    	System.out.println("student id is "+s_Id);
    }
    private void get_sdept() {
    	System.out.println("student department is "+s_department);
    }
    public static void main(String[] args) {
    	Student obj=new Student();
    	obj.get_sname();
    	obj.get_sid();
    	obj.get_sdept();
    }

}
