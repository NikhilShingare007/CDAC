package Allpattern;

public class abcTriangle {
    public static void main(String[] args) {
        char ch ='A';
        for(int i=0;i<6;i++) {
            for(int j=0;j<6-i;j++) {
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }

    }
}
