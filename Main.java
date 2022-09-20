import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int number = scan.nextInt();


        var convertor = new BitCalculator();
        convertor.calculateBit(number);
        scan.close();
    }
}