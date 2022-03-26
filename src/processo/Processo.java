package processo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import objetos.Aux;
import objetos.Aux2;
import objetos.Aux3;
import objetos.Aux4;
import objetos.Dado;
import objetos.DadoEClasse;
import objetos.Noh;
import objetos.Request;

public class Processo {

	public Aux prepara(Request request) {
		// TODO Rafael

		List<Map<String, String>> listaDados = new ArrayList<Map<String, String>>();

		for ( DadoEClasse dadosEClasse : request.getListaDadosEClasse()) {
			Map<String, String> dadoMap = new HashMap<String, String>();

			dadoMap.put(dadosEClasse.getClasse().getClasseNome(), dadosEClasse.getClasse().getClasseValor());
			for (Dado dado : dadosEClasse.getDado()) {
				dadoMap.put(dado.getChave(), dado.getValor());
			}
			
			listaDados.add(dadoMap);
		}
		
		Aux aux1 = new Aux(listaDados);
		return aux1;
		
		//	Noh retorno = new Noh();
		// induzirArvore(aux1, retorno);
	}
	
	public void induzirArvore(Aux aux1, Noh retorno) {

		Aux2 aux2 = new Aux2();
		 if (metodo0(aux1.getListaDados())) {
			retorno = metodo1(aux1.getListaDados());
		 }
		
		 else if (metodo1_5(aux1.getListaDados())) {
			retorno = metodo2(aux1.getListaDados());
		 }
		
		 else {
			Aux3 aux3 = metodo3(aux1.getSetProp());
			Aux4 aux4 = metodo4(aux3);
			metodo5(aux1, aux2, aux4, aux3, retorno, aux1.getListaDados());;
		 }
	}

	public Boolean metodo0(List<Map<String, String>> listaDados) {
		// TODO Joao
		return null;
	}
	
	public Noh metodo1(List<Map<String, String>> listaDados) {
		// TODO Joao
		return null;
	}
	
	public Boolean metodo1_5(List<Map<String, String>> listaDados) {
		// TODO Julio
		return null;
	}

	public Noh metodo2(List<Map<String, String>> listaDados) {
		// TODO Julio
		return null;
	}

	public Aux3 metodo3(Set<String> listaProps) {
		// TODO João
		return null;
	}

	public Aux4 metodo4(Aux3 aux3) {
		// TODO Rafael
		return null;
	}

	public void metodo5(Aux aux1, Aux2 aux2, Aux4 aux4, Aux3 aux3, Noh retorno, List<Map<String, String>> listaDados) {
		//TODO Rafael
		// TODO Depois, João
		for (String valor : aux4.getSetValores()) {
			aux2.setValor(valor);
			aux2.setRamoAtual(valor);
			
			List<Map<String, String>> particaoV = new ArrayList<Map<String, String>>();
			metodo6_construirParticao(aux3.getPropTirada(), valor, aux1.getListaDados(), particaoV);
			
			Noh novoNoh = metodo7(retorno, aux2);
			
			aux1 = new Aux();
			aux1.setListaDados(particaoV);
			
			induzirArvore(aux1, novoNoh);
		}
	}

	public void metodo6_construirParticao(String prop, String valor, List<Map<String, String>> listaDados,
			List<Map<String, String>> particaoV) {
		// TODO Depois, Julio

		for (Map<String, String> map : listaDados) {
			if (map.get(prop) == valor) {
				particaoV.add(map);
			}
		}
	}
	
	public Noh metodo7(Noh resultado, Aux2 aux2) {
		// TODO Depois, Rafael

		resultado.setNomePropNoh(aux2.getNohAtual());
		
		resultado.setValorPropRamo(aux2.getRamoAtual());
		
		Noh novoNoh = new Noh();
		
		resultado.setFilho(novoNoh);
		
		return novoNoh;
	}
}
