public class GradeBookTest
{
	public static void main( String[] args )
	{
		GradeBook gradeBook1 = new GradeBook( 
			"CS101 Introduction to Java Programming", "Homer Simpson");
		GradeBook gradeBook2 = new GradeBook(
			"CS102 Data Structures in Java", "Homer Simpson");
		
		System.out.printf( "gradeBook1 course name is: %s\n",
			gradeBook1.getCourseName());
		System.out.printf( "gradeBook2 course name is: %s\n",
			gradeBook2.getCourseName());
		
		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
	}
}