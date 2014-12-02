import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid1{
    private char[][]data;
    private File bank;
    private Scanner input;
    private Random rand = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private ArrayList wordbank = new ArrayList(0);
    private boolean finishit = true;

    public WordGrid1(int rows,int cols,String filename)throws FileNotFoundException{
        data = new char[rows][cols];
        bank = new File(filename);
        input = new Scanner(bank);
        clear();
    }
    public WordGrid1(int rows,int cols,String filename,long randSeed,int answer) throws FileNotFoundException{
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
        if (finishit){
            finalize();
        }
        wordload();
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
        if (dx < -1 || dx > 1 ||dy < -1 || dy > 1){
            return false;
        }
        if (dx == 0 || dy == 0){
            return false;
        }
        if (!(dx == 1 && word.length()+col <= data[0].length)){
            return false;
        }
        if (!(dy == 1 && word.length()+row <= data.length)){
            return false;
        }
        if (!(dx == -1 && word.length() <= col)){
            return false;
        }
        if (!(dy == -1 && word.length() <= row)){
            return false;
        }
        if (!(data[row][col] == 0 || data[row][col] == word.charAt(0))){
            return false;
        }
        return true;
    }

    public boolean addWord(String word,int row, int col, int dx, int dy){
        if (checkWord(word,row,col,dx,dy)){
            wordbank.add(word);
            for (int q = 0;q<word.length();q++){
                data[row+dy][col+dx] = word.charAt(q);
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
            for(int i = 0;i<(rand.nextInt(9)+1);i++){
                if(addWord(a,rand.nextInt(data.length),rand.nextInt(data[0].length),rand.nextInt(data.length),rand.nextInt(data[0].length))){
                    wordbank.add(a);
                    break;
                }
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