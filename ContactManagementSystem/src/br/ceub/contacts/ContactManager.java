package br.ceub.contacts;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
    	 // Crie uma instância de ContactList para gerenciar os contatos.
    	Scanner scanner = new Scanner(System.in);
    	ContactList contactList = new ContactList();
    	
    	int option;
    	
    	do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, phone, email);
                    contactList.addContact(contact);
                    break;
                case 2:
                    System.out.print("Nome ou Telefone para busca: ");
                    String searchKey = scanner.nextLine();
                    contactList.searchContact(searchKey);
                    break;
                case 3:
                    System.out.print("Nome ou Telefone para remoção: ");
                    String removeKey = scanner.nextLine();
                    contactList.removeContact(removeKey);
                    break;
                case 4:
                    contactList.listContacts();
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 0);

        scanner.close();
    }
}

