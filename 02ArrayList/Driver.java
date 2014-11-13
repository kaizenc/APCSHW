import java.util.*;

public class Driver{
	public static void collapseDuplicates(ArrayList<Integer> L){
		int counter = 0;
		ArrayList<Integer> indeces = new ArrayList<Integer>(10);
		for (int q = 0;q < L.size();q++){
			System.out.println("-----");
			System.out.println(L.get(q));
			System.out.println(counter);
			System.out.println(L.get(q) == counter);
			if (L.get(q) == counter){
				indeces.add(q);
			}else{
				counter = L.get(q);
			}
			System.out.println(counter);
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