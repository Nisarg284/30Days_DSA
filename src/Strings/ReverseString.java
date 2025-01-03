package Strings;

public class ReverseString {

    public static String reverseStr(String str)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "Nisarg";

        System.out.print(reverseStr(str));

    }
}
