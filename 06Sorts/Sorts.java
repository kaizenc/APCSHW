public class Sorts{
    public static void set(int index, int o){
	if (index < 0  || index >= size()){
	    System.out.println("Error: Index out of range");
	    return;
	} 
	array[index] = o;
    }
    //Sorting
    public static void insertionSort(int[]array){
	int truelength = array.length;
	for(int i = 1;i<truelength;i++){
	    int q = i;
	    while(q > 0 && array[q]<array[q-1]){
		set(q,array[q-1]);
		q--;
	    }
	    set(q,temp);
	}
    }
    public static void selectionSort(int[]array){
	int truelength = array.length;
	for (int i = 0;i<truelength;i++){
	    int temp = array[i];
	    int j = i;
	    for (int q = i;q<truelength;q++){
		if(array[i]>array[q]){
		    temp = array[q];
		    j=q;
		}
	    }
	    array[j] = array[i];
	    array[i] = temp;
	}
    }
    public static void bubbleSort(int[]array){
	int truelength = array.length;
	for(int i = truelength;i>truelength;i--){
	    int temp = array[i];
	    int j = i;
	    for (int q = i;q<truelength;q++){
		if(array[q]>array[q+1]){
		    temp = array[q];
		    array[q] = array[q+1];
		    array[q+1] = temp;
		}
	    }
	}
    }
}