import java.util.ArrayList;

public class Sorts{
    //Identification
    public static String name(){
	return "Castanos,Kaizen";
    }
    public static int period(){
	return 7;
    }
    public static void set(int[]array,int index, int o){
	if (index < 0  || index >= array.length){
	    System.out.println("Error: Index out of range");
	    return;
	} 
	array[index] = o;
    }
    //Sorting
    public static void insertion(int[]array){
	int temp = array[0];
	int q = 0;
	for(int i = 1;i<array.length;i++){
	    temp = array[i];
	    for(q = i - 1;(q>=0) && (array[q]>temp);q--){
		array[q+1] = array[q];
	    }
	    array[q+1] = temp;
	}
    }
    public static void selection(int[]array){
	for (int i = 0;i<array.length;i++){
	    int temp = array[i];
	    int j = i;
	    for (int q = i;q<array.length;q++){
		if(temp>array[q]){
		    temp = array[q];
		    j=q;
		}
	    }
	    array[j] = array[i];
	    array[i] = temp;
	}
    }
    public static void bubble(int[]array){
	boolean test = true;
	int temp = array[0];
	while(test){
	    test = false;
	    for (int i = 0;i<array.length-1;i++){
		if(array[i]>array[i+1]){
		    temp = array[i];
		    array[i] = array[i+1];
		    array[i+1] = temp;
		    test = true;
		}
	    }
	}
    }
    public static void radix(int[]array){
	ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
    }
}