package _exception;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매개변수로 받은 두 개의 값");
		int a = 10; // 문자열 값을 정수로 변환
		int b = 0;


		try {
			System.out.println(" a = " + a + " b = " + b);
			System.out.println(" a를 b로 나눈 몫 = " + (a / b));

		} catch (Exception e) {
			System.out.println("[경고]예외발생:" + e.toString());
		} finally {
			System.out.println("나눗셈 연산이 종료 되었습니다.");
		}

		System.out.println("나머지 루틴을 정상적으로 실행합니다.");
	}

}
