package lista04a;


/**
 * representa um compromisso de um medico(uma consulta).
 * @author jclri
 *
 */
public class Compromisso {
	
	private Paciente paciente;
	
	private String data;
	
	private String hora;
	
	private String medico;

	
	
	public Compromisso(Paciente paciente, String data, String hora, String medico) {

		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	public String toString() {
		return "Paciente: \t "+this.paciente+"\nData e Hora: "+this.data+" "+this.hora+"\nMedico: "+this.medico;
	}

}
