import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver{
	public static void main(String[]args) throws FileNotFoundException{
		File words = new File("words.txt");
		Scanner input = new Scanner(words);
		WordGrid a = new WordGrid(4,5);

		System.out.println(a);
		a.addWordHorizontal("add",0,2);
		System.out.println(a);
		a.addWordHorizontal("addeds",0,2);
		a.addWordVertical("dogs",0,1);
		System.out.println(a);
		a.addWordDiagonal("cat",1,2);
		System.out.println(a);
		a.finalize();
		System.out.println(a);
	}
}