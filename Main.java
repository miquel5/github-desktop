import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona la rama a ejecutar (1 o 2): ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                Branch1 branch1 = new Branch1();
                branch1.execute();
                break;
            case 2:
                Branch2 branch2 = new Branch2();
                branch2.execute();
                break;
            default:
                System.out.println("Opción no válida. Elige 1 o 2.");
                break;
        }

        scanner.close();
    }
}