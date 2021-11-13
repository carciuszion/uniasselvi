package ordenacao;

import java.util.Comparator;

public class ProviderCodigo implements Comparator<Estudante>{

	@Override
	public int compare(Estudante o1, Estudante o2) {
			return o1.getMatricula()-o2.getMatricula();
	}

}
