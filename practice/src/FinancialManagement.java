import java.util.Scanner;

public class FinancialManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        int counter=0;
        while (counter < 12){
            double n = sc.nextDouble();
            sum+=n;
            counter++;
        }
        System.out.printf("$"+"%.2f\n", sum/12);
    }
}
