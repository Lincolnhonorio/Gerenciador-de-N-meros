package contato;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	ContactManager gerenciador = new ContactManager();
	Scanner scan = new Scanner (System.in);
	int opcao;
		
	do {
	    System.out.println("===Lista de Contatos===");
	    System.out.println("1.Adicionar a lista");
	    System.out.println("2.Lista Completa");
	    System.out.println("3.Editar Contatos");
	    System.out.println("4.Deletar Contato");
	    System.out.println("5.Buscar Contato");
	    System.out.println("6.Sair");
	    System.out.println("Escolha uma opção");
	    
	    opcao = scan.nextInt();
	    scan.nextLine();
	    
	    switch(opcao) {
	    case 1: 
	    	System.out.print("Digite um nome: ");
	    	String nome = scan.nextLine();
	    	System.out.print("Digite um telefone: ");
	    	String telefone = scan.nextLine();
	        System.out.print("Digite um email: ");
	        String email = scan.nextLine();
	        gerenciador.addContact(new Contact(nome, telefone, email));
	        System.out.println("Contato salvo com sucesso.");
	        break;
	    case 2:
	    	System.out.println("===Lista de Contatos===");
            for (Contact contact : gerenciador.listContacts()) {
                System.out.println(contact);
            }
            break;
	    case 3:
	    	System.out.print("Entre com o nome de contato que deseja editar: ");
            nome = scan.nextLine();
            System.out.print("Entre com novo número: ");
            telefone = scan.nextLine();
            System.out.print("Entre com o novo email: ");
            email = scan.nextLine();
            if (gerenciador.editarContato(nome, telefone, email)) {
                System.out.println("Contato Atualizado com Sucesso.");
            } else {
                System.out.println("Contato não encontrado.");
            }
            break;

        case 4:
            System.out.print("Entre com o nome de contato que deseja deletar: ");
            nome = scan.nextLine();
            if (gerenciador.excluirNumero(nome)) {
                System.out.println("Contato detetado com Sucesso.");
            } else {
                System.out.println("Contato não encontrado.");
            }
            break;

        case 5:
            System.out.print("Entre com o nome de contato que deseja deletar: ");
            nome = scan.nextLine();
            Contact contact = gerenciador.buscarNumero(nome);
            if (contact != null) {
                System.out.println(contact);
            } else {
                System.out.println("Contato não encontrado.");
            }
            break;

        case 6:
            System.out.println("Saindo ...");
            break;

        default:
            System.out.println("Opção Inválida, Digite novamente");
    }
	} while (opcao != 6);
	    
	scan.close();
	}

}
