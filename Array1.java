import java.util.Scanner;

public class Array1 {

    public static void main(String [] args){
        System.out.println("hii...");
        int [] arr = {82,34,32,56,12,78,87,90};

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0;i<n;i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
            for(int i = 0;i<n;i++){
            if(arr[i] > minimum){
                maximum = arr[i];
            }
        }

        System.out.println("the minimum value fo array is: "+minimum);
        
        System.out.println("the maximum value fo array is: "+maximum);
        Scanner sc = new Scanner(System.in);
System.out.println("enter number you want to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for(Integer it: arr){
           if(it == key) {
            found = true;
            break;
           }

        }

        if(found){
            System.out.println("element is fonded");
        }else{
            System.out.println("not fouded");
        }
    }

    
}
