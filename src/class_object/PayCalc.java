package class_object;

class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;
}

public class PayCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.bonbong = 2000000;
		p1.name = "왕눈이";
		p1.tax = (int)(p1.bonbong*0.045+0.5);
		p1.silsu = p1.bonbong - p1.tax;
		
		p2.bonbong = 2500000; //250만원 
        p2.name = "아로미"; 
        p2.tax = (int)(p2.bonbong * 0.045 + 0.5); 
        p2.silsu = p2.bonbong - p2.tax; 
         
        p3.bonbong = 1500000; //150만원 
        p3.name = "투투"; 
        p3.tax = (int)(p3.bonbong * 0.005 + 0.5); 
        p3.silsu = p3.bonbong - p3.tax; 
         
        System.out.println("--------------------"); 
        System.out.println("---12월 급여 내역---"); 
        System.out.println("--------------------"); 
        System.out.println("성명: " + p1.name); 
        System.out.println("본봉: " + p1.bonbong); 
        System.out.println("세금: " + p1.tax); 
        System.out.println("실수령액: " + p1.silsu); 

        System.out.println("--------------------"); 
        System.out.println("---12월 급여 내역---"); 
        System.out.println("--------------------"); 
        System.out.println("성명: " + p2.name); 
        System.out.println("본봉: " + p2.bonbong); 
        System.out.println("세금: " + p2.tax); 
        System.out.println("실수령액: " + p2.silsu); 

        System.out.println("--------------------"); 
        System.out.println("---12월 급여 내역---"); 
        System.out.println("--------------------"); 
        System.out.println("성명: " + p3.name); 
        System.out.println("본봉: " + p3.bonbong); 
        System.out.println("세금: " + p3.tax); 
        System.out.println("실수령액: " + p3.silsu);
	}

}
