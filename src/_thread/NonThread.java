package _thread;

class GenClass {
	private int num;
	private String name;

	public GenClass(String a, int b) { // 생성자
		name = a;
		num = b;
	}

	public void start() {
		for (int i = 0; i < num; i++) {
			System.out.println(name + " : " + i);
		}
	}
}

public class NonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenClass t1 = new GenClass("first", 5);
		GenClass t2 = new GenClass("second", 5);
		GenClass t3 = new GenClass("third", 5);

		t1.start();
		t2.start();
		t3.start();
	}

}
