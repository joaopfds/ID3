package objetos;

public class Classe {
	
	String classeNome;
	String classeValor;
	
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
	
	public Classe() {
		
	}
	
	public Classe(String classeNome, String classeValor) {
		this.classeNome = classeNome;
		this.classeValor = classeValor;
	}
	
	public String getClasseNome() {
		return classeNome;
	}
	public void setClasseNome(String classeNome) {
		this.classeNome = classeNome;
	}
	public String getClasseValor() {
		return classeValor;
	}
	public void setClasseValor(String classeValor) {
		this.classeValor = classeValor;
	}
}
