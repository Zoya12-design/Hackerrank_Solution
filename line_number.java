import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sol = new Scanner(System.in);
        int linenumber = 1;
            while(sol.hasNextLine()){
                String line = sol.nextLine();
                System.out.println(linenumber+" "+line);
                linenumber++;
            }
    }
}
