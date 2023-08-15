package br.senai.sp;

import java.util.Scanner;

public class entradadeEstadio {
    public static void main(String[] args) {

        /** Criar Variaveis */
        String nome;
        int corCamisa;
        int idade;

        /** Instanciar Scaaner */
        Scanner teclado = new Scanner(System.in);

        /** Organização do Estádio */
        System.out.println("Bem vindo ao Estádio");
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        System.out.println("Qual a cor da sua camissa [1- Azul 2-Branca 3-Vermelha 4-Preta 5-Amarela 6-Verde]: ");
        corCamisa = teclado.nextInt();

        switch (corCamisa){
            case 1:
                System.out.println("Arquibancada A");
            break;

            case 2:
                System.out.println("Arquibancada B");
            break;

            case 3:
                System.out.println("Arquibancada C");
            break;

            case 4:
                System.out.println("Arquibancada D");
            break;

            case 5:
                System.out.println("Arquibancada E");
            break;

            case 6:
                System.out.println("Arquibancada F");
            break;

        }
        System.out.println("Não entre !!!");

    }
}
