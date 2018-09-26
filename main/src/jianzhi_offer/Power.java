package jianzhi_offer;

/**
 * 华金 数值的整数次方
 */
public class Power {


    public static double power(double base, int e) {
        if (base == 0 && e < 0) {
            throw new IllegalArgumentException("输入无数学意义");
        }

        if (e >= 0) {
            return unsignedPower(base, e);
        }

        if (e < 0) {
            return 1 / unsignedPower(base, -e);
        }
        return 0.0;
    }

    public static double unsignedPower(double base, int e) {

        // 0的0次方在数学上没有意义，在这里统一处理为1；
        if (e == 0) {
            return 1;
        }

        if (e == 1) {
            return base;
        }

        double temp = unsignedPower(base, e >> 1);

        return (e & 0x1) == 1 ? temp * temp * base : temp * temp;
    }

    public static void main(String[] args) {
        System.out.println(power(-2,3));

    }
}
