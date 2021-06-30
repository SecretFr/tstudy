package corejava;

import java.text.DecimalFormat;

//import java.text.*; 

public class PackTest {

	public static void main(String[] args) {
		// java.lang 패키지는 자동으로 import됨으로
		// import문을 명시할 필요가 없습니다.
		String su = "2000000";
		int isu = Integer.parseInt(su);
		System.out.println(isu);

		DecimalFormat df = new DecimalFormat("#,##0");
		String str = df.format(isu);
		System.out.println("\\ " + str);
	}
}