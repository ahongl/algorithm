/**
 *输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
 *乘积最小是一个尽量大，一个尽量小的组合。 
 *所以从两端开始向中间寻找。
 */
 import java.util.ArrayList;
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int length=array.length;
        int i=0,j=length-1;
        while(i<=j){
            if(array[i]+array[j]<sum){
                i++;
                continue;
            }
            if(array[i]+array[j]>sum){
                j--;
                continue;
            }
            if(sum==(array[i]+array[j])){
                result.add(array[i]);
                result.add(array[j]);
                return result;
            }
        }
        return result;
    }
}
