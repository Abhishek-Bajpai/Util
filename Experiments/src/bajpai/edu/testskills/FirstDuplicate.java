package bajpai.edu.testskills;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public static int firstDuplicate(int[] a) {
	    
	    if(a.length == 0|| a == null)
	        return -1;
	Map<Integer,Integer> myMap = new HashMap();
	    for(int i=0;i<a.length;i++){
	        if(myMap.containsKey(a[i]))
	            return a[i];
	        else
	            myMap.put(a[i],i);
	    }
	    return -1;
	}


	
	char firstNotRepeatingCharacter(String s) {

	    char[] chr = s.toCharArray();
	    HashMap<Character,Integer> myLinkedHashMap = new LinkedHashMap();
	    for(int i=0;i<chr.length;i++){
	        if(myLinkedHashMap.containsKey(chr[i]))
	            myLinkedHashMap.put(chr[i],myLinkedHashMap.get(chr[i])+1);
	        else
	            myLinkedHashMap.put(chr[i],1);
	            
	        System.out.println(myLinkedHashMap.toString());
	    }
	    
	    for(Map.Entry<Character,Integer> entry : myLinkedHashMap.entrySet())
	    {
	        if(entry.getValue()==1)
	            return entry.getKey();
	    }
	    return '_';
	}
}
