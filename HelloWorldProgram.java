import java.util.Scanner;

public class HelloWorldProgram{

    public static void  main(String [] args){

        System.out.println("Hello world");
        // data types

        int a = 23;
        double marks = 90.00;
        String name = "amit";
        System.out.println(a);
        System.out.println(marks);
        System.err.println(name);

        //user input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int num = sc.nextInt();
        System.out.println("entered number is " + num);
        System.out.println("enter your name: ");
        String name1 = sc.next();
        System.out.println("entered name is "+name1);


        System.out.print("hellow");
        System.out.print("world");

        
    }
}