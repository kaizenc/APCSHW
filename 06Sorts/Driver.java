import java.util.Arrays;
public class Driver{
	public static void main(String[]args){
		int[] a = new int[]{3,6,0,-5,39,4};
		System.out.println(Arrays.toString(a));
		Sorts.insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}