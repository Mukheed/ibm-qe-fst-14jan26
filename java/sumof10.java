public class sumof10 {
    public static void main(String[] args) {
        int [] arr={10,20,30,10,10,40};
        int count=0;
        for(int x:arr){
            if(x==10){
                count+=x;
            }
        }
        System.out.println(count);
        if(count==30){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
    
}
