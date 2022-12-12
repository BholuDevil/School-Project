import java.util.Scanner;

class NumberSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer no. ");
        long number = sc.nextLong();

        String binary = Long.toBinaryString(number);
        String octal = Long.toOctalString(number);

        System.out.println("Decimal Value: " + number);
        System.out.println("Binary Value: " + binary);
        System.out.println("Octal Value: " + octal);

        sc.close();
    }
}