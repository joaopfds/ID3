package objetos;

import java.util.List;

public class Noh {

	String classeNome;
	String nomePropNoh;
	String valorPropRamo;
	String valorClasseFolha;
	List<Noh> filhos;

	public Noh() {

	}

	public Noh(String classeNome, String nomePropNoh, String valorPropRamo, String valorClasseFolha, List<Noh> filho) {
		this.nomePropNoh = nomePropNoh;
		this.valorPropRamo = valorPropRamo;
		this.valorClasseFolha = valorClasseFolha;
		this.filhos = filho;
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

	public List<Noh> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Noh> filhos) {
		this.filhos = filhos;
	}
}
