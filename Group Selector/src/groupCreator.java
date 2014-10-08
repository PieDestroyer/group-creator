import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.io.*;
import java.util.*;


public class groupCreator 
	{
	

	static ArrayList<students> classRoster = new ArrayList<students>();
	public static void main(String[] args) throws IOException
		{
		
		 Scanner file = new Scanner( new File( "classroster.txt" ) );
		
		 int numberOfPeople=file.nextInt();
		 for(int i=0;i<numberOfPeople;i++)
			 {
			  String firstName=file.next();
			  String lastName=file.next();
			  double score=file.nextDouble();
			 classRoster.add(new students(firstName,lastName,score));
			 
			  
			 //System.out.println(groupCreator);
			// System.out.print(file.next()+" ");
			// System.out.println(file.next());
			// System.out.println(file.nextInt());
			// System.out.println(students.getFirstName());
			 }
		 
		 
		
		 Collections.sort(classRoster,new ScoreSorter());
		 
		 Collections.sort(classRoster,new NameSorter());
		 
		 
		 
//		import comparator(done)
//		instantiate array(done)
//		instantiate scanner(done)
//		create variables
//			firstName, LastName, Score(done)
//			
//		Main method name
//
//		create for loop for number of people
//			1-number of people
//
//		create constructor
//			firstName-file.next()
//			LastName-file.next()
//			Score-file.nextDouble()
//		create getters and setters(done)
//		(from .txt file imported from edmodo)(done)
//			
//		compare scores for sorting
//
//		create new array for scores
//
//		Ask how many groups there are
//		put scores into groups of how ever many groups they said
//		alphabetize new group of scores by last name
//
//		needed Collections.sort(classRoster, new ScoreSorter());

		}
	@Override
	public String toString()
		{
		return "groupCreator []";
		}

	}
