public class Driver{
	public static void main(String[]args){
		SuperArray a = new SuperArray(1);
		a.add("apple");
		a.add("donkey");
		a.add("bronco");
		a.add("clock");
		System.out.println(a);
		a.insertionSort();
		System.out.println(a);
	}
}