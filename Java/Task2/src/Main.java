import java.util.Scanner;
import java.util.Arrays;
import java.io.*;


public class Main
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1:");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter String2:");
        String str2 = sc.nextLine().toLowerCase();
        // str1.toLowerCase();
        // str2.toLowerCase();
        
        
        
           if(str1.length() != str2.length())
        {
            System.out.println("Both Strings are not Anagram");
        }
        
        else{
            
       
            char[] x = str1.toCharArray();
            char[] y = str2.toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);
            // System.out.println(x);
            // System.out.println(y)

            int flag = 1;
            for(int i=0; i<x.length;i++)
            {
                if(x[i]!=y[i])
                {
                    flag = 0;
                    break;
                }

     
            }
            
            
            
                if (flag == 1)
                {
                    System.out.println("Given strings are Anagram!");
                }
                
                else {
                    System.out.println("Given strings are not Anagram!");
                }

        }


        



    }


}