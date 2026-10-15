import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {

        System.out.println("hii");

        // int i = 0;

        // for(i = 0;i<=10;i = i+1){
        // System.out.print(i+" ");
        // }
        // System.out.println("second loop");
        // for(;i<20;i++){
        // System.out.print(i+" ");
        // }

        // for(;;i++){System.out.println("hii...");}

        // int i = 10;
        // System.out.println(++i); //preincreament operator 11
        // System.out.println(i++); //postincreament operator 11
        // System.out.println(i); //12

        // int z = ++i + i++;
        // System.out.println(z);

        // for(int i = 1;i<= 20;i++){
        // if(i%2 == 0){
        // System.out.println(i);
        // }

        // }

        // System.out.println("enter number you want to print table");
        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();

        // for (int j = 1; j <= num; j++) {

        //     for (int i = 1; i <= 10; i++) {

        //         System.out.println(j + " * " + i + " = " + j* i);
        //     }
        //     System.out.println();
        // }

//         int i = 1;
//  System.out.println("enter number you want to print table");
//         Scanner sc = new Scanner(System.in);
//         int nums = sc.nextInt();
//         while(i <=10) {
//             System.out.println(nums +" * "+i +" = "+ nums * i);
//             i++;
//             // i = i+ 1;
//         }

        // int j  = 1;
        // while(j<1){
        //     System.out.println(j);
        //     j++;
        // }

        // do{
        //     System.out.println(j);
        //     j++;
        // }while(j<1);

        for(int i = 0;i<10;i++){
 System.out.println(i);
            if(i == 6){
               break;
            }
            // System.out.println(i);
        }

        for(int j = 0;j<10;j++){
            //   System.out.println(j);
            if(j == 7){
                continue;
            }
            System.out.println(j);
        }
    }
}