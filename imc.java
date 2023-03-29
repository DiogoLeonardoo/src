import java.util.Scanner;
import java.util.Random;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?: ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu peso (kg): ");
        double peso = scanner.nextInt();

        System.out.println("Digite a sua altura (cm): ");
        double altura = scanner.nextInt();
        altura = altura/100;

        double imc = peso/(altura*altura);
        System.out.println("O seu IMC é de: " + imc);

        if(imc<18.5){
            System.out.println("Você está abaixo do seu peso normal ");
        }
        else if(imc>18.5 && 24.9>imc) {
            System.out.println("Você está no seu peso normal ");
        }
        else if(imc>25 && imc<29.9){
            System.out.println("Você está em excesso de peso");
        }
        else if(imc>30 && imc<34.9){
            System.out.println("Você está em obesidade tipo 1");
        }
        else if(imc>35 && imc<39.9){
            System.out.println("Você está em obesidade tipo 2");
        }

        else{
            System.out.println("Você está em obesidade tipo 3");
        }
       
    }
}
