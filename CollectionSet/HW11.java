package CollectionSet;

import java.util.HashSet;

class Hashset{
	
	HashSet hs=new HashSet();
	
	
	void add(){
		
		hs.add("Deepak");
		hs.add("Raj");
		hs.add("Kajal");
		hs.add("Pooja");
		
		System.out.println(hs);
	}
	
	void remove(){
		
		hs.remove(hs);
		
		
		
		
		System.out.println(hs.remove("Deepak"));
		
		System.out.println();
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
	}
	
		
	
}
public class HW11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashset hs=new Hashset();
		hs.add();
		hs.remove();
	}

}
