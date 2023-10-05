package map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

				
	Map<Integer,String> map =	new LinkedHashMap<Integer,String>();
	
				map.put(103,"Adam");
				map.put(102, "Smith");
				map.put(104,"Brown");
				map.put(101, "Don");
				map.put(59, "Smith");
				map.put(103, "Javeed");
				
				System.out.println(map);
				
				System.out.println("All Keys, Values from Map");
				Set<Integer> keySet =	map.keySet();
				
				Iterator<Integer> it = keySet.iterator();
				
				while (it.hasNext()) {
					Integer key =  it.next();
					System.out.println(key +"  "+map.get(key));
					
				}
				
				System.out.println("All Values from Map");
				
			Collection<String> values =	map.values();
			
				for(String s:values) {
					
					System.out.println(s);
					
				}
				
				
				
Map<Product,Integer> map2 =
            new  TreeMap<Product,Integer>(new ProductComparator());
		
				map2.put(new Product(20,"Mobile"), 50000);
				map2.put(new Product(10,"Laptop"), 70000);
				map2.put(new Product(30,"Charger"), 6000);
				map2.put(new Product(40,"PowerBank"), 3000);
				
				System.out.println(map2);
				
		
	}

}
