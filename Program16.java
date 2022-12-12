import java.util.Scanner;

class Capitalize
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string in lowercase :-");
        String input = sc.nextLine();

        String str = "";
        boolean IsNewWord = true;
        for (int index = 0; index < input.length(); index++)
        {
            char ch = input.charAt(index);
            if (Character.isLetter(ch) && IsNewWord)
                ch = Character.toUpperCase(ch);
            str += ch;
            
            if (Character.isWhitespace(ch))
                IsNewWord = true;
            else
                IsNewWord = false;
        }

        System.out.println("New Capitalized String :-");
        System.out.println(str);
        sc.close();
    }
}