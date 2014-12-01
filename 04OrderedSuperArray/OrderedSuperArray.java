public class OrderedSuperArray extends SuperArray{
    public void add (Object e){
	truelength++;
	boolean tempboo = true;
	for (int i = 0;i<array.length - 2;i++){
	    if (e.compareTo(array[i])>0 && e.compareTo(array[i+2])<0){
		//add it at i+1
	    }
	}
    }
    public void set (int index, Object o){
	System.out.println("Not available in OrderedSuperArray");
    }
    public void add (int index, Object o){
	System.out.println("Not available in OrderedSuperArray");
    }
}