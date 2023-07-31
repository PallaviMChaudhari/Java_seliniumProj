package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class FindRepatativeChar {

	public static void main(String[] args) {
		String str="abcdacbbaspdrscppyhbvfghjk";
		
		HashMap<Character, Integer> mp=new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			char temp = str.charAt(i);
			
			if(mp.containsKey(temp)) {
				mp.put(temp, mp.get(temp)+1);
				
			}
			else {
				mp.put(temp, 1);
			}
			
		}
		System.out.println(mp);
		System.out.println("=====================");
		Set<Character> mySet = mp.keySet();
		
		for(Character m:mySet) {
			if(mp.get(m)>1) {
				System.out.println(m+":"+mp.get(m));
			}
			
		}
	

	}

}
