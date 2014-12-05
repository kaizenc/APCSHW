public class SuperArray{
	private String[] array;
	private int truelength = 0;
    //constructors
	public SuperArray(){
		array = new String[10];
	}

	public SuperArray(int x){
		array = new String[x];
	}
    //toString
	public String toString(){
		String result = "[ ";
		for (String e : array){
	    result = result + e + " ";
	  }
	  return result + "]";
	}
    //Getters
	public int size(){
		return truelength;
	}

	public String get(int index){
		if (index < 0  || index >= array.length - 1){
			System.out.println("Error: Index out of range");
			return null;
		}
		return array[index];
	}
    //Mutators
	public String set(int index, String o){
		if (index < 0  || index >= size()){
			System.out.println("Error: Index out of range");
			return null;
		}
		String result = array[index]; 
		array[index] = o;
		return result;
	}

	public void add(String e){
		truelength++;
		for (int i = 0;i < array.length;i++){
			if(array[i] == null){
				array[i] = e;
				return;
			}
		}
		resize(array.length + 1);
		array[array.length - 1] = e;
	}

	public void add(int index, String e){
		if (truelength == array.length){
			resize(array.length + 1);
		}
		if (index > array.length){
			System.out.println("Error: Index out of range");
			return;
		}
		String[] temparray = new String[array.length];
		System.arraycopy(array, 0, temparray, 0, index+1);
		for (int i = index;i < array.length-1;i++){
			temparray[i+1] = array[i];
		}
		array = temparray;
		array[index] = e;
	}

	public void remove(int index){
		resize(truelength);
		array[index] = null;
		String[] temparray = new String[array.length];
		boolean passednull = false;
		for (int i = 0;i < array.length;i++){
			if (array[i] == null){
				passednull = true;
			}
			if (passednull){
				temparray[i-1] = array[i];
			}else{
				temparray[i] = array[i];
			}
		}
	}

	public void resize(int newsize){
		String[] temparray = new String[newsize];
		int smaller = array.length;
		if (newsize < array.length){
			smaller = newsize;
		}
		for (int i = 0;i < smaller;i++){
			temparray[i] = array[i];
		}
		array = temparray;
	}

	public void clear(){
		for (int i = 0;i<array.length;i++){
			array[i] = null;
		}
		truelength = 0;
	}
    //Sorting
	public void insertionSort(){
		for(int i = 1;i<truelength;i++){
			int q = i;
			String temp = array[q];

			while(q > 0 && temp.compareTo(array[q-1]) < 0){
				set(q,array[q-1]);
				q--;
			}
			set(q,temp);
		}
	}
    public void selectionSort(){
	for (int i = 0;i<truelength;i++){
	    String temp = array[i];
	    int j = 0;
	    for (int q = i;q<truelength;q++){
		if(temp.compareTo(array[q])>0){
		    temp = array[q];
		    j=q;
		}
	    }
	    array[j] = array[i];
	    array[i] = temp;
	}
    }
}