package br.com.senai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcoes funcoes = new Funcoes();

        Menu.exibirMenu();
        while (true) {
            int valorDigitado = input.nextInt();
            switch (valorDigitado) {
                case 1:
                    funcoes.cadastrarContato();
                    break;
                case 2:
                    Funcoes.listarContatos();
                    break;
                case 3:
                    Funcoes.buscarContato();
                    break;
                case 4:
                    Funcoes.editarContato();
                    break;
                case 5:
                    Funcoes.excluirContato();
                    break;
                case 6:
                    System.out.println("Sistema finalizado");
                    System.exit(0);
                default:
                    System.out.println("Valor inválido");
            }
        }


    }
}
