import java.util.Scanner;

//calls Payment class that will calculate the user inputs
class Payment {
    double paymentAmount;
    Payment(double principal, double rateMonthly, double timeMonths){
        paymentAmount = (principal* rateMonthly) / 1 - Math.pow(1 + rateMonthly, -timeMonths);
                paymentAmount = Math.round(paymentAmount * 100) /100;
    }
}

// ask user to input princpal, interest rate, and time, calls the payment class for calculating and outputs the payment amount
 class MortagePayment {
    public static void main (String arg []) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rateMonthly = scan.nextDouble();
        rateMonthly =( rateMonthly/100)/12;
        System.out.print("Enter Time period in years : ");
        double timeMonths = scan.nextInt();
        timeMonths= timeMonths* 12;
        Payment pay=new Payment(principal, rateMonthly, timeMonths);
        System.out.println("Payment: " + pay.paymentAmount);
    }
}
