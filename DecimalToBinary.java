Decimal to Binary -> Using String() methods in Java
CODE:
import java.util.*;
class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }
}
