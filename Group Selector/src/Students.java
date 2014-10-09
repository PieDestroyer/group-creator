import java.util.Scanner;
import java.util.Comparator;
import java.io.*;
import java.util.*;

public class Students
	{

	private String firstName;
	private String lastName;
	private double score;
	private String Students;

	

	public Students(String firstName, String lastName, double score)
		{
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
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
	public String getStudents(){
		return firstName+" "+lastName+" "+score;
	}
	
	@Override
	public String toString(){
		return getStudents(); 
	}
//	public static void main(String[] args) throws IOException
//		{
//		 
//
//		ArrayList classRoster=new ArrayList(); 
//		Scanner file = new Scanner(new File("classroster.txt"));
//		
//	    
//		// classRoster.add(new students(classroster.txt));
//		}
	}
