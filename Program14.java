import java.util.Scanner;;

class ElectricBill
{
    String n;       // to store name
    int units;      // to store units cosumed
    double bill;    // to store bill calculated 

    // method to accept input using Scanner
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        n = sc.nextLine();
        System.out.print("Enter units consumed: ");
        units = sc.nextInt();
        sc.close();
    }

    // method to calculate bill
    void calculate()
    {
        if (units <= 100)
            bill = units * 2;

        else if (units <= 300)
            bill = units * 3 - 100;
        
        else
        {
            bill = units * 5 - 700;
            bill += 0.025 * bill;
        }
    }

    // method to print output
    void print()
    {
        System.out.println("Name of the customer " + n);
        System.out.println("Number of units consumed " + units);
        System.out.println("Bill amount " + bill);
    }

    // Main Method to test class
    public static void main(String[] args)
    {
        ElectricBill bill = new ElectricBill();
        bill.accept();
        bill.calculate();
        bill.print();
    }
}