package adivinhenumero;

import java.util.Random;
import java.util.Scanner;

public class adivinhenumero {

    public static void main(String[] args) {
        // Cria um objeto Random para gerar o número aleatório
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Número aleatório entre 1 e 100

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite está baixo. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite está alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

        // Fecha o scanner
        scanner.close();
    }
}
