public class ThreadClass extends Thread {

    public void printnumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    public void run()
    {
        printnumbers();
    }

    public static void main(String[] args) {

        ThreadClass obj = new ThreadClass();
        obj.start();
    }
}
