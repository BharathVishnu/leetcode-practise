import java.util.Scanner;

public class removeVowels {
    public static String removeVowel(String s)
    {
        if (s == null || s.length() <= 1)
        {
            return s;
        }
        char [] stringArray = s.toCharArray();
        int index = 0;

        while(index<stringArray.length)
        {
            if (isVowel(stringArray[index]))
            {
                stringArray[index] = '\0';
            }
            index++;
        }
        s = "";
        for(int i=0;i<stringArray.length;i++)
        {
            if(stringArray[i] != '\0')
            {
                s = s + stringArray[i];
            }
        }

        return s;
    }
    public static boolean isVowel(char c)
    {
        return "aeiouAEIOU" .indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeVowel(input));

    }
}
