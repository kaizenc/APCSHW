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
		SuperArray b = new SuperArray(1);
		b.add("donkey");
		b.add("clock");
		b.add("apple");
		b.add("bronco");
		System.out.println(b);
		b.selectionSort();
		System.out.println(b);
	}
}