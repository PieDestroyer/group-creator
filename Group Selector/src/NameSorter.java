import java.util.Comparator;
public class NameSorter implements Comparator<students>
	{
	public int compare(students s1, students s2)
		{
		return s1.getLastName().compareTo(s2.getLastName());
		}
	}
