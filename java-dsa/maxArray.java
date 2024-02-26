import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int[] arr = new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<l;i++)
        {
            while (arr[i] > max)
            {
                max = arr[i];
            }
            while (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
