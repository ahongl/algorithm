/**
 *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 *由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。 
 *因为出现次数超过数组长度的一半，所以排序后，只要确定数组最中间的数出现的次数是否超过数组长度的一半即可。
 */
import java.util.*;
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        int count=0;
        Arrays.sort(array);
        int num=array[len/2];
        for(int i=0;i<len;i++){
            if(num==array[i])
                count++;
        }
        if(count<=(len/2)){
            num=0;
        }
        return num;
    }
}
