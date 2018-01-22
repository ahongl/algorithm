/**
 *随机从牌中抽出了5张牌，大\小王可以看成任何数字,并且A看作1,J为11,Q为12,K为13；抽到顺子，返回true；否则，返回false。
 */
 import java.util.ArrayList;
import java.util.Collections;
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length == 0 || numbers.length > 5){
            return false;
        }
        ArrayList<Integer> al = new ArrayList<>();
        int len = numbers.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(0 == numbers[i]){
                count++;
            }else{
                al.add(numbers[i]);
            }
        }
        Collections.sort(al);
        int len1 = al.size();
        if(Math.abs(al.get(0) - al.get(len1 - 1)) > 4){
            return false;
        }
        for(int i = 0; i < len1 - 1; i++){
            int temp = al.get(i + 1) - al.get(i);
            if(0 < temp && temp < 5){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
