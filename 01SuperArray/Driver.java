public class Driver{
	public static void main(String[]args){
		SuperArray a = new SuperArray;
		a.add(new Integer(1));
		a.add(new String("Two"));
		a.add(new Char('c'));
		System.out.println(a);
		System.out.println(a.size());
		a.resize(1);
		System.out.println(a);
	}
}