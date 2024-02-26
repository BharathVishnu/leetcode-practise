import java.util.*;
public class matrixSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr1 = new int[m][n];
        int [][]arr2 = new int[m][n];
        int [][]arr3 = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}