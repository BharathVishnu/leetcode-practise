import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int[] arr = new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<l/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        System.out.println();
        for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
