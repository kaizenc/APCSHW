import java.util.*;

public class Driver{
	public static void collapseDuplicates(ArrayList<Integer> L){
		Integer counter = new Integer(0);
		ArrayList<Integer> indeces = new ArrayList<Integer>(3);
		for (int q = 0;q < L.size();q++){
			if (L.get(q) != counter){
				counter = L.get(q);
			}else{
				indeces.add(q);
			}
		}
		for (Integer q:indeces){
			L.remove(L.get(q));
		}
	}
	public static void main(String[]args){
		ArrayList<Integer> a = new ArrayList<Integer>(5);
		a.add(new Integer(1));
		a.add(new Integer(1));
		a.add(new Integer(1));
		a.add(new Integer(2));
		a.add(new Integer(2));
		System.out.println(a);
		collapseDuplicates(a);
		System.out.println(a);
	}
}