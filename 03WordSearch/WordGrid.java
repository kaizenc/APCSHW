import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]data;
    private File bank;
    private Scanner input;
    private Random rand = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public WordGrid(int rows,int cols){
        data = new char[rows][cols];
        clear();
    }
    public WordGrid(int rows,int cols,String list) throws FileNotFoundException{
        data = new char[rows][cols];
        bank = new File(list);
        input = new Scanner(bank);
        clear();
    }

    private void clear(){
        for (int q = 0;q<data.length;q++){
            for (int p = 0;p<data[q].length;p++){
                data[q][p] = '0';
            }
        }
    }

    public String toString(){
        String result = "";
        for (int q = 0;q<data.length;q++){
            for (int p = 0;p<(data[q].length);p++){
                result += data[q][p] + " ";
            }
            result+="\n";
        }
        return result;
    }

    public boolean addWordHorizontal(String word,int row, int col){
        if (data[row][col] != 0 && data[row][col] != word.charAt(0) && word.length()+col <= data[0].length){
            for (int q = 0;q<word.length();q++){
                data[row][col+q] = word.charAt(q);
            }
            return true;
        }
        return false;
    }

    public boolean addWordVertical(String word,int row, int col){
        if (data[row][col] != 0 && data[row][col] != word.charAt(0) && word.length()+row <= data.length){
            for (int q = 0;q<word.length();q++){
                data[row+q][col] = word.charAt(q);
            }
            return true;
        }
        return false;
    }

    public boolean addWordDiagonal(String word,int row, int col){
        if (data[row][col] != 0 && data[row][col] != word.charAt(0) && word.length()+row <= data.length && word.length()+col <= data[0].length){
            for (int q = 0;q<word.length();q++){
                data[row+q][col+q] = word.charAt(q);
            }
            return true;
        }
        return false;
    }

    public void finalize(){
        for (int q = 0;q<data.length;q++){
            for (int p = 0;p<(data[q].length);p++){
                if (data[q][p] == '0'){
                    data[q][p] = alphabet.charAt(rand.nextInt(alphabet.length()));
                }
            }
        }
    }
}