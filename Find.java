/*
 *在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *在这样有序的二维数组中查找一个整数，从头到尾遍历二维数组，按行遍历，如果当前行当前值已经比目标值大则直接跳到下一行遍历，
 *直到：找到目标值，返回true；否则，返回false。
 */
public class Find {
    public boolean Find(int target, int [][] array) {
        int row=array.length;
        int col=array[0].length;
		for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(target==array[i][j]){
                    return true;
                }else if(target<array[i][j]){
                    break;
                }
            }
        }
        return false;
    }
}
