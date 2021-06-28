package inheritance;

class Car{
	public void gear() {
		System.out.println("수동 기어 사용");
	}
}

class ChildCar extends Car{
	public void auto_gear() {
		System.out.println("자동 기어 사용");
	}
}

class ChildCar2 extends ChildCar{
	public void auto_gear2() {
		System.out.println("수동/자동 혼합 사용");
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCar2 cc2 = new ChildCar2();
		cc2.gear();
		cc2.auto_gear();
		cc2.auto_gear2();
	}

}
