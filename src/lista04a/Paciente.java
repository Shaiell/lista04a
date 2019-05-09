package lista04a;

import java.util.ArrayList;

/**
 * Representa um paciente em uma consulta
 * 
 * @author jclri
 *
 */
public class Paciente implements Comparable<Paciente>{

	private String codigo;

	private String nome;

	private ArrayList<String> historico;

	public Paciente(String codigo, String nome) {

		this.codigo = codigo;
		this.nome = nome;

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addHistorico(String doenca) {
		if (this.historico == null) {
			this.historico = new ArrayList<String>();
		}
		this.getHistorico().add(doenca);
	}

	public ArrayList<String> getHistorico() {
		return historico;
	}
	
	public String toString() {
		return "codigo:"+ this.codigo+ "\nNome: "+ this.nome+"\nHistorico: "+this.historico;
	}

	@Override
	public int compareTo(Paciente o) {
		return this.nome.compareTo(o.getNome());
	}

}
