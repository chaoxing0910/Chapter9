
public class TestCircle2WithPrivateDataFields {

	public static void main(String[] args) {
		// 9.9
		Circle2 myCircle=new Circle2(5.0);
		System.out.println("The area of the cirrcle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The number of objects created is "+Circle2.getNumberOfObjects());

		
	}

}
