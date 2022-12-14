import java.util.Scanner;

class SpecialPalindrome
{
    // Method to check palindrome no.
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
    // Method to check special no.
    static boolean IsSpecial(String word)
    {
        word = word.toLowerCase();
        return word.charAt(0) == word.charAt(word.length()-1);
    }

    public static void main(String[] args)
    {
        // input using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();

        // calling methods
        boolean isPalindrome = IsPalindrome(word);
        boolean isSpecial = IsSpecial(word);
        
        // Printing output
        if (isPalindrome)
            System.out.println(word + " is palindrome.");
        else if (isSpecial)
            System.out.println(word + " is special.");
        else
            System.out.println(word + " is neither palindrome nor special.");
        sc.close(); // to avoid data leak
    }
}