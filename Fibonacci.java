/**
 *斐波那契数列 
 *第一位为0，第二第三位为1，其他的都为n-1的值加上n-2的值。
 **/
public class Fibonacci {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
