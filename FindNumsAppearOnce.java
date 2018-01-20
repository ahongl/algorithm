/**
 *一个整型数组里除了两个数字之外，其他的数字都出现了两次。找出这两个只出现一次的数字。 
 *0异或任何数等于任何数，同一个数异或结果为零。 
 *利用这一定律，将所有数字异或一次，得到的结果就是两个只出现一次的数字的异或。
 *利用flag标志找出两个数字不同的那一位，然后利用那一位找出两个只出现一次的数字。
 */
 //num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length < 2) return ;
        int myxor = 0;
        int flag = 1;
        for(int i = 0 ; i < array.length; ++ i )
            myxor ^= array[i];
        while((myxor & flag) == 0) flag <<= 1;
       // num1[0] = myxor;
        //num2[0] = myxor;
        for(int i = 0; i < array.length; ++ i ){
            if((flag & array[i]) == 0) num2[0]^= array[i];
            else num1[0]^= array[i];
        }
    }
}
