Java code to convert Binary to Decimal
CODE:
import java.util.*;
public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = Integer.parseInt(binary,2);
        System.out.println(decimal);
    }
}
