/**
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 * 遍历数组，找到比前一个数小的数，返回即可，如果没有，则返回数组第一个元素。
 */
import java.util.ArrayList;
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
    	if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }
}
