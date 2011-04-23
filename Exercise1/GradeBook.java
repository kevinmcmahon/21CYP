public class GradeBook
{
	private String mCourseName;
	private String mInstructorName;
	
	public GradeBook( String courseName, String instructorName)
	{
		mCourseName = courseName;
		mInstructorName = instructorName;
	}
	
	public void setCourseName( String name)
	{
		mCourseName = name;
	}
	
	public String getCourseName()
	{
		return mCourseName;
	}
	
	public void setInstructorName( String name)
	{
		mInstructorName = name;
	}
	
	public String getInstructorName()
	{
		return mInstructorName;
	}
	
	
	public void displayMessage()
	{
		System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
		System.out.printf( "This course is presented by: %s\n", getInstructorName() );
	}
}