import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader( "/Users/arseniartamonov/Documents/romeo-and-juliet.txt")) {
            FileWriter fw = new FileWriter("/Users/arseniartamonov/Documents/HW12.txt");
            int i;
            int length = 0;
            int maxlength = 0;
            StringBuilder theLongestWord = new StringBuilder();
            StringBuilder word = new StringBuilder();
            while ((i = fr.read()) !=-1) {
                if ((char)i>='A'&&(char)i<='z' || (char)i=='\'') {
                    length++;
                   maxlength = Math.max(length, maxlength);
                    word.append((char) i);
                }
                else {
                    if (length==maxlength){
                        theLongestWord.delete(0, theLongestWord.length());
                        theLongestWord.append(word);
                    }
                    word.delete(0, word.length());
                    length = 0;
                }
            }

            System.out.println(theLongestWord.toString());
                fw.write(theLongestWord.toString());
                fw.flush();

        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }
}