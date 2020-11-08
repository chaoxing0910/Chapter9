
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// 9.7
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+newCircle.numberOfObjects);
		
		newCircle c1=new newCircle();
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius("+c1.radius+c1.numberOfObjects+")");
		
		newCircle c2=new newCircle(5);
		c1.radius=9;
		
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1:radius("+c1.radius+c1.numberOfObjects+")");
		System.out.println("c1:radius("+c2.radius+c2.numberOfObjects+")");
	}

}
