/**
 *请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。利用正则表达式实现。
 */
 public class isNumeric {
    public boolean isNumeric(char[] str) {
        String s=String.valueOf(str);
        //return s.matches("[+-]?[0-9]*(.[0-9]*)?([eE][+-]?[0-9]+)?");
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }
}
