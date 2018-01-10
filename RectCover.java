/**
 *用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形的方法数。
 **/
public class RectCover {
    public int RectCover(int target) {
        if(target==0||target==1||target==2)
            return target;
        else
            return RectCover(target-1)+RectCover(target-2);
    }
}
