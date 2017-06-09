import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = scanner.nextInt();

        int sum = 0;
        //输出斐波那契数列
        for (int i = 1; i <= n; i ++ ){
            System.out.println(fibonacii(i));
            sum += fibonacii(i);
        }
        System.out.println("sum = "+ sum);
    }

    //递归方法实现
    private static int fibonacii(int n) {
        if (n <= 2){
            return 1;
        }else {
            return fibonacii(n-1) + fibonacii(n-2);
        }
    }
}
