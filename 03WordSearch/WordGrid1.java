import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid1{
    private char[][]data;
    private File bank;
    private Scanner input;
    private Random rand = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public WordGrid1(int rows,int cols){
        data = new char[rows][cols];
        clear();
    }
    public WordGrid1(int rows,int cols,String list,int RandSeed) throws FileNotFoundException{
        data = new char[rows][cols];
        bank = new File(list);
        input = new Scanner(bank);
        rand.setSeed(RandSeed);
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

    public boolean checkWord(String word,int row,int col,int dx,int dy){
        if (dx < -1 || dx > 1 ||dy < -1 || dy > 1){
            return false;
        }
        if (dx == 0 || dy == 0){
            return false;
        }
        if (!(data[row][col] == 0 || data[row][col] == word.charAt(0))){
            return false;
        }
    }

    public boolean addWord(String word,int row, int col, int dx, int dy){
        if (checkWord(word,row,col,dx,dy)){
            for (int q = 0;q<word.length();q++){
                data[row+dy][col+dx] = word.charAt(q);
            }
        }
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