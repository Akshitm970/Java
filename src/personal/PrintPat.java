package personal;

//import static javax.print.attribute.standard.MediaSizeName.C;

public class PrintPat {
    public static void main(String[] args) {
        char[] a = {'A','B','C','D','E','F'};
        printPatter(a,0);
    }
    public static void printPatter(char[] a,int i){
        if (i==a.length){
            for (i=0;i<a.length;i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
        printPatter(a,i+1);
        a[i] = 1;
        printPatter(a,i+1);
    }
}
