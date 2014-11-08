public class SuperArray{
	private Object[] array;
	private int truelength = 0;
	public SuperArray{
		array = new Object[10];
	}
	public SuperArray(int x){
		array = new Object[x];
	}
	public String toString(){
		String result = "[";
		for (Object e : array){
			if (e != null){
				result = result + e + ", "
			}
		}
		return result
	}
	public void add(Object e){
		truelength++;
		for (int i = 0;i < array.length;i++){
			if(array[i] != null){
				array[i] = e;
				return;
			}
		}
	}
	public int size(){
		return truelength;
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
}