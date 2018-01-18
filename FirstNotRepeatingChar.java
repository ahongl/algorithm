/**
 *在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置。 
 *定义一个HashMap集合，遍历数组，每次都判断一下HashMap中是否已包含该元素，没包含，则放入元素，并赋值为1；否则更改value值加一。 
 *最后循环遍历数组，读取每个元素的值，取出第一个值为1的元素。
 */
 import java.util.HashMap;
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(map.containsKey(c))
            {
                int time=map.get(c);
                time++;
                map.put(c,time);

            }
            else
            {
                map.put(c,1);
            }
        }
       for(int i=0;i<str.length();i++)
       {
           char c=str.charAt(i);
          if(map.get(c)==1)
           return i;
       }
       return -1;
    }
}
