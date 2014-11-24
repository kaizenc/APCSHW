import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]data;
    private File bank;
    private Scanner input;
    private Random rand = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     *@param list is the text file of words to put into the grid
     */
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

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
        for (int q = 0;q<data.length;q++){
            for (int p = 0;p<data[q].length;p++){
                data[q][p] = '0';
            }
        }
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
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

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordHorizontal(String word,int row, int col){
        if (data[row][col] != 0 && data[row][col] != word.charAt(0) && word.length()+col <= data[0].length){
            for (int q = 0;q<word.length();q++){
                data[row][col+q] = word.charAt(q);
            }
            return true;
        }
        return false;
    }

    //vertical + diagonal should be implemented as well.

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

    public void allWords(File words){
        while(input.hasNextLine()){
            String line = input.nextLine();
        }
    }

}