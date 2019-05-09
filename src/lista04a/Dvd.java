package lista04a;

/**
 * Representa um DVD.
 * 
 * @author jclri
 *
 */
public class Dvd {

	private String titulo;
	private Integer ano;
	private Integer duracao;

	public Dvd(String titulo, Integer ano, Integer duracao) {
		this.titulo = titulo;
		this.ano = ano;
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {

		return "\nTitulo: " + this.titulo + "\nAno: " + this.ano + "\nDuração: " + this.duracao+"\n";
	}

}
