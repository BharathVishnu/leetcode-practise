import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        ArrayList <Integer> arr= new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        for(int i=0;i<l;i++)
        {
            if(arr.get(i) % 2 == 0)
            {
                arr.remove(i);
                l--;
            }
        }
        System.out.println(arr);


        

    }
}
