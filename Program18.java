import java.util.Scanner;

class Sorting
{
    static void BubbleSort(int[] list)
    {
        int size = list.length;
        for (int end = size; end > 0; end--)
        {
            boolean swapped = false;
            for (int index = 1; index < end; index++)
                if (list[index] < list[index-1]) 
                {
                    Swap(list, index, index-1);
                    swapped = true;
                }
            if (!swapped) break;
        }
    }
    static void Swap(int[] list, int indexA, int indexB)
    {
        int temp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = temp;
    }
    
    static void PrintArray(int[] list)
    {
        for (int index = 0; index < list.length; index++)
            System.out.print(list[index] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] data = new int[size];
        
        System.out.print("Enter data: ");
        for (int index = 0; index < size; index++)
            data[index] = sc.nextInt();
        System.out.println();


        System.out.print("Before Sorting: ");
        PrintArray(data);
        BubbleSort(data);   // Calling bubble sort
        System.out.print("After Sorting: ");
        PrintArray(data);
        
        sc.close();
    }
}