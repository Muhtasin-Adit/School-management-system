package pro;

public class VisitingFaculty extends Faculty
{
	private double BASIC_SALARY = 4000;
	private Course[] courses = new Course[4];
	private int numberOfCourses;
	
	public VisitingFaculty()
	{
		
	}
	public VisitingFaculty(String name,int age,String address)
	{
		super(name,age,address);
	}
	public void addCourse(Course newCourse)
	{
		if(numberOfCourses<=2)
		{
			this.courses[numberOfCourses] = newCourse;
			numberOfCourses++;
		}
		else
		{
			System.out.println("\n\nYou are not allowed to take anymore courses..\n\n");
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
	public int getNumberOfCourses()
	{
		return numberOfCourses;
	}
	public double getSalary()
	{
		return BASIC_SALARY+(getNumberOfCourses()*(20/100));
	}
	@Override
	public String toString()
	{
		return ("\n\nname : "+getName()+" \nage : "+getAge()+" \naddress : "+getAddress()+" \nsalary : "+getSalary());
	}

}
