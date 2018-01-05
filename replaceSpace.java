/*
 *将一个字符串中的空格替换成“%20”。即是字符替换，遍历整个字符串，如果是想要替换掉的字符，则进行字符替换操作；否则，直接添加到目标字符串中，保持不变。
 */
public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
    	StringBuffer string=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                string.append(str.charAt(i));
            }else{
                string.append('%');
                string.append('2');
                string.append('0');
            }
        }
        return string.toString();
    }
}
