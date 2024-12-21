package personal;

public class NVariableTruthTable {
    public static void main(String[] args) {
        int n = 5;
        generateTable(0,n,new int[n]);
    }
    public static void generateTable(int index, int size, int[] current) {
        if(index == size) { // generated a full "solution"
            for(int i = 0; i < size; i++) {
                System.out.print(current[i] + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < 2; i++) {
                current[index] = i;
                generateTable(index + 1, size, current);
            }
        }
    }
}
