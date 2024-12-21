package personal;

import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("{{}}}"));
        String a[] = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(a));
    }
    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
        while (true){
            if(s.contains("()")){
                s = s.replace("()", "");
            }else if(s.contains("{}")){
                s = s.replace("{}", "");
            }
            else if(s.contains("[]")){
                s = s.replace("[]", "");
            }
            else {
                return s.isEmpty();
            }
        }
    }
    public double[] convertTemperature(double celsius) {
        double Fahrenheit = (celsius*(9/5)+32);
        double Kelvin = (celsius+273.15);
        double[] a = { Kelvin,Fahrenheit};
        return a;
    }
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
//        char[] m = operations[0].toCharArray();
//        for(char c : operations.toCharArray()){
//            X = c;
//        }
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("X++")){
                X++;
            }
            else if(operations[i].equals("X--")){
                X--;
            }if(operations[i].equals("++X")){
                ++X;
            }
            else if(operations[i].equals("--X")){
                --X;
            }


        }
        return X;
    }
}
