// 1 + 1/2 + 1/3 + 1/4 + 1/5 .....1/n
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i<=n; i++){
            sum = sum + (1.0/i);
        }
        System.out.println(sum);
    }
}
