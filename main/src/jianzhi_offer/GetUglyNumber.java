package jianzhi_offer;

public class GetUglyNumber {
    public static boolean getUglyNumber(int number) {
        while (number % 2 == 0) {
            number = number / 2;
        }
        while (number % 3 == 0) {
            number = number / 3;
        }
        while (number % 5 == 0) {
            number = number / 5;
        }
        if (number == 1) {
            return true;
        }
        return false;
    }
    
    public static int getNumber(int sum) {

        if (sum <= 0) {
            return 0;
        }
        
        int number = 0;
        int isUgly = 0;
        while (isUgly < sum) {
            number++;
            if (getUglyNumber(number)) {
                isUgly++;
            }
        }
        return number;
    }

    public static void main (String args[]) {
        System.out.println(getNumber(1500));
    } 
}
