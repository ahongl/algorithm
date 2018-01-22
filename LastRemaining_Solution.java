/**
 *随机指定一个数m,从编号0开始报数。每次喊到m-1的那个数要出列；从他的下一个数开始,继续0…m-1报数….这样下去….直到剩下最后一个数，返回这个数。
 */
 public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) return -1;
        int[] array = new int[n];
        int i = -1,step = 0, count = n;
        while(count>0){   //跳出循环时将最后一个元素也设置为了-1
            i++;          //指向上一个被删除对象的下一个元素。
            if(i>=n) i=0;  //模拟环。
            if(array[i] == -1) continue; //跳过被删除的对象。
            step++;                     //记录已走过的。
            if(step==m) {               //找到待删除的对象。
                array[i]=-1;
                step = 0;
                count--;
            }        
        }
        return i;//返回跳出循环时的i,即最后一个被设置为-1的元素
    }
}
