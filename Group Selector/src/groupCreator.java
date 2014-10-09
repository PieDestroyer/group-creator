import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.io.*;
import java.util.*;


public class groupCreator 
	{
	

	static ArrayList<Students> classRoster = new ArrayList<Students>();
	public static void main(String[] args) throws IOException
		{
		
		 Scanner file = new Scanner( new File( "classroster.txt" ) );
		
		 int numberOfPeople=file.nextInt();
		 
		 for(int i=0;i<numberOfPeople;i++)
			 {
			  String firstName=file.next();
			  String lastName=file.next();
			  double score=file.nextDouble();
			 classRoster.add(new Students(firstName,lastName,score));
			 
			  
			
			 }
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("How many groups are there:");
		 int numberOfGroups=input.nextInt();
		 System.out.println();
		 
		 Collections.sort(classRoster,new ScoreSorter());
		 
		 Collections.sort(classRoster,new NameSorter());
		 
		 
		 public static void counter();
		 {
			 int counter=1;
			 for(int k=0;k<numberOfPeople;k++)
			 {
				 Students.get(k).setStudents(counter);
				 if (counter<numberOfGroups){
					 counter++;
				 }else{
					 counter=1;
				 }
			 }
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
	@Override
	public String toString() {
		return "groupCreator [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	}
