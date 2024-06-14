public class MatrixProblem {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int R=mat.length;
        int C=mat[0].length;
        int[][] temp=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                temp[C-j-1][i]=mat[i][j];
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mat[i][j]=temp[i][j];
            }
        }


        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
