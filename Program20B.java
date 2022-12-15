import java.util.Scanner;
// don't used to write so much of comments. 
public class SpecialPalindrome
{
    static boolean IsPalindrome(String word)
    {
        boolean isPalindrome = true;
        word = word.toLowerCase();

        int start = 0;
        int end = word.length() - 1;
        while (start < end)
            if (word.charAt(start++) != word.charAt(end--))
            {
                isPalindrome = false;
                break;
            }
        return isPalindrome;
    }
    
    static boolean IsSpecial(String word)
    {
        word = word.toLowerCase();
        return word.charAt(0) == word.charAt(word.length()-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();

        boolean isPalindrome = IsPalindrome(word);
        boolean isSpecial = IsSpecial(word);
        
        if (isPalindrome)
            System.out.println(word + " is palindrome.");
        else if (isSpecial)
            System.out.println(word + " is special.");
        else
            System.out.println(word + " is neither palindrome nor special.");
        sc.close(); // to avoid data leak
    }
}
