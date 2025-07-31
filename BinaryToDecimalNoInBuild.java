Java code to convert Binary to Decimal without using In-Build functions
CODE:
import java.util.*;
public class BinaryToDecimalNoInBuild{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = 0;
        int power = 0;
        for(int i=binary.length()-1;i>=0;i--){
            char bit = binary.charAt(i);
            if(bit == '1'){
                decimal += Math.pow(2,power);
            }
            power++;
        }
        System.out.println("Decimal value is : "+decimal);
    }
}
