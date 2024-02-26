import java.util.Scanner;

public class reverseVowels {
    public static String reverseVowel(String s)
    {
        if (s == null || s.length() <= 1)
        {
            return s;
        }
        char [] stringArray = s.toCharArray();
        int left = 0;
        int right = stringArray.length - 1;

        while(left<right)
        {
            while(left<right && !isVowel(stringArray[left]))
            {
                left++;
            }
            while(left<right && !isVowel(stringArray[right]))
            {
                right--;
            }

            char temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;

            left ++;
            right--;
        }

        return new String(stringArray);
    }
    public static boolean isVowel(char c)
    {
        return "aeiouAEIOU" .indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseVowel(input));

    }
}
