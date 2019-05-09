package lista04a;

/**
 * Representa uma fila do sus.
 * 
 * @author jclri
 *
 */
public class Fila {

	private Nodo head;

	public Fila() {

	}

	/**
	 * adiciona um paciente na fila.
	 * 
	 * @param paciente
	 */

	public void enqueue(Paciente paciente) {
		Nodo nodo = new Nodo(paciente);
		if (this.head == null) {
			this.head = nodo;
		} else {
			Nodo atual = this.head;

			while (atual.getProx() != null) {
				atual = atual.getProx();
			}
			atual.setProx(nodo);
		}
	}

	/**
	 * retira um paciente da fila.
	 * 
	 * @return
	 */

	public Paciente dequeue() {

		if (this.head == null) {
			return null;
		} else {
			Paciente paciente = this.head.getPaciante();

			this.head = this.head.getProx();

			return paciente;
		}

	}

	public String toString() {

		String retorno = "Fila: ";

		if (this.head == null) {
			retorno += "\t *Vazia*";
		} else {
			Nodo atual = this.head;

			while (atual!= null) {
				retorno += "\t" + atual.getPaciante().getNome();
				atual = atual.getProx();
			}
		}

		retorno += " Fim.";
		return retorno;

	}
}
