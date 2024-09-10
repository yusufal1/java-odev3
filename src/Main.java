import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       double a, b, c, u, alan;

       Scanner scanner = new Scanner(System.in);

        System.out.print("1. kenarı giriniz:");
        a = scanner.nextDouble();
        System.out.print("2. kenarı giriniz:");
        b = scanner.nextDouble();
        System.out.print("3. kenarı giriniz:");
        c = scanner.nextDouble();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı = " + alan);

    }
}