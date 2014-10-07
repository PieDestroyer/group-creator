import java.util.Scanner;
import java.util.Comparator;
import java.io.*;
import java.util.*;


public class groupCreator 
	{
	

	
	public static void main(String[] args) throws FileNotFoundException
		{
		 Scanner file = new Scanner( new File( "classroster.txt" ) );
		
		
		 int numberOfPeople=file.nextInt();
		 for(int i=0;i<numberOfPeople;i++)
			 {
		 System.out.println(i);
			 }
		 
		 
		 
		 
		 
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

	}
