package Mastery;

public class InvestmentCalculator {

    public static void main(String[] args) {
        double principal = 2500.0;
        double rate = 0.075; 
        double target = 5000.0;
        double amount = principal;
        int years = 0;

        
        while (amount < target) {
            amount *= (1 + rate);
            years++;
        }

        System.out.printf("It will take %d years for $%.2f to grow to at least $%.2f at %.1f%% interest.%n",
                          years, principal, target, rate * 100);
        System.out.printf("Final amount after %d years: $%.2f%n", years, amount);
    }
}