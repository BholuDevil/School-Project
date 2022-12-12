import java.util.Scanner;;

class ElectricBill
{
    String n;
    int units;
    double bill;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        n = sc.nextLine();
        System.out.print("Enter units consumed: ");
        units = sc.nextInt();
        sc.close();
    }

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

    void print()
    {
        System.out.println("Name of the customer " + n);
        System.out.println("Number of units consumed " + units);
        System.out.println("Bill amount " + bill);
    }

    public static void main(String[] args)
    {
        ElectricBill bill = new ElectricBill();
        bill.accept();
        bill.calculate();
        bill.print();
    }
}