package ByValue_Ref;

class Pay{
	int ppp;
	public void payRefer(Pay a) {
		a.ppp = a.ppp + 2000;
	}
	public void payValue(int j) {
		j = j+2000;
	}
}

public class PayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay p = new Pay();
		p.ppp = 10;
		
		int i = 10;
		
		p.payRefer(p); // call by reference
		p.payValue(i); // call by value
		
		System.out.println(p.ppp);
		System.out.println(i);
	}

}
