package CollectionSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class TreesetHashset{
	
	HashSet hs=new HashSet();
	  
	
	void add()
	{
		hs.add("Deepak");
		hs.add("Raj");
		hs.add("kajal");
		hs.add("pooja");
		
		System.out.println("HASHSET"+hs);
	}
	
	
	void treeset() {
		
		Set<String> hashSetToTreeSet 
	    = new TreeSet<>(hs); 

				{
					
					System.out.println("treeset"+hashSetToTreeSet );
					
				}
		
		
		
	}
	
	
}
public class HW13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreesetHashset trsh=new TreesetHashset();
		
		trsh.add();
		trsh.treeset();
		
	}

}
