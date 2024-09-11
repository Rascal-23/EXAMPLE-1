import java.util.Scanner;
public class myclass {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Ask user name
    System.out.println("Enter your name");
    String name = scanner.nextLine();

    //Asking for the user's age
    System.out.println("Enter your age");
    int age = scanner.nextInt();

    //Enter user food
    System.out.printf("Enter your best food");
    String food = scanner.nextline();
    
    //Enter user movie
    System.out.printf("Enter your best movie");
    String movie = scanner.nextLine();
     
    //Output
    System.out.println("Name:" + name);
    System.out.println("Age" + age);
    System.out.println("Food" + food);
    System.out.println("Movie" + movie);

     scanner.close();




    }
}