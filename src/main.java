import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Please enter your money in USD: ");
        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.print("VND: " + exchange);
    }
}
