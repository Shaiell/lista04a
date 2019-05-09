package lista04a;

/**
 * Classe que representa um ponto
 * 
 * @author jclri
 *
 */
public class Ponto {

	private Double x;

	private Double y;

	public Ponto() {
		this.x =0d;
		this.y =0d;
	}

	public Ponto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double calculaDistancia(Double x, Double y) {

		Double dx = this.x - x;
		Double dy = this.y - y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

	public Double distancia(Ponto ponto) {

		return calculaDistancia(ponto.getX(), ponto.getY());

	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

}
