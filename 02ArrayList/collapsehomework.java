import java.util.*;

public class collapsehomework{
	public void collapseDuplicates(ArrayList<Integer> L){
		Integer counter = new Integer(0);
		for (Integer q:L){
			if (q != counter){
				counter = q;
			}else{
				L.remove(q);
			}
		}
	}
}