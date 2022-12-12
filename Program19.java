import java.util.Scanner;

class LeapYears
{

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
        Scanner sc = new Scanner(System.in);
        int[] years = new int[10];
        boolean[] leapYear = new boolean[10];
        
        System.out.println("Enter years: ");
        for (int i=0; i < 10; i++)
        {
            years[i] = sc.nextInt();
            leapYear[i] = IsLeapYear(years[i]);
        }

        System.out.print("All years: ");
        for (int i=0; i < 10; i++)
            System.out.print(years[i] + " ");
        System.out.println();

        int leapYearCount = 0;
        System.out.print("Leap years: ");
        for (int i=0; i < 10; i++)
            if (leapYear[i]) 
            {
                System.out.print(years[i] + " ");
                leapYearCount++;
            }
        System.out.println();

        System.out.println("No. of leap years: " + leapYearCount);
        sc.close();
    }
}