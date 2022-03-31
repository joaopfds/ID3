package processo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import objetos.Aux2;
import objetos.Aux3;
import objetos.Aux4;
import objetos.AuxProcesso;
import objetos.Dado;
import objetos.DadoEClasse;
import objetos.Noh;
import objetos.Request;

public class Processo {

	public AuxProcesso prepara(Request request) {
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
		
		AuxProcesso aux1 = new AuxProcesso();
		aux1.setListaDados(listaDados);
		aux1.setSetProp(listaDados.get(0).keySet());

		return aux1;
		
		//	Noh retorno = new Noh();
		// induzirArvore(aux1, retorno);
	}
	
	public void induzirArvore(AuxProcesso aux1, Noh retorno) {

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
		Map<String, String> Risco = listaDados.get(0);
		List<String> classeValores = new ArrayList<String>();							
		String classeValoresReturned = new String();

		for (String key : Risco.keySet()) {
		    String value = Risco.get(key);
		    if(!classeValores.contains(value)){
			classeValoresReturned.concat(","+value);
			classeValores.add(value);
		    }
		}
		Noh novoNoh = new Noh();
		novoNoh.setValorClasseFolha(classeValoresReturned + " Risco");
		return novoNoh;
	}

	public Aux3 metodo3(Set<String> listaProps) {
		// TODO JoÃ£o
		return null;
	}

	public Aux4 metodo4(Aux3 aux3) {
		// TODO Rafael
		return null;
	}

	public void metodo5(AuxProcesso aux1, Aux2 aux2, Aux4 aux4, Aux3 aux3, Noh retorno, List<Map<String, String>> listaDados) {
		//TODO Rafael
		// TODO Depois, JoÃ£o
		for (String valor : aux4.getSetValores()) {
			aux2.setValor(valor);
			aux2.setRamoAtual(valor);
			
			List<Map<String, String>> particaoV = new ArrayList<Map<String, String>>();
			metodo6_construirParticao(aux3.getPropTirada(), valor, aux1.getListaDados(), particaoV);
			
			Noh novoNoh = metodo7(retorno, aux2);
			
			aux1 = new AuxProcesso();
			aux1.setListaDados(particaoV);
			aux1.setSetProp(aux3.getCopiaSetProps());
			
			induzirArvore(aux1, novoNoh);
		}
	}

	public List<Map<Integer, String>> metodo6_construirParticao(Integer prop, String valor, List<Map<Integer, String>> listaDados,
			List<Map<Integer, String>> particaoV) {
		// TODO Depois, Julio
		Map<Integer, String> Coluna = particaoV.get(prop);
		List<Integer> keys = new ArrayList<Integer>();
		for(Integer key : Coluna.keySet()) {
			String value = Coluna.get(key);
			if(value == valor) {
				keys.add(key);
			}
		}
		
		List<Map<Integer, String>> NovaParticao = new ArrayList<Map<Integer, String>>();
		
		for(Map<Integer, String> map : listaDados) {
			Map<Integer, String> newMap = new HashMap<Integer, String>();
			for(Integer key : keys) {
				newMap.put(key, map.get(key));
			}
			NovaParticao.add(newMap);
		}
		
		return NovaParticao;
		
	}
	
	public Noh metodo7(Noh resultado, Aux2 aux2) {
		// TODO Depois, Rafael

		resultado.setNomePropNoh(aux2.getNohAtual());
		
		resultado.setValorPropRamo(aux2.getRamoAtual());
		
		Noh novoNoh = new Noh();
		
		resultado.getFilhos().add(novoNoh);
				
		return novoNoh;
	}
}
