package pro;

public class Student extends Person
{
	private double cgpa;
	private String id;
	private Course[] courses = new Course[6] ;
	private int numberOfCourses ;
	
	
	public Student()
	{
		
	}
	public Student(String name,int age,String address,double cgpa,String id)
	{
		super(name,age,address);
		this.cgpa = cgpa ;
		this.id = id ;
	}
	public double getCgpa() 
	{
		return cgpa;
	}
	public void setCgpa(double cgpa) 
	{
		this.cgpa = cgpa;
	}
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public Course[] getCourses()
	{
		return courses ;
	}
	public int getNumberOfCourses()
	{
		return numberOfCourses;
	}
	public void addCourse(Course newCourse)
	{
		if(this.cgpa<=4.00 && this.cgpa>=2.5)
		{
			if(numberOfCourses<6)
			{
				this.courses[numberOfCourses] = newCourse;
				numberOfCourses++;
			}
			else
			{
				System.out.println("\n\nYou are not allowed to take more than 6 courses..\n");
			}
		}
		else if(this.cgpa>=0.0 && this.cgpa<2.5)
		{
			if(numberOfCourses<=3)
			{
				this.courses[numberOfCourses] = newCourse;
				numberOfCourses++;
			}
			else
			{
				System.out.println("\n\nYou are not allowed to take more than 4 courses..\n\n");
			}
		}
		else
		{
			System.out.println("Invalid input...");
		}
	}
	
	public void printCourses()
	{
		for(Course course : courses)
		{
			if(course ==null) 
			{
				break;
			}
			System.out.println(course);
		}
		
	}
	@Override
	public String toString()
	{
		return ("name : "+getName()+"\nage : "+getAge()+"\naddress :"+getAddress()+"\ncgpa : "+getCgpa()+"\nid : "+getId());
	}
	
	
	

}
