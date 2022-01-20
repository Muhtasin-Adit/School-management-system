package pro;

public class Course 
{
	private String nameOfCourse;
	private String courseCode;
	
	public Course()
	{
		
	}
	public Course(String nameOfCourse ,String courseCode)
	{
		this.nameOfCourse = nameOfCourse;
		this.courseCode = courseCode;
		
	}
	public String getNameOfCourse() 
	{
		return nameOfCourse;
	}
	public void setNameOfCourse(String nameOfCourse) 
	{
		this.nameOfCourse = nameOfCourse;
	}
	public String getCourseCode() 
	{
		return courseCode;
	}
	public void setCourseCode(String courseCode) 
	{
		this.courseCode = courseCode;
	}
	@Override
	public String toString()
	{
		return ("name of Course : "+getNameOfCourse()+"\ncourse code : "+getCourseCode());
	}
	
	
	

}
