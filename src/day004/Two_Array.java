package day004;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {
			{10,20},
			{30,40},
			{50,60}
		};
		
		/* 
        int[][] m2 = new int[3][2]; 
         
        0,0(10)   0,1(20) 
        1,0(30)   1,1(40) 
        2,0(50)   2,1(60) 
         
        m2[0][0] = 10; 
        m2[0][1] = 20; 
        m2[1][0] = 30; 
        m2[1][1] = 40; 
        m2[2][0] = 50; 
        m2[2][1] = 60; 
         
       */
		
		for (int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("m["+i+"]n["+j+"]="+m[i][j]);
			}
		}
	}

}
