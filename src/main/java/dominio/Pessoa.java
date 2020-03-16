package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// 1. O Entity é adicionado para indicar que essa classe é uma entidade de dominio que vai
// 2. corresponder a uma tabela.
@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	// 3. o atributo que corresponder a chave primaria da tabela é preciso colocar o 
	// 4. @id e depois @generatedValue indicando que a chave será gerada automaticamente.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	

}
