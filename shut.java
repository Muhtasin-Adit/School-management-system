package pro;

public class shut 
{

	public static void main(String[] args) 
	{
		
		Course c1 = new Course("Programming Language 2", "215");   
		Course c2 = new Course("Programming Language 1", "115");
		Course c3 = new Course("Data Structures and Algorithms", "225");
		Course c4 = new Course("Microprocessors", "331");
		Course c5 = new Course("Database Management", "311");
		Course c6 = new Course("Operating Systems", "323");
		Course c7 = new Course("DLD", "231");
		
		Student st1 = new Student("Dave Mustaine",23,"mirpur, Dhaka-1216",3.1,"16112839234");  
		
		st1.addCourse(c1);    
		st1.addCourse(c2);
		st1.addCourse(c3);
		st1.addCourse(c4);
		st1.addCourse(c5);
		
		System.out.println(st1.toString()+"\n\n");
		st1.printCourses();
		
		st1.addCourse(c6);
		st1.addCourse(c7);
		
		System.out.println(st1.toString()+"\n\n");
		st1.printCourses();
		
		Student st2 = new Student("Dimebag",24,"Dhanmondi, Dhaka-1207",2.4,"1712184642");
		
		st2.addCourse(c2);
		st2.addCourse(c3);
		st2.addCourse(c4);
		st2.addCourse(c5);
		st2.addCourse(c6);
		
		System.out.println(st2.toString());
		st2.printCourses();
		
		Faculty pf1 = new PermanentFaculty("Slash",30,"Mirpur");
		
		pf1.addCourse(c1);
		pf1.addCourse(c2);
		pf1.addCourse(c3);
		pf1.addCourse(c4);
				
		pf1.toString();
		
		pf1.addCourse(c5);
		pf1.addCourse(c6);
		pf1.addCourse(c7);
		pf1.addCourse(c1);
		
		System.out.println(pf1.toString());
		pf1.printCourses();
		
		Faculty vf1 = new VisitingFaculty("ozzy",28,"RA");
		
		vf1.addCourse(c1);
		vf1.addCourse(c2);
		vf1.addCourse(c3);
		
		System.out.println(vf1.toString());
		vf1.printCourses();
		
		
		
		
		
		
		

	}

}
