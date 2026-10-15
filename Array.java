import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        int [] arr = {12,13,43,56,78,84,44,4};
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        int [] arr1 = new int[5];

        for(int ay :arr1){
            System.out.println(ay);
        }
        arr1[0] = 9;
        arr1[1] = 90;
System.out.println("after updation");
            for(int ay :arr1){
            System.out.println(ay);
        }
// System.out.println(arr1[5]); // will throw exception

System.out.println(arr1.length);
System.out.println(arr.length);

for(int i = 0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
}


System.out.println("enter a number of digits you want sum");
Scanner sc = new Scanner(System.in);

int size = sc.nextInt();

int [] nums = new int[size];
int sum = 0;

for(int i = 0;i<size;i++){
    System.out.print("enter "+ (i+(int)1)+"th number: ");
    nums[i] = sc.nextInt();
    sum += nums[i];

}

System.out.println( "the sum of given digits is:" + sum);

    }
}
