import java.io.*;
import java.util.ArrayList;
class Substring{
    public static ArrayList<String>
    splitSubstrings(String s) {
        int i, j;
        int stringLength = s.length();
        ArrayList<String> subStringList
                = new ArrayList<String>();
        for (i = 0; i < stringLength; i++) {

            for (j = i + 1; j <= stringLength; j++) {

                subStringList.add(s.substring(i, j));
            }

        }
        return subStringList;
    }
    public static void main(String[] args)
    {
        String stringInput = new String("The Cat");

        ArrayList<String> subStringList
                = Substring.splitSubstrings(
                stringInput);

        System.out.println("\nSubstring list printed as an ArrayList : ");
        System.out.println(subStringList);

        System.out.println("\n\nAll substrings printed 1 per line : ");
        int count = 1;
        for (String it : subStringList) {
            System.out.println("(" + count + ") \"" + it + "\"");
            count++;
        }
    }
}
