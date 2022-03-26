package objetos;

public class Dado {
	
	String chave;
	String valor;

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
	
	public Dado() {
	}
	
	public Dado(String chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

}
