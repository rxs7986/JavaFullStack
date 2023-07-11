package backend.String_Manpulations;

import java.util.*;
import java.io.*;

public class StringReverse
{
    public static void main (String[] args) {
        String str = "Java J2EE Reverse Me";
        String[] words = str.split("\\s");
        String reversedStr = "";
       
        
        for(String w: words)
        {
            
        StringBuilder sb = new StringBuilder(w);
        sb.reverse();
        reversedStr = reversedStr + sb.toString() + " ";
        
        }
        
        System.out.print(reversedStr);
       
    }
}