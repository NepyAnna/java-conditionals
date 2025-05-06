import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de usuario:");
        String username = scanner.nextLine();

        System.out.print("Contraseña:");
        String password = scanner.nextLine();

        String correctUsername = "user";
        String correctPassword = "password";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }
    }
}
