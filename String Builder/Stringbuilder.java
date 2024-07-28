import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a' ; ch<='z' ; ch++)
        {
            {
              sb.append(ch);
            }
          //abcdefghij
          //o(26)
          //0(n^2)
          //System.out.println(sb);
          System.out.println(sb.length());
        }   
    }
   
}
