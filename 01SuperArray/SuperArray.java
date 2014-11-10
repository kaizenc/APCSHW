public class SuperArray{
	private Object[] array;
	private int truelength = 0;
	//constructors
	public SuperArray(){
		array = new Object[10];
	}

	public SuperArray(int x){
		array = new Object[x];
	}
	//toString
	public String toString(){
		String result = "[ ";
		for (Object e : array){
			if (e != null){
				result = result + e + " ";
			}
		}
		return result + "]";
	}
	//Getters
	public int size(){
		return truelength;
	}

	public Object get(int index){
		if (index < 0  || index >= array.length - 1){
			System.out.println("Error: Index out of range");
			return null;
		}
		return array[index];
	}
	//Mutators
	public Object set(int index, Object o){
		if (index < 0  || index >= size()){
			System.out.println("Error: Index out of range");
			return null;
		}
		Object result = array[index]; 
		array[index] = o;
		return result;
	}

	public void add(Object e){
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

	public void add(int index, Object e){
		if (truelength == array.length){
			resize(array.length + 1);
		}
		if (index > array.length){
			System.out.println("Error: Index out of range");
			return;
		}
		Object[] temparray = new Object[array.length];
		System.arraycopy(array, 0, temparray, 0, index+1);
		for (int i = index;i < array.length-1;i++){
			temparray[i+1] = array[i];
		}
		array = temparray;
		array[index] = e;
	}

	public void resize(int newsize){
		Object[] temparray = new Object[newsize];
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
}