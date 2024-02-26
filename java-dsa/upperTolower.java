import java.util.*;
public class upperTolower {

    public static String convert(String s)
    {
        if(s==null)
            return s;
        char []stringArray = s.toCharArray();

        String result = "";
        for(int i=0;i<stringArray.length;i++)
        {
            if (Character.isUpperCase(stringArray[i]))
            {
                stringArray[i] = Character.toLowerCase(stringArray[i]);
            }
            result = result + stringArray[i];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(convert(input));
    }
}