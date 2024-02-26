import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t"+arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
