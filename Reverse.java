import java.util.*;
class Reverse {
    public static void main(String[] args) {

        String str = "sunshines", endstr = "";
        char ch;
        System.out.print("Original word: ");
        System.out.println("sunshines");
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            endstr = ch + endstr;
        }    System.out.println("Reversed word: " + endstr);

    }
}
