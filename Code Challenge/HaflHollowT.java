package Allpattern;

public class halfHollowT {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                
                if(j==1 || j==i) {
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }

                if(j < i) {
                    System.out.print( " ");
                }
            }

            System.err.println();
        }

        for(int i=1;i<=n+1;i++) {
            System.out.print(i+ " ");
        }

    }
}
