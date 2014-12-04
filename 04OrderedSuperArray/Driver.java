public class Driver{
	public static void main(String[]args){
		SuperArray a = new SuperArray(1);
		a.add("apple");
		a.add("donkey");
		a.add("bronco");
		a.add("clock");
		System.out.println(a);
		System.out.println(a.size());
		a.insertionSort();
		System.out.println(a);
	}
}