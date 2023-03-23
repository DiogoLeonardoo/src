

import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá digite o seu nome");
    String nome = scanner.next();

    System.out.println("Olá digite a sua idade");
    int idade = scanner.nextInt();

    System.out.println("Olá digite a sua altura");
    double altura = scanner.nextInt();
        
    
    System.out.println("Olá " + nome + "Seja Bem Vindo(A). A sua idade é de" + idade + "e a sua altura é " + altura);
    


    }
}
