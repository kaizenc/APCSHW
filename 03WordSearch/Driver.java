public class Driver{
	public static void main(String[]args){
		WordGrid a = new WordGrid(5,5);
		System.out.println(a);
		a.addWordHorizontal("add",0,2);
		System.out.println(a);
		a.addWordHorizontal("addeds",0,2);
		a.addWordVertical("dogs",0,1);
		a.addWordDiagonal("cat",2,2);
		System.out.println(a);
	}
}