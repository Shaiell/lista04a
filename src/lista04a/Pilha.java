package lista04a;

import java.util.ArrayList;

/**
 * Classe criada para determinar uma pilha de livros.
 * 
 * @author jclri
 *
 */

public class Pilha {

	/**
	 * representa a pilha em formado de Array.
	 */
	private ArrayList<Livro> pilhaDeLivros;
	/**
	 * Representa a quantidade maxima de livros da pilha.
	 */
	private Integer topo;

	/**
	 * sempre sera o ultimo livro a ser inserido.
	 */
	private static final int POSICAO_DE_INSERCAO_PADRAO = 0;

	public Pilha() {
		this.topo = 5;
		this.pilhaDeLivros = new ArrayList<Livro>();
	}

	/**
	 * Faz a tentativa de inserir um livro na pilha.
	 * 
	 * @param livro a ser inserido.
	 */
	public void push(Livro livro) throws Exception {

		if (!cheia()) {
			this.pilhaDeLivros.add(POSICAO_DE_INSERCAO_PADRAO, livro);
		}else {
			throw new Exception("Pilha cheia! Livro não inserido");
		}

	}

	/**
	 * Remove e retorna o Livro no topo da pilha,
	 * 
	 * @return
	 */
	public Livro pop() {

		if (vazia()) {
			return null;
		} else {
			Livro removido = this.pilhaDeLivros.remove(POSICAO_DE_INSERCAO_PADRAO);
			return removido;
		}

	}

	/**
	 * verifica o livro na ultima posição da pilha.
	 * 
	 * @return retrona o livro que esta na ultima posição.
	 */
	public Livro peek() {

		if (vazia()) {
			return null;
		} else {
			Livro doTotpo = this.pilhaDeLivros.get(POSICAO_DE_INSERCAO_PADRAO);
			return doTotpo;
		}
	}

	/**
	 * Verifica se a pilha esta cheia.
	 * 
	 * @returntrue para cheia ou false caso não esteja cheia.
	 */
	public Boolean cheia() {

		return this.pilhaDeLivros.size() == this.topo;

//		if (this.pilhaDeLivros.size() == this.topo) {
//			return true;
//		} else {
//			return false;
//		}
	}

	/**
	 * Verifica se a pilha esta vazia
	 * 
	 * @return true se esta vazia ou false se houver um livro ou mais.
	 */
	public Boolean vazia() {

		return this.pilhaDeLivros.size() == 0;

	}

	public String toString() {
		String retorno = "\n ***Topo da Pilha***\n";

		for (Livro livro : pilhaDeLivros) {

			retorno += livro + "\n";
		}

		retorno += "**********Mesa***********";
		return retorno;
	}
}
