import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Countduplicate2 
{

	public static void main(String[] args)
	{
		String [] arr={"sa","aa","na","dm","eu","eu","pm"};
		HashMap<String, Integer> m= new HashMap<String, Integer>();
		for(String a:arr)
		{
			if(!m.containsKey(a))
			{
				m.put(a, 1);
			}
			else
			{
				int count =m.get(a);
				m.put(a, count+1);
			}
		}
		for(Entry<String, Integer> a1:m.entrySet())
		{
			System.out.println(a1.getKey()+" "+a1.getValue());
		}
		}

	
	}


