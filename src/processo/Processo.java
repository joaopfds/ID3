package processo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import objetos.Aux2;
import objetos.Aux3;
import objetos.Aux4;
//import objetos.AuxProcesso;
import objetos.Dado;
import objetos.DadoEClasse;
import objetos.Noh;
import objetos.Request;

public class Processo {

//	public AuxProcesso prepara(Request request) {
//		// TODO Rafael
//
//		List<Map<String, String>> listaDados = new ArrayList<Map<String, String>>();
//
//		for ( DadoEClasse dadosEClasse : request.getListaDadosEClasse()) {
//			Map<String, String> dadoMap = new HashMap<String, String>();
//
//			dadoMap.put(dadosEClasse.getClasse().getClasseNome(), dadosEClasse.getClasse().getClasseValor());
//			for (Dado dado : dadosEClasse.getDado()) {
//				dadoMap.put(dado.getChave(), dado.getValor());
//			}
//			
//			listaDados.add(dadoMap);
//		}
//		
//		AuxProcesso aux1 = new AuxProcesso();
//		aux1.setListaDados(listaDados);
//		aux1.setSetProp(listaDados.get(0).keySet());
//
//		return aux1;
//		
//		//	Noh retorno = new Noh();
//		// induzirArvore(aux1, retorno);
//	}
	
	public Noh induzirArvore(List<Map<Integer, String>> listaDados, Map<String, Integer> props) {
		Noh retorno = new Noh();
		String classeValor = metodo1(listaDados);
		if (!classeValor.isEmpty()) {
			retorno.setClasseNome(classeValor);
			return retorno;
		} else if (props.isEmpty()) {
			return metodo2(listaDados);
		} else {
			String prop = metodo_5(props);
			Integer prop_index = props.get(prop);
			
			Noh nohRaiz = new Noh();
			nohRaiz.setNomePropNoh(prop);
			
			props.remove(prop);
			
			List<String> lista = new ArrayList<String>();
			Noh noh3 = new Noh();
			for (String valor : metodo7(listaDados, prop_index)) {
				Noh noh2 = new Noh();
				noh2.setValorPropRamo(valor);
				nohRaiz.addFilhos(noh2);
				List<Map<Integer, String>> listaDados_copia = metodo6_construirParticao(prop_index, valor, listaDados);
				
				noh3 = induzirArvore(listaDados_copia, props);
				noh2.addFilhos(noh3);
			}
			
			return nohRaiz;
		}
	}
	
	public String /*Noh*/ metodo1(List<Map<Integer, String>> listaDados) {
		// TODO Joao		
		String check = new String();
		int i = 0;
		Map<Integer, String> Risco = listaDados.get(0);
		
		for (Integer key : Risco.keySet()) {
		    String value = Risco.get(key);
		    if(!value.equals(check)) {
		    	check = value;
		    	i++;
		    }
		    if(i > 1) {
				return "";
			}
		}

		 return listaDados.get(0).get(1);
		
	}
	
	public Noh metodo2(List<Map<Integer, String>> listaDados) {
		// TODO Julio
		Map<Integer, String> Risco = listaDados.get(0);
		List<String> classeValores = new ArrayList<String>();							
		String classeValoresReturned = new String();
		
		for (Integer key : Risco.keySet()) {
		    String value = Risco.get(key);
		    if(!classeValores.contains(value)){
		    	classeValoresReturned = classeValoresReturned.concat(","+value);
		    	classeValores.add(value);
		    }
		}
		Noh novoNoh = new Noh();
		novoNoh.setValorClasseFolha(classeValoresReturned + " Risco");
		return novoNoh;
	}

	public String metodo_5(Map<String, Integer> props) {
		int i = 0;
		String value = new String();
		for(String key : props.keySet()) {
			value = key;
			if(key != "Risco") { // GAMBIARRA PARA PULAR O RISCO.
				break;
			}
		}
		return value;
	}
	
	public List<Map<Integer, String>> metodo6_construirParticao(Integer prop_index, String valor, List<Map<Integer, String>> listaDados) {
		// TODO Depois, Julio
		Map<Integer, String> Coluna = listaDados.get(prop_index);
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
	
	public List<String> metodo7(List<Map<Integer, String>> listaDados, Integer prop_index) {
		List<String> listaValores = new ArrayList<String>();
		
		Map<Integer, String> coluna_prop = listaDados.get(prop_index);
		
		for (Integer key : coluna_prop.keySet()) {
			if(key != 1) { // GAMBIARRA
				String value = coluna_prop.get(key);
			    if(!listaValores.contains(value)){
			    	listaValores.add(value);
			    }
			}
		    
		}
		
		
		return listaValores;
	}
}
