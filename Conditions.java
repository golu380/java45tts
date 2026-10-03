import java.util.Scanner;

public class Conditions{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = sc.nextInt();

        if(age >60){
            System.out.println("senior citizen");
        }else if(age > 30 && age <= 60){
            System.out.println("elder adult");
        }else if( age <= 30 && age >18){
            System.out.println("adult");
        }else{
            System.out.println("minor or teenager");
        }
        boolean haslicense = false;

        if(age > 18){
            if(haslicense){
                System.out.println("you can drive");
            }else{
                System.out.println("you have not license");
            }
        }else{
            System.out.println("your are under age");
        }

        System.out.println("using and operator");
        if(age > 18 && haslicense){
            System.out.println("you can drive");
        }else{
            System.out.println("your are either minor or not have liscendse");
        }
    }
}