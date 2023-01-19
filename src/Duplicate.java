import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate {

	

	public static void main(String[] args) 
	{
		String [] s={"ma","hi","bye","hi","ma"};
		HashMap<String, Integer> m= new HashMap<String, Integer>();
		for(String b:s)
		{
			if(!m.containsKey(b))
			{
				m.put(b, 1);
			}
			else
			{
				int count=m.put(b, 1);
				 m.put(b, count+1);
			}
			for(Entry<String, Integer> a1:m.entrySet());
			{
				System.out.println(b);
			}
				
			}
		}
		 

}
