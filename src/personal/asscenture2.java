package personal;

public class asscenture2 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,7,5,4};
        int maxodd = 0;
        int maxeven = 0;
        int seclargesteven = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(maxodd<arr[i]){
                    maxodd=arr[i];
                }
            }else {
                if(maxeven<arr[i]){
                    maxeven=arr[i];
                }
            }
        }
        int seclargest = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(seclargest<arr[i]){
                    if(maxeven!=arr[i]){
                        seclargest=arr[i];
                    }

                }

            }

            else {
                if(seclargesteven<arr[i]){
                    if(maxeven!=arr[i]){
                        seclargesteven=arr[i];
                    }

                }
            }
        }
        System.out.println(maxeven);
        System.out.println(maxodd);

        System.out.println(seclargesteven);
        System.out.println(seclargest);
    }
}
