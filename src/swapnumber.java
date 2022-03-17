public class swapnumber {

    public static void main(String[] args) {

        int num1 =2, num2 =4;

        System.out.println("Before Swap");
        System.out.println("Num1 " +num1 +'\n' +"Num2 " +num2);

        num1 = num1 -num2; // 2 -4 = -2
        num2 = num1 + num2; // -2 + 4 = 2
        num1 =num2 +num2;   // 2 + 2 = 4

        System.out.println("After Swap");
        System.out.println("Num1 " +num1 +'\n' +"Num2 " +num2);
    }
}
/*
Swap two numbers without using the third Variable
ex ., a=2 and b=4 and o/p ->a=4,b=2
 */