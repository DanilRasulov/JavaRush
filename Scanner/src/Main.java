import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите своё имя.");
        String name = console.nextLine();


        System.out.println("Введите свой возрост.");
        int age = console.nextInt();



        System.out.println("Введите свой пол");
        String all = console.next();

        System.out.println("Введите рост");
        double height = console.nextDouble();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("All " + all);
        System.out.println("Height " + height);
    }
}