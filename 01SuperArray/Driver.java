public class Driver{
	public static void main(String[]args){
		SuperArray a = new SuperArray(1);
		a.add(new Integer(1));
		a.add(new String("Two"));
		a.add(new Integer(3));
		System.out.println(a);
		System.out.println(a.size());
		a.resize(1);
		System.out.println(a);
		a.add(new String("Two"));
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.get(0));
		a.resize(4);
		System.out.println(a);
		a.add(2,new String("Whatisthis"));
		System.out.println(a);
	}
}