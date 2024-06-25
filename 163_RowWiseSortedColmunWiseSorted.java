    import java.net.SocketOption;
    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            int[][] mat={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}
            };
            int x=29;
            RowWiseColumnWiseSorted(mat,x);
        }
        private static void RowWiseColumnWiseSorted(int[][] mat,int x){
            int R=mat.length;
            int C=mat[0].length;
            int i=0;
            int j=C-1;
            while(i<R  && j>=0){
                if(mat[i][j]==x){
                    System.out.print("FoundAt("+i+","+j+")");
                    return;
                }
                else if(mat[i][j]>x){
                    j--;
                }
                else{
                    i++;
                }
            }
            System.out.print("not found");
        }

   }