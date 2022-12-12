import java.util.Scanner;

class RiverData
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] river = new int[size];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        System.out.print("Enter data: ");
        for (int index = 0; index < size; index++)
        {
            river[index] = sc.nextInt();

            if (river[index] < min)
                min = river[index];
            
            if (river[index] > max)
                max = river[index];

            sum += river[index];
        }
        System.out.println();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum of data: " + sum);

        sc.close();
    }
}