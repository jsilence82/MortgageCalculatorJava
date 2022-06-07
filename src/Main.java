import java.text.DecimalFormat;
import java.util.Scanner;

// Class calculates  user inputs
class Payment {
    double paymentAmount;
    Payment(double principal, double rateMonthly, double timeMonths){
        paymentAmount = (principal* rateMonthly) / (1 - Math.pow(rateMonthly + 1, -timeMonths));
                //paymentAmount = Math.round(paymentAmount * 100) /100;
    }
}

// Input princpal, interest rate, and time, calls the payment class for calculating and outputs the payment amount
 class MortagePayment {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rateYearly = scan.nextDouble();
        double rateMonthly = (rateYearly/100)/12;
        System.out.print("Enter Time period in years : ");
        int timeYears = scan.nextInt();
        int timeMonths= timeYears * 12;
        Payment pay=new Payment(principal, rateMonthly, timeMonths);
        double balance = principal;

        DecimalFormat df = new DecimalFormat("###.##");
        DecimalFormat intForm = new DecimalFormat("###.#####");


        // Prints the loan terms and calculated monthly payment.
        System.out.println("\n\n\t Mortgage Calculator\n\n" +
                "Principle Amount: \t€" + principal +
                "\nInterest Rate (%): \t" + intForm.format(rateMonthly) + "%" +
                "\nTerm (Months): \t" + timeMonths);

        System.out.println("\nThe monthly payment will be: €" + df.format(pay.paymentAmount));

        System.out.println("\n\nMonths\t\tMonthly\t\tInterest\tPrincipal\tBalance");
        System.out.println("Remaining\tPayment\t\tPayment\t\tPayment\t\tRemaining");
        System.out.println("_________  \t_________  \t_________  \t_________ \t_________");

        // Prints the payment table.
        while (balance > 0) {

            double interestPaid = balance * rateMonthly;
            double principalPaid = pay.paymentAmount - interestPaid;
            balance = balance - principalPaid;

            System.out.println(timeMonths + "\t\t\t€" + df.format(pay.paymentAmount) + "\t\t€" + df.format(interestPaid)
                    + "\t\t€" + df.format(principalPaid) + "\t\t€" + df.format(balance));

            timeMonths--;
        }
    }
}
