public class SwapTwoNumbers {
    public static void main(String[] args) {
       int a=30;
       int b=20;
        System.out.println(" value of a without swapping is: " +a+" value of b without swapping is: "+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("both numbers are swapped value of 'a' is : "+a+" value of b is; "+b);
    }
}