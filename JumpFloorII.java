/**
 *通过寻找规律可得结果为2的n-1次方。
 **/
public class JumpFloorII {
    public int JumpFloorII(int target) {
        return (int)Math.pow(2, target-1);
    }
}
