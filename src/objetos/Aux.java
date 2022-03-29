package objetos;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Aux {

	List<Map<String, String>> listaDados;
	Set<String> setProp;

	public Aux() {
		
	}

	public List<Map<String, String>> getListaDados() {
		return listaDados;
	}

	public void setListaDados(List<Map<String, String>> listaDados) {
		// TODO Joao

		int tamanhoAnterior = 0;
		for (Map<String, String> map : listaDados) {
			int tamanhoAtual = map.size();
			if (tamanhoAtual != tamanhoAnterior) {
				throw new ExceptionInInitializerError();
			}
			tamanhoAnterior = tamanhoAtual;
		}
		this.listaDados = listaDados;
	}

	public Set<String> getSetProp() {
		return this.setProp;
	}

	public void setSetProp(Set<String> setProp) {
		this.setProp = setProp;
	}

}
