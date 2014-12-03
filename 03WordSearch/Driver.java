import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver{
	public static void main(String[]args) throws FileNotFoundException{
		WordGrid w = new WordGrid(5,5,"words.txt");
		boolean asdf = true;
		if (args.length < 2){
			System.out.println("\nHow to use:");
			System.out.println("java Driver [rows] [cols] [seed(optional) [answers(optional)]]");
			System.out.println("rows, cols, and seed must all be integers");
			System.out.println("For answers, enter 1 to reveal or leave it blank otherwise");
			return;
		}
		if (args.length == 2){
			w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt");
		}
		if (args.length == 3){
			w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt",Long.parseLong(args[2]),0);
		}
		if (args.length == 4){
			w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt",Long.parseLong(args[2]),Integer.parseInt(args[3]));
			if (Integer.parseInt(args[3]) == 1){
				asdf = false;
			}
		}
		w.wordload();
		if (asdf){
			w.finalize();
		}
		System.out.println(w);
	}
}