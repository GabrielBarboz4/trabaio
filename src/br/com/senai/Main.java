<<<<<<< Updated upstream
package br.com.senai;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	static Scanner input = new Scanner(System.in);
	static ArrayList<Contatos> contatos = new ArrayList<>();

	static int id = 0;

	public static void main(String[] args) {

		while (true) {
			exibirMenu();
			int valorDigitado = input.nextInt();
			input.nextLine();
			switch (valorDigitado) {
			case 1:
				cadastrarContato();
				break;
			case 2:
				//listarContatos();
				break;
			case 3:
				//buscarContato();
				break;
			case 4:
				//editarContato();
				break;
			case 5:
				//excluirContato();
				break;
			case 6:
				System.out.println("Sistema finalizado");
				System.exit(0);
			default:
				System.out.println("Valor inválido");
			}
		}
	}
	
	public static boolean isValidTelefone(String telefone) {
		if (telefone == null) {
			return false;
		}

		String telefoneRegex = "\\d{2}\\d{5}\\d{4}";

		Pattern pattern = Pattern.compile(telefoneRegex);
		Matcher matcher = pattern.matcher(telefone);
		return matcher.matches(); 
	}
	
	public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;       
            }
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches(); 
    }
	public static Contatos cadastrarContato() {
		Contatos contato = new Contatos();
		id = id + 1;
		contato.idContato=id;
		System.out.print("Informe o nome: ");
		contato.nome = input.nextLine();
		do {
			System.out.println("Informe o numero: (apenas numeros DDD + 9 XXXX-XXXX ");
		contato.numero = input.nextLine();
		if (!isValidTelefone(contato.numero)) {
			System.out.println("O número de telefone é inválido.");
		}
		}while(!isValidTelefone(contato.numero));
		do {
			System.out.println("Informe um email: ");
			contato.email = input.nextLine();
			if (!isValidEmail(contato.email)) {
				System.out.println("Endereço de email inválido!");
			}
		}while(!isValidEmail(contato.email));
		return contato;
	}

	public static void exibirMenu() {
        System.out.println("BEM VINDO A AGENDA");
        System.out.println("Digite a opção desejada:");
        System.out.println("1- Cadastrar contatos");
        System.out.println("2- Listar contatos");
        System.out.println("3- Buscar contato");
        System.out.println("4- Excluir contato");
        System.out.println("5- Editar contato");
        System.out.println("6- Encerrar sistema");

    }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	static Scanner input = new Scanner(System.in);
	static ArrayList<Contatos> contatos = new ArrayList<>();

	static int id = 0;

	public static void main(String[] args) {

		exibirMenu();
		while (true) {
			int valorDigitado = input.nextInt();
			input.nextLine();
			switch (valorDigitado) {
			case 1:
				cadastrarContato();
				break;
			case 2:
				//listarContatos();
				break;
			case 3:
				//buscarContato();
				break;
			case 4:
				//editarContato();
				break;
			case 5:
				//excluirContato();
				break;
			case 6:
				System.out.println("Sistema finalizado");
				System.exit(0);
			default:
				System.out.println("Valor invï¿½lido");
			}
		}
	}
	public static boolean isValidTelefone(String telefone) {
		if (telefone == null) {
			return false;
		}
		;
		String telefoneRegex = "\\(\\d{2}\\) \\d{4}-\\d{5}";
		;
		Pattern pattern = Pattern.compile(telefoneRegex);
		Matcher matcher = pattern.matcher(telefone);
		return matcher.matches(); 
	}
	
	public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;       
            }
        ;
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        ;
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches(); 
    }
	
	public static Contatos cadastrarContato() {
		Contatos contato = new Contatos();
		id = id + 1;
		contato.idContato=id;
		System.out.print("Informe o nome: ");
		contato.nome = input.nextLine();
		
		do {
			System.out.println("Informe o numero: (XX) XXXX-XXXXX ");
		contato.numero = input.nextLine();
		if (!isValidTelefone(contato.numero)) {
			System.out.println("O nï¿½mero de telefone ï¿½ invï¿½lido.");
		}
		}while(!isValidTelefone(contato.numero));
		
		do {
			System.out.println("Informe um email: ");
			contato.email = input.nextLine();
			if (!isValidEmail(contato.email)) {
				System.out.println("Endereï¿½o de email invï¿½lido!");
			}
		}while(!isValidEmail(contato.email));
		
		return contato;
		}
	
	public static void exibirMenu() {
        System.out.println("BEM VINDO A AGENDA");
        System.out.println("Digite a opï¿½ï¿½o desejada:");
        System.out.println("1- Cadastrar contatos");
        System.out.println("2- Listar contatos");
        System.out.println("3- Buscar contato");
        System.out.println("4- Excluir contato");
        System.out.println("5- Editar contato");
        System.out.println("6- Encerrar sistema");
    }
}
>>>>>>> Stashed changes
