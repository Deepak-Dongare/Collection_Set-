package CollectionSet;
import java.util.Collections;
import java.util.TreeSet;

class Treeset{
	
	
	TreeSet ts=new TreeSet<>();
	void add()
	{
	
		
	ts.add("Deepak");
	ts.add("RAJ");
	ts.add("SUNIL");
	ts.add("POOJA");
	ts.add("KAJAL");
	
	System.out.println(ts);
	}
	
	void remove(){
		
		ts.remove("Deepak");
		
		System.out.println(ts);
	}
	
	
	
	
}
public class HW10 {
	
	public static void main(String[] args) {
		
		Treeset ts=new Treeset();
		ts.add();
		
		
		ts.remove();
		
	}

}
