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
            for(int j=i+1;j<C;j++){
                int swap=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=swap;
            }
        }
        for(int i=0;i<R;i++){
           int low=0;
           int high=R-1;
           while(low<high){
              int tmp= mat[low][i];
              mat[low][i]=mat[high][i];
              mat[high][i]=tmp;
              low++;
              high--;
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
