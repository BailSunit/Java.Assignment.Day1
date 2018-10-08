package collection.demo.list;

public class TestStudent {

	public static void main(String [] args) {
		
		Student s1= new Student();
		s1.setId(194);
		s1.setName("Gurmeet Tripathi");
		s1.setEmail("gurmarocks@hotmail.com");
		s1.setAadhaar("824792652272");
		
		System.out.println(s1.hashCode());
		
		Student s2= new Student();
		s2.setId(893);
		s2.setName("Neha Karbanda");
		s2.setEmail("karbanda.neha@gmail.com");
		s2.setAadhaar("237423923926");
		
		System.out.println(s2.hashCode());
	}
}
