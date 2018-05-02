/**
 * Created by yin on 18/5/2.
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 1. 如果n是3的倍数，输出“Fizz”；
 2. 如果n是5的倍数，输出“Buzz”；
 3.如果n同时是3和5的倍数，输出“FizzBuzz”。
 */
public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }
}
