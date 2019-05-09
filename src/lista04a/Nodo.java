package lista04a;

/**
 * representa um nó entre as pessoas na fila.
 * 
 * @author jclri
 *
 */
public class Nodo {

	private Paciente paciante;

	private Nodo prox;

	public Nodo(Paciente paciente) {
		this.paciante = paciente;
	}

	public Paciente getPaciante() {
		return paciante;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

}
