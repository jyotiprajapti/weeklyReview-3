public class NthEvenFibbonacci {
    public static void main(String[] args) {
        int n=10;
        int a=1;
        int b=1;
        int sum =0;
        int count=0;
        for(int i=1;;i++){
            if(a%2==0){
                count=count+1;
                if(count==n){
                    break;
                }
            }
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(a);
    }
}
