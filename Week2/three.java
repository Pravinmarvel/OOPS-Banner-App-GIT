import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        int costprice=129,sellingprice=191;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();
        int miles=(int)(km/1.6);
        
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
