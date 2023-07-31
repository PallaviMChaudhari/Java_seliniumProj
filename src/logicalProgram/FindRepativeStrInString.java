package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class FindRepativeStrInString {

	public static void main(String[] args) {
		String str="abc pqr abc lmn xyz pqr pqr lmn";
		
		String[] st = str.split(" ");
		
		HashMap<String, Integer> mp=new HashMap<>();
		
		for(int i=0;i<=st.length-1;i++) {
			String temp = st[i];
			if(mp.containsKey(temp)) {
				mp.put(temp, mp.get(temp)+1);
			}
			else {
				mp.put(temp, 1);
			}
			
		}
		
		System.out.println(mp);
		System.out.println("====================");
		
		Set<String> mySet = mp.keySet();
		for(String m:mySet) {
			System.out.println(m+":"+mp.get(m));
		}
		System.out.println("======>2===============");
		for(String m:mySet) {
			if(mp.get(m)>2) {
				System.out.println(m+":"+mp.get(m));
			}
			
		}

	}

}
