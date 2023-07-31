package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class StudyOfHashMap {

	public static void main(String[] args) {
		HashMap< Integer, String> rtoNum=new HashMap<>();
		
		rtoNum.put(39, "Nanudurbar");
		rtoNum.put(12, "Pune");
		rtoNum.put(13, "Solapur");
		rtoNum.put(1, "Mumbai");
		rtoNum.put(14, "Nashik");
		System.out.println(rtoNum.get(39));
		System.out.println(rtoNum.containsKey(12));
		System.out.println(rtoNum.containsValue("Nashik"));
		System.out.println(rtoNum);
		System.out.println(rtoNum.containsValue("Dhule"));
		
		Set<Integer> rtoSet = rtoNum.keySet(); 
		
		for(Integer m:rtoSet) {
			System.out.println(m+":"+rtoNum.get(m));
			
		}
	}

}
