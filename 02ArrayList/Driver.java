public class Driver{
	public static void main(String[]args){
		a = new ArrayList<Integer>(5);
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