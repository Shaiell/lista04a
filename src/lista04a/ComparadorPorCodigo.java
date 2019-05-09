package lista04a;

import java.util.Comparator;

public class ComparadorPorCodigo implements Comparator<Paciente>{

	@Override
	public int compare(Paciente o1, Paciente o2) {
		
		return o1.getCodigo().compareTo(o2.getCodigo());
	}

	
	
	
}
