package day004;

public class MainParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		
		for(int i=0; i<args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+sum/args.length);
	}

}
