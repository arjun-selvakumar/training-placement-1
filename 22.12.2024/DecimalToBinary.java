import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binary);
    }
}
