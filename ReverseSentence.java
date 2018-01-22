/**
 *将字符串分割，按反序添加入StringBuilder，将StringBuilder转为String返回即可。
 */
 public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str == null){ return null;}
         if(str.trim().equals("")){
            return str;
        }
        String string = str;
        String[] strings = string.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for (int i = strings.length-1 ; i>=0;i--) {
            if(i == 0){
                sBuilder.append(strings[i]);
            }else {
                sBuilder.append(strings[i]);
                sBuilder.append(" ");
            }  
        }
        String string2 = sBuilder.toString();
        return string2;
    }
}
