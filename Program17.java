import java.util.Scanner;

class DataHandling
{
    public static void main(String[] args)
    {
        // input using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();    // size of input
        System.out.print("Enter data: ");
        
        int[] data = new int[size];     // to store data
        int min = Integer.MAX_VALUE;    // to store min value
        int max = Integer.MIN_VALUE;    // to store max value
        long sum = 0;                   // to store sum

        // logic to calculate min, max, and sum
        for (int index = 0; index < size; index++)
        {
            data[index] = sc.nextInt();

            if (data[index] < min)
                min = data[index];
            
            if (data[index] > max)
                max = data[index];

            sum += data[index];
        }
        System.out.println();

        // printing output
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum of data: " + sum);
        sc.close(); // to avoid data leak
    }
}