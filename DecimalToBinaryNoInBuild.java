Decimal to Binary without in-build functions
CODE;
import java.util.*;
public class DecimalToBinaryNoInBuild{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = "";
        if(decimal == 0){
            binary = "0";
        }
        while(decimal > 0){
            int remainder = decimal%2;
            binary = remainder+binary;
            decimal/=2;
        }
        System.out.println(binary);
    }
}
