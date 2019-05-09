package lista04a;

import java.util.ArrayList;

/**
 * Representa um coleção de DVD.
 * 
 * @author jclri
 *
 */

public class Colecao {

	private ArrayList<Dvd> colecao;

	public Colecao() {
		this.colecao = new ArrayList<Dvd>();
	}

	/**
	 * Adiciona um dvd a lista.
	 * 
	 * @param dvd
	 * @return
	 */
	public void addDVD(Dvd dvd) {
		colecao.add(dvd);
	}

	public ArrayList<Dvd> getColecao() {
		return colecao;
	}

	/**
	 * Remove um dvd da coleção.
	 * 
	 * @param titulo informado para localizar o dvd a ser retirado da coleção
	 * @return o dvd retirado da coleção.
	 */
	public Dvd removeDvd(String titulo) {
		Dvd dvd = null;
		Dvd removido = null;
		if (this.colecao == null) {
			return null;
		} else {
			for (int i = 0; i < this.colecao.size(); i++) {
				dvd = this.colecao.get(i);
				String tituloAux = dvd.getTitulo();
				if (titulo.contains(tituloAux)) {
					removido = this.colecao.get(i);
					this.colecao.remove(i);
				}
			}
			return removido;
		}
	}

	/**
	 * Lista os dvds que a coleção contem
	 * 
	 * @return retorna a lista.
	 */

	public String listarColecao() {

		String retorno = "";

		if (this.colecao.isEmpty()) {
			retorno = "Coleção Vazia.";

		} else {
			for (int i = 0; i < this.colecao.size(); i++) {
				Dvd dvd = this.colecao.get(i);
				retorno += dvd.toString();
			}
		}
		return retorno;
	}
}
