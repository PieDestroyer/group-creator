import java.util.Scanner;
import java.util.Comparator;
import java.io.*;
import java.util.*;

public class students
	{

	private String firstName;
	private String lastName;
	private double score;

	

	public students(String fN, String lN, double s)
		{
		firstName = fN;
		lastName = lN;
		score = s;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public double getScore()
		{
		return score;
		}
	
	public void setFirstName(String firstName)
		{
		this.firstName=firstName;
		}
	
	public void setLastName(String lastName)
		{
		this.lastName=lastName;
		}

	public void setScore(double score)
		{
		this.score=score;
		}
	public static void main(String[] args) throws IOException
		{
		

		ArrayList classRoster=new ArrayList(); 
		Scanner file = new Scanner(new File("classroster.txt"));
		
	    
		// classRoster.add(new students(classroster.txt));
		}
	}
