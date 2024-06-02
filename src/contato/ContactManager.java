package contato;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

	private List<Contact> contacts;
	
	public ContactManager() {
		this.contacts = new ArrayList<>();
	}
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	public List<Contact> listContacts(){
		return contacts;
	}
	
	public Contact buscarNumero(String nome) {
		for(Contact contact: contacts) {
			if(contact.getNome().equalsIgnoreCase(nome)) {
				return contact;
			}
		} 
		return null;
	}
	
	public boolean editarContato(String nome, String novoTelefone, String novoEmail) {
		Contact contact = buscarNumero(nome);
		if(contact != null) {
			contact.setTelefone(novoTelefone);
			contact.setEmail(novoEmail);
			return true;
		}
		return false;
	} 
	public boolean excluirNumero(String nome) {
		if(contacts != null) {
			contacts.remove(contacts);
			return true;
		}
		return false;
	}
}
