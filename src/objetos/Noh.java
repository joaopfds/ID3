package objetos;

public class Noh {

	String classeNome;
	String nomePropNoh;
	String valorPropRamo;
	String valorClasseFolha;
	Noh filho;

	public Noh() {

	}

	public Noh(String classeNome, String nomePropNoh, String valorPropRamo, String valorClasseFolha, Noh filho) {
		this.nomePropNoh = nomePropNoh;
		this.valorPropRamo = valorPropRamo;
		this.valorClasseFolha = valorClasseFolha;
		this.filho = filho;
		this.classeNome = classeNome;
	}

	public String getClasseNome() {
		return classeNome;
	}

	public void setClasseNome(String classeNome) {
		this.classeNome = classeNome;
	}

	public String getNomePropNoh() {
		return nomePropNoh;
	}

	public void setNomePropNoh(String nomePropNoh) {
		this.nomePropNoh = nomePropNoh;
	}

	public String getValorPropRamo() {
		return valorPropRamo;
	}

	public void setValorPropRamo(String valorPropRamo) {
		this.valorPropRamo = valorPropRamo;
	}

	public String getValorClasseFolha() {
		return valorClasseFolha;
	}

	public void setValorClasseFolha(String valorClasseFolha) {
		this.valorClasseFolha = valorClasseFolha;
	}

	public Noh getFilho() {
		return filho;
	}

	public void setFilho(Noh filho) {
		this.filho = filho;
	}
}
