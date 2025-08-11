package collectionsday2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapeg {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		//An object that maps keys to values
		//A map cannot contain duplicate keys
		//each key can map to at most one value
		//ordering it is sorted based on the keys
		//values can be duplicated
		//only one null as key is allowed
		//multiple null values are allowed
		map.put(1, "sindhu");
		map.put(2, "akhila");
		map.put(null, null);
		map.put(3, "aruna");
		map.put(2, "akhil");
		map.put(null, "aruna");
		
		//converting map to set
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
