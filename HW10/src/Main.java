import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        if (str1.length() <= str2.length() && str1.length() <= str3.length()) {
            System.out.println(str1 + " " + str1.length());
        } else if (str2.length() <= str1.length() && str2.length() <= str3.length()) {
            System.out.println(str2 + " " + str2.length());
        } else System.out.println(str3 + " " + str3.length());

        if (str1.length() >= str2.length() && str1.length() >= str3.length()) {
            System.out.println(str1 + " " + str1.length());
        } else if (str2.length() >= str1.length() && str2.length() >= str3.length()) {
            System.out.println(str2 + " " + str2.length());
        } else System.out.println(str3 + " " + str3.length());

        System.out.println("Task 2");
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        str3 = scanner.nextLine();
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) return -1;
            else return 0;
        });
        System.out.println(Arrays.toString(strings));

        System.out.println("Task 3");
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        str3 = scanner.nextLine();
        double mid =((str1.length()+str2.length()+str3.length())/3);
String[] strings1 = {str1, str2, str3};
for (String string : strings1){
    if (string.length()<mid){
        System.out.println(string + " " + string.length());
    }
}
        System.out.println("Task 4");
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        str3 = scanner.nextLine();
        strings1 = new String[]{str1, str2, str3};
for (String string : strings1){
    char[] charArray = string.toCharArray();
    int flag  = 0;
    for ( int a=0; a< charArray.length; a++ ){
        for (int j=0; j< charArray.length; j++){
            if (charArray[a]==charArray[j] && j!=a) flag++;
            else continue;
        }
    }
    if (flag==0) {
        System.out.println(string);
        break;
    }
}

        System.out.println("Task 5");
        str1 = scanner.nextLine();

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = new char[charArray1.length*2];
            int i = 0;
            for ( int a=0; a< charArray1.length; a++ ){
                charArray2[i]=charArray1[a];
                charArray2[i+1]=charArray1[a];
                i+=2;
            }
str2 = new String(charArray2);
                System.out.println(str2);


        }


}