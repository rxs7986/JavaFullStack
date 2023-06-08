class Person {
    int age = 20;
  public void getAgeCategory() {
      if (age > 13 && age <= 19) {
          System.out.println("Teen");
      } else if (age < 13) {
          System.out.println("Kid");
      } else if (age > 19) {
          System.out.println("Adult");
      }
      else {
          System.out.println("Invalid Age");
      }
  }

}


public class Agetype {

    public static void main(String[] args)
    {
        Person obj = new Person();
        obj.getAgeCategory();



//        Main obj = new Main();
//        obj.getAgeCategory();

    }


}

