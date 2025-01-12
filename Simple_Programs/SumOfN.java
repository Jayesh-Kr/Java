import java.util.*;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // int i = 1;

        // while(i<=n) {
        //     sum += i;
        //     i++;
        // }

        // do {
        //     sum += i;
        //     i++;
        // }while(i<=n);

        for(int i=1; i<=n; i++)
            sum += i;
        System.out.println(sum);
        sc.close();
    }
}