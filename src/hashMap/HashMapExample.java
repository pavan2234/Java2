package hashMap;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"Pavan");
	map.put(2, "Ram");
	map.put(3, "Hash"); 
	
	   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	   HashMap<Integer,String> map1=new HashMap<Integer,String>();  
	      map1.put(104,"Ravi");  
	      map1.putAll(map);  
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map1.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());  
	}

	}
}
