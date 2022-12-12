import java.util.Scanner;

class Piglatin
{
    static boolean IsVowel(char ch)
    {
        if (!Character.isLetter(ch)) return false;
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


    static String Encode(String word)
    {
        // word = word.toUpperCase();
        
        int vowelIndex = -1;
        String beforeVowel = "";
        for (int index = 0; index < word.length(); index++)
        {
            char ch = word.charAt(index);
            if (IsVowel(ch))
            {
                vowelIndex = index;
                break;
            }
            else
                beforeVowel += ch;
        }

        String encoded = word.toUpperCase();
        if (vowelIndex >= 0)
            encoded = word.charAt(vowelIndex) + encoded + beforeVowel + "Ay";

        System.out.println(encoded);
        return encoded;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to encode: ");
        String word = sc.next();

        String encoded = Encode(word);
        System.out.println("Encoded piglatin word: " + encoded);
        sc.close();
    }
}