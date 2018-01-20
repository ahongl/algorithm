/**
 *统计一个数字在排序数组中出现的次数。 
 *本代码采用顺序遍历，但是数组是排好序的，所以应该可以两边向中间靠拢遍历，然后尾下标减头下标。
 */
 public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
       int count=0;
        for(int i=0;i<array.length;i++){
           if(array[i]==k)
               count++;
       }
        return count;
    }
}
