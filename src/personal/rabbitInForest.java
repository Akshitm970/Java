package personal;

public class rabbitInForest {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,2,2};
        int x = numRabbits(arr);
        System.out.println(x);
    }
    public static int numRabbits(int[] answers) {
        int rabbits = 0;
        int[] map = new int[1000];
        for(int answer : answers){
            if(map[answer] == 0){
                rabbits += answer+1;
                map[answer] = answer;
            }else {
                --map[answer];
            }
        }
        return rabbits;
    }
}
