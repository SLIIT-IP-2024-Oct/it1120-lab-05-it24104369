import java.util.Scanner;

public class IT24104369Lab5Q1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the firt intiger:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second intiger:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third intiger:");
        int num3 = scanner.nextInt();

        System.out.println("user enterd nombers are: " + num1 +" "+num2 + " "+num3);
        int Smallest= Math.min(num1 , Math.min(num2,num3));
        int Largest= Math.max(num1, Math.max(num1,num2));

        System.out.println("The Small nomber is: " + Smallest);
        System.out.println("The Largest nomber is: " + Largest);

    }
}