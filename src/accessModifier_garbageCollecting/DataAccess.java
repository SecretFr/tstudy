package accessModifier_garbageCollecting;

public class DataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(); 
        //d.name="왕눈이"; 
        //System.out.println(d.name); 
        d.setName("왕눈이"); 
        d.setSeason("늦가을"); 
        d.setYear(30); 
         
        System.out.println(d.getName()); 
        System.out.println(d.getSeason()); 
        System.out.println(d.getYear());
	}

}
