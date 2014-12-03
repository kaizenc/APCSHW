import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]data;
    private File bank;
    private Scanner input;
    private Random rand = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private ArrayList<String> wordbank = new ArrayList<String>();
    private boolean finishit = true;

    public WordGrid(int rows,int cols,String filename)throws FileNotFoundException{
        data = new char[rows][cols];
        bank = new File(filename);
        input = new Scanner(bank);
        clear();
    }
    public WordGrid(int rows,int cols,String filename,long randSeed,int answer) throws FileNotFoundException{
        data = new char[rows][cols];
        bank = new File(filename);
        input = new Scanner(bank);
        rand.setSeed(randSeed);
        if (answer == 1){
            finishit = false;
        }
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
        System.out.println(wordsInPuzzle());
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
        if ((dx < -1 || dx > 1 || dy < -1 || dy > 1) || (dx == 0 && dy == 0) || (row+dy < 0) || (col+dx < 0)){
            return false;
        }

        for(int i = 0; i < word.length(); i++){
            if((row+i*dy < 0 || row+i*dy >= data.length) || (col+i*dx < 0 || col+i*dx >= data[0].length) || data[row+i*dy][col+i*dx] != '0' && word.charAt(i) != data[row+i*dy][col+i*dx]){
                return false;
            }
        }
        return true;
    }

    public boolean addWord(String word,int row, int col, int dx, int dy){
        if (checkWord(word,row,col,dx,dy)){
            wordbank.add(word);
            for (int q = 0;q<word.length();q++){
                data[row+q*dy][col+q*dx] = word.charAt(q);
            }
            return true;
        }
        return false;
    }

    public String wordsInPuzzle(){
        String result = "";
        for (Object word : wordbank){
            result+=word;
            result+="\n";
        }
        return result;
    }

    public void setSeed(long seed){
        rand.setSeed(seed);
    }

    public void wordload(){
        while (input.hasNextLine()){
            String a = input.nextLine();
            outerloop:
            for(int i = 0;i<(rand.nextInt(9)+1);i++){
                if(addWord(a,rand.nextInt(data.length),rand.nextInt(data[0].length),rand.nextInt(3)-1,rand.nextInt(3)-1)){
                    break outerloop;
                }
            }
        }
    }

    public void finalize(){
        for (int q = 0;q<data.length;q++){
            for (int p = 0;p<(data[0].length);p++){
                if (data[q][p] == '0'){
                    data[q][p] = alphabet.charAt(rand.nextInt(alphabet.length()));
                }
            }
        }
    }
}