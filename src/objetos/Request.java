package objetos;

import java.util.List;

public class Request {

	List<DadoEClasse> listaDadosEClasse;
	
	public Request() {
		
	}

	public Request(List<DadoEClasse> listaDadosEClasse) {
		setListaDadosEClasse(listaDadosEClasse);
	}

	public List<DadoEClasse> getListaDadosEClasse() {
		return listaDadosEClasse;
	}

	public void setListaDadosEClasse(List<DadoEClasse> listaDadosEClasse) {
		// TODO Julio
		for (int i = 0; i < listaDadosEClasse.size()-1; i++) {
			String nomeAnterior = listaDadosEClasse.get(i).getClasse().getClasseNome();
			String nomeProximo = listaDadosEClasse.get(i+1).getClasse().getClasseNome();

			if (!nomeAnterior.equals(nomeProximo)) {
				throw new ExceptionInInitializerError();
			}
		}
		
		this.listaDadosEClasse = listaDadosEClasse;
	}
	
//	"listaDadosEClasse": 
//	{
//		{
//			"listaDado": {
//			"chave": "Historico de Credito";
//			"valor": "Valor";
//			}, 
//			"Classe": {
//			"ClasseNome": "Risco";
//			"ClasseValor": "Alto";
//			}
//		},
//		{
//			"listaDado": {
//			"chave": "Divida";
//			"valor": "Valor 2";
//			}, 
//			"Classe": {
//			"ClasseNome": "Risco";
//			"ClasseValor": "Alto";
//			}
//		},
//	}
	
	
}
