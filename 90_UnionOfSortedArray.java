public class AAA {
    public static void main(String args[]) {
        int[] b={3,5,8};
        int[] a={2,8,9,10,15};
        int m=a.length;
        int n=b.length;
        union(a,b,m,n);
    }

    /*static void union(int a[],int b[],int m, int n){
        int[] c=new int[m+n];
        for(int i=0;i<m;i++){
            c[i]=a[i];
        }
        for(int i=0;i<n;i++){
            c[m+i]=b[i];
        }
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            if(i==0|| c[i]!=c[i-1]){
                System.out.println(c[i]+" ");
            }
        }
    }*/
    static void union(int a[],int b[],int m, int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]>b[j]){
                System.out.println(b[j]+" ");
                j++;
            }
            else if(a[i]<b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<m){
            if(i>0 && a[i]!=a[i-1]){
                System.out.println(a[i]+" ");
                i++;
            }
        }
        while(j<n){
            if(j>0 && a[j]!=a[j-1]){
                System.out.println(a[j]+" ");
                j++;
            }
        }
    }
}