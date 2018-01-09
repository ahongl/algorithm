/**
 *跳台阶 
 *类似斐波那契数列，第一位为0，第二位为1，第三位为2，其他都为n-1的值加上n-2的值。
 **/
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
