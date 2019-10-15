import java.util.Scanner;

public class Hangover {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        while (true){
            double n = sc.nextDouble();
            if(n == 0.00){
                break;
            }
            System.out.println(helper(n)+" card(s)");
        }
    }
    static int helper(double n){
        double sum = 0;
        double i = 1;
        while(sum <= n){
            sum+=(1/(i+1));
            i++;
        }
        return (int) i-1;
    }
}
