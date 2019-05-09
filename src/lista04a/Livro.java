package lista04a;

import java.util.ArrayList;

/**
 * classe criada para representar um livro
 * @author jclri
 *
 */
public class Livro {
	
	private String codigo;
	
	private String titulo;
	
	private ArrayList<String> autores;
	
	private String isbn;
	
	private Integer ano;

	/**
	 * Retorna o codigo do livro.
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Altera o codigo do livro.
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Retorna o titulo do livro.
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Altera o titulo do livro
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Retorna o nome dos autores.
	 * @return
	 */
	public ArrayList<String> getAutores() {
		return autores;
	}

	/**
	 * Altera o nome dos autores.
	 * @param autores
	 */
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	/**
	 * Retorna o codigo isbn.
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Altera o codigo isbn
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Retorna o ano do livro
	 * @return
	 */
	public Integer getAno() {
		return ano;
	}

	/**
	 * Altera o nome do livro
	 * @param ano
	 */
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Codigo: "+ this.codigo + "\nTitulo: "+ this.titulo;
	}


}
