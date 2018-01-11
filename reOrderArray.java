/**
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 *并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
 import java.util.ArrayList;
public class reOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        int n = array.length;
        for(int i = 0;i < n;i++){
            int temp = array[i];
            if(temp % 2 == 1){
                odd.add(temp);
            }else{
                even.add(temp);
            }
        }
        int m = 0;
        for(int j = 0;j < odd.size();j++){
            array[m] = odd.get(j);
            m++;
        }
        for(int k = 0;k < even.size();k++){
            array[m] = even.get(k);
            m++;
        }
    }
}
