public class OrderedSuperArray extends SuperArray{
	private int truelength = 0;
	private String[] array;
	public OrderedSuperArray(int x){
		array = new String[x];
	}
	public void add (String e){
		boolean tempboo = true;
		if (truelength == 0){
			super.add(0,e);
			truelength++;
			return;
		}
		if (e.compareTo(get(0))<=0){
			super.add(0,new String(e));
			truelength++;
			return;
		}
		if (e.compareTo(array[truelength-1])>=0){
			super.add(truelength-1,new String(e));
			truelength++;
			return;
		}
		for (int i = 0;i<array.length - 2;i++){
			if (e.compareTo(array[i])>=0 && e.compareTo(array[i+2])<=0){
				super.add(i+1,new String(e));
				truelength++;
				return;
			}
		}
	}
	public Object set (int index, Object o){
		System.out.println("Not available in OrderedSuperArray");
		return null;
	}
	public void add (int index, Object o){
		System.out.println("Not available in OrderedSuperArray");
	}
}