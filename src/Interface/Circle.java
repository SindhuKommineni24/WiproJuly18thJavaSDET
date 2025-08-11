package Interface;


public class Circle implements InterfaceCircle {
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
	

	@Override
	public void radius() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
		
	}
	
	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.draw();
		obj.radius();
		
	}

}

