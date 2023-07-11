package backend.Threads;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RunnableInterface implements  Runnable {




    @Override
    public void run() {
        for (int i = 1; i<=10; i++)
        {
            System.out.println(i);
        };

    }

    public static void main(String[] args) {


        RunnableInterface obj = new RunnableInterface();
        Thread thread = new Thread(obj);
       // Thread thread1 = new Thread(obj);
        thread.start();
        //thread1.start();


    }


}