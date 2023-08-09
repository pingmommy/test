
//NestedClassExample 멤버클래스 객체를 생성하는 코드작성



public class NestedClassExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		Car.Tire tire =myCar.new Tire() ;
		
		//Car.Engine engine = new Engine();
		
	}

}
