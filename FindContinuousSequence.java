/**
 *输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序。 
 *利用简单的循环遍历方法，循环到sum/2即可，当count>sum时，则跳出循环，减少循环次数，提高效率。
 */
 import java.util.ArrayList;
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> aList=new ArrayList<ArrayList<Integer>>();
       if(sum<2)
            return aList;
       for(int i=1;i<=sum/2;i++){
               ArrayList<Integer> aList2=new ArrayList<Integer>();
               int count=0;
               for(int j=i;j<sum;j++){
                   count+=j;
                   aList2.add(j);
                   if(count>sum)
                       break;
                   else if(count==sum){
                       aList.add(aList2);
                      break;  
                   }
               }
           }
        return aList;
    }
}
