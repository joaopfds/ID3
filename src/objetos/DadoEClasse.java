package objetos;

import java.util.List;

public class DadoEClasse {

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
	
	public DadoEClasse(List<Dado> dado, Classe classe) {
		this.dado = dado;
		this.classe = classe;
	}
	
	public DadoEClasse() {
	}
	
	List<Dado> dado;
	Classe classe;
	
	public List<Dado> getDado() {
		return dado;
	}
	public void setDado(List<Dado> dado) {
		this.dado = dado;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
}

