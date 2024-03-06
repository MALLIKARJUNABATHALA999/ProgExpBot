public class AAA {
    public static void main(String args[]) {
        int[] a={3,5,10,10,10,15,15,20};
        int[] b={5,10,10,15,30};
        int m=a.length;
        int n=b.length;
        intersection(a,b,m,n);
    }
   /* static void intersection(int a[],int b[], int m,int n){
        for(int i=0;i<m;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for(int j=0;j<n;j++){
                if(a[i]==b[i]){
                    System.out.println(a[i]+" ");
                    break;
                }
            }
        }
    }*/
   // int[] a={3,5,10,10,10,15,15,20};
   // int[] b={5,10,10,15,30};
    static void intersection(int a[],int b[], int m, int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]>b[j]) j++;
            else if(a[i]<b[j]) i++;
            else {
                System.out.println(a[i]+" ");
                i++;
                j++;
            }
        }
    }
}