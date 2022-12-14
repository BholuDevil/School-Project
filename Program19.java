import java.util.Scanner;

class LeapYears
{
    // Method to check leap year
    static boolean IsLeapYear(int year)
    {
        boolean div4 = year % 4 == 0;
        boolean div100 = year % 100 == 0;
        boolean div400 = year % 400 == 0;

        boolean isLeapYear =  !(
            !div4 || 
            (div4 && div100 && !div400)
        );
        return isLeapYear;
    }

    public static void main(String[] args)
    {
        // input using Scanner
        Scanner sc = new Scanner(System.in);
        int[] years = new int[10];  // array to input 10 years
        boolean[] leapYear = new boolean[10];   // to store if leap year
        int leapYearCount = 0;  // to store no. of leap years
        
        // inputing years into array
        System.out.println("Enter years: ");
        for (int i=0; i < 10; i++)
        {
            years[i] = sc.nextInt();
            leapYear[i] = IsLeapYear(years[i]);
            if (leapYear[i]) leapYearCount++;
        }

        //  Printing all years
        System.out.print("All years: ");
        for (int i=0; i < 10; i++)
            System.out.print(years[i] + " ");
        System.out.println();

        // printing leap years
        System.out.print("Leap years: ");
        for (int i=0; i < 10; i++)
            if (leapYear[i])
                System.out.print(years[i] + " ");
        System.out.println();

        //  printing no. of leap years
        System.out.println("No. of leap years: " + leapYearCount);
        sc.close(); // to avoid data leak
    }
}