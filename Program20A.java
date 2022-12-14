import java.util.Scanner;

class Piglatin
{
    // Method to check vowel
    static boolean IsVowel(char ch)
    {
        if (!Character.isLetter(ch)) return false;
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Method to encode word
    static String Encode(String word)
    {
        int vowelIndex = -1;    // to store 1st vowel index
        String beforeVowel = "";    // to store letters 1st first vowel

        // loop to find fist vowel 
        // and store letters before it
        for (int index = 0; index < word.length(); index++)
        {
            char ch = word.charAt(index);
            if (IsVowel(ch))
            {
                vowelIndex = index;
                break;
            }
            beforeVowel += ch;
        }

        // calculating encoded word
        String encoded = word.toUpperCase();
        if (vowelIndex >= 0)
            encoded = word.charAt(vowelIndex) + encoded + beforeVowel + "Ay";
        return encoded; // returning encoded word
    }

    public static void main(String[] args)
    {
        // input using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to encode: ");
        String word = sc.next();

        String encoded = Encode(word);  // calling method to encode
        System.out.println("Encoded piglatin word: " + encoded);
        sc.close(); // to avoid data leak
    }
}