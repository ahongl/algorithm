/*
 *输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
 import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;
public class Permutation {
    public ArrayList<String> Permutation(String str) {
       TreeSet<String> tree = new TreeSet<String>();
       Stack<String[]> stack = new Stack<String[]>();
            ArrayList<String> results = new ArrayList<String>();
            stack.push(new String[]{str,""});
            do{
                String[] popStrs = stack.pop();
                String oldStr = popStrs[1];
                String statckStr = popStrs[0];
                for(int i =statckStr.length()-1;i>=0;i--){
                    String[] strs = new String[]{statckStr.substring(0,i)+statckStr.substring(i+1),oldStr+statckStr.substring(i,i+1)};
                    if(strs[0].length()==0){
                        tree.add(strs[1]);
                    }else{
                        stack.push(strs);
                    }
                }
            }while(!stack.isEmpty());
        for(String s : tree)
            results.add(s);
        return results;
    }
}
