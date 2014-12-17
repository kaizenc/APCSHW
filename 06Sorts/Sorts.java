public class Sorts{
	public static void set(int[]array,int index, int o){
		if (index < 0  || index >= array.length){
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
			int temp = array[q];
			while(q > 0 && array[q]<array[q-1]){
				set(array,q,array[q-1]);
				q--;
			}
			set(array,q,temp);
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
}