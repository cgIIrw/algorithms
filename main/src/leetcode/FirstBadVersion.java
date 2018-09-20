package leetcode;

/**
 * Created by yin on 18/5/3.
 * 你是产品经理，目前正在领导一个团队开发一个新产品。不幸的是，您的产品的最新版本没有通过质量检查。
 * 由于每个版本都是基于之前的版本开发的，所以错误版本之后的所有版本都是不好的。假设你有n个版本[1, 2, ..., n]，
 * 你想找出第一个错误的版本，导致下面所有的错误。你可以通过 bool isBadVersion(version)的接口
 * 来判断版本号version是否在单元测试中出错。实现一个函数来查找第一个错误的版本。您应该尽量减少对API的调用次数。
 */
public class FirstBadVersion {
    boolean isBadVersion(int version) {
        return true; // 为了编译通过 默认true
    }

    public int firstBadVersion(int n) {
        int min = 1;
        int max = n;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isBadVersion(mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}

/**
 * 一个,二分查找...
 */



