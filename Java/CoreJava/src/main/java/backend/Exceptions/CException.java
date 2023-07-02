package backend.Exceptions;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CException {
    public static void main(String[] args) {
     int a= 4, b=0;

     try{
         int x = a / b;
     }
     catch (ArithmeticException e){
         throw new CustomException();
         //System.out.println(e);
     }
    }
}