import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter day code: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
                
            case 2:
                System.out.println("tuesday");
                
                break;
            case 3:
                System.out.println("wednesday");
                
                break;
            case 4:
                System.out.println("thursday");
                
                break;
            case 5:
                System.out.println("Friday");
                
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }

        System.out.println("enter your age");

        int age = sc.nextInt();

        String res = age>20?"Adult" :"minor";
        System.out.println("your are "+ res);
        sc.close();
    }
}
