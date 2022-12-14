import java.util.Scanner;

class NumberSystem
{
    public static void main(String[] args)
    {
        // input number [decimal] using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer no. ");
        long number = sc.nextLong();
        sc.close(); // to avoid data leak

        // converting into binary and octal using library classes
        String binary = Long.toBinaryString(number);
        String octal = Long.toOctalString(number);

        // printing output
        System.out.println("Decimal Value: " + number);
        System.out.println("Binary Value: " + binary);
        System.out.println("Octal Value: " + octal);
    }
}