import java.util.Scanner;

class Sorting
{
    // Bubble sort method
    static void BubbleSort(int[] list)
    {
        int size = list.length;
        for (int end = size; end > 0; end--)    // reducing search space
        {
            boolean swapped = false;    // checking if already sorted
            for (int index = 1; index < end; index++)
                if (list[index] < list[index-1])    // sorting alternate values
                {
                    Swap(list, index, index-1);
                    swapped = true;
                }
            if (!swapped) break;
        }
    }
    // Method two index in an array
    static void Swap(int[] list, int indexA, int indexB)
    {
        int temp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = temp;
    }
    
    // Method to print array
    static void PrintArray(int[] list)
    {
        for (int index = 0; index < list.length; index++)
            System.out.print(list[index] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        // input using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] data = new int[15];   // initalizing array
        
        // input data in array
        System.out.print("Enter data: ");
        for (int index = 0; index < 15; index++)
            data[index] = sc.nextInt();
        System.out.println();


        // printing output
        System.out.print("Before Sorting: ");
        PrintArray(data);
        BubbleSort(data);   // Calling bubble sort
        System.out.print("After Sorting: ");
        PrintArray(data);
        
        sc.close(); // to avoid data leak
    }
}