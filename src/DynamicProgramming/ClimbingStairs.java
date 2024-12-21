package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int s = 10;
        int[] qb = new int[s+1];
//        System.out.println(countstairsway(s));
        System.out.println(countstairswayTabulation(s));
//        System.out.println(countstairsway2(s,qb));
    }
    public static int countstairsway(int s){
//        if( s == 0||s==1 || s == 2 || s == 3){
//            return s;
//        }
        if(s == 0){
            return 1;
        }
        if(s<0){
            return 0;
        }
        int one = countstairsway(s-1);
        int two = countstairsway(s-2);
        int three = countstairsway(s-3);
        return one + two + three;
    }
    public static int countstairsway2(int s,int[] qb){
        if(s == 0){
            return 1;
        }
        if(s<0){
            return 0;
        }
        if(qb[s]!=0){
            return qb[s];
        }
        int one = countstairsway2(s-1,qb);
        int two = countstairsway2(s-2,qb);
        int three = countstairsway2(s-3,qb);
        qb[s] = one + two + three;
        return one + two + three;
    }
    public static int countstairswayTabulation(int s){
        int[] bq = new int[s+1];
        bq[0] = 1;
        for(int i=1;i<=s;i++){
            if(i==1){
                bq[i] = bq[i-1];
            }
            else if(i==2){
                bq[i] = bq[i-1]+bq[i-2];
            }
            else{
            bq[i] = bq[i-1]+bq[i-2]+bq[i-3];
            }
        }
        return bq[s];
    }
}
