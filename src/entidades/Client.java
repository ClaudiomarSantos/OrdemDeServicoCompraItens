package entidades;

import java.time.LocalDate;

public class Client {
	private String nome, email;
	private LocalDate birthDate;
	
	

	public Client() {
	}

	public Client(String nome, String email, LocalDate birthDate) {
		this.nome = nome;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Client: " + nome + " " + birthDate + " - " + email ;
	}

}
