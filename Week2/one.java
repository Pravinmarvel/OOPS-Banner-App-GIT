import java.util.Scanner;
public class HELLO {
    public static void main(String[] args) {
        int year=2000;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        age = input.nextInt();
        System.out.println(age-year);
    }
}
