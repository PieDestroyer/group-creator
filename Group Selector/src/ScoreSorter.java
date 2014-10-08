import java.util.Comparator;
public class ScoreSorter implements Comparator <students>
	{
	public int compare (students s1, students s2)
		{
		if ( s1.getScore()<s2.getScore())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		}
	}
