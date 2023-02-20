public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] array ={5,2,8,9,7,3,2};
        int  min=array[0];
        int count=0;
        for(int i=1;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("minimum element is " +min);
        for(int i=0;i< array.length;i++){
            if(array[i]==min){
                count = count+1;
            }
        }
        System.out.println("the elemnt appeared "+ count+" times");
    }
}
