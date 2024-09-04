package Allpattern;
public class HollowTriangleR {
    public static void main(String[] args) {
        int n=5;
        for(int i =1;i<=n+2;i++) {
            System.out.print("* ");
        }
        System.err.println();
        
        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k = n;k>=i;k--) {
                
                if(k==i || k==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }

                if(i<k) {
                    System.out.print(" ");
                }

                
            }
            System.out.println();
        }
    }
}
