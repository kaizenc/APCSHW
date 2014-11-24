import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver{
	public static void main(String[]args) throws FileNotFoundException{
		WordGrid a = new WordGrid(4,5);
		WordGrid b = new WordGrid(8,8,"words.txt");

		//System.out.println(a);
		//a.addWordHorizontal("add",0,2);
		//System.out.println(a);
		//a.addWordHorizontal("addeds",0,2);
		//a.addWordVertical("dogs",0,1);
		//System.out.println(a);
		//a.addWordDiagonal("cat",1,2);
		//System.out.println(a);
		//a.finalize();
		//System.out.println(a);

		System.out.println(b);
		//System.out.println(b.addWordHorizontal("cat",0,0));
		b.allWords();
		System.out.println(b);
		b.finalize();
		System.out.println(b);
	}
}