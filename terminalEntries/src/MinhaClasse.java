import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println(nome);

        System.out.println("Digite seu nome: ");
        String sobrenome = scanner.next();
        System.out.println(sobrenome);

        System.out.println("Digite seu nome: ");        
        int idade = scanner.nextInt();
        System.out.println(idade);

        scanner.close();
    }
}
