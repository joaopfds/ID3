package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import objetos.AuxProcesso;
import processo.Processo;

public class Testes {

	public static Processo p = new Processo();
	
	public void Todos_Testes() {
		System.out.println();
		System.err.println("\t___15 testes___");
		System.out.println();
		System.err.println("\n ->>> 1. Teste Hashmap: ");
		teste_hashmap();
		System.err.println("\n ->>> 2. Teste Aux - setListaDados: ");
		teste_aux_set_lista_dados();
		System.err.println("\n ->>> 3. Teste Criar Request: ");
		teste_request_set_lista_dados_e_classe();
		System.err.println("\n ->>> 4. Teste prepara: ");
		teste_prepara();
		System.out.println();
		System.err.println("\n ->>> 5. Teste MÃ©todo 0: ");
		teste_metodo0();
		System.err.println("\n ->>> 6. Teste 0,5: ");
		teste_metodo0_5();
		System.err.println("\n ->>> 7. Teste 1: ");
		teste1();
		System.err.println("\n ->>> 8. Teste 2: ");
		teste2();
		System.err.println("\n ->>> 9. Teste 3: ");
		teste3();
		System.err.println("\n ->>> 10. Teste 4: ");
		teste4();
		System.err.println("\n ->>> 11. Teste 5: ");
		teste5();
		System.err.println("\n ->>> 12. Teste 6: ");
		teste6();
		System.err.println("\n ->>> 13. Teste 7: ");
		teste7();
		System.err.println("\n ->>> 14. Teste MÃ©todo 7: ");
		teste_metodo_7();
		System.err.println("\n ->>> 15. Teste MÃ©todo 5: ");
		teste_metodo_5();
	}

	private void teste_request_set_lista_dados_e_classe() {
		// TODO Julio

		System.out.println("Deve mandar uma lista com duas classes iguais, deve funcionar");

//		Request req_ok = new Request();
////		// ver o mÃ©todo teste_prepara abaixo para saber como fazer a lista nesse caso (se ele estiver correto, deve estar)
//		req_ok.setListaDadosEClasse(null);
		
		System.out.println("Deve mandar uma lista com duas classes"
				+ "\n Deve dar erro, pois tÃªm classes diferentes");
		
//		Request req_erro = new Request();
////		// ver o mÃ©todo teste_prepara abaixo para saber como fazer a lista nesse caso (se ele estiver correto, deve estar)
//		req_erro.setListaDadosEClasse(null);
	}

	private void teste_aux_set_lista_dados() {
		// TODO Joao
		// NAO VAI PRECISAR

		System.out.println("Deve mandar uma lista com dois hashmaps com tamanhos iguais, deve funcionar");

//		Aux aux1_ok = new Aux();
////		// ver o mÃ©todo exemplo_aux abaixo para saber como fazer a lista nesse caso
//		aux1_ok.setListaDados(null);

		System.out.println("Deve mandar uma lista com dois hashmaps, um com classe e uma propriedade e outro com classe e duas propriedades"
				+ "\n Deve dar erro, pois tÃªm tamanhos diferentes");	
//		Aux aux1_erro = new Aux();
////		// ver o mÃ©todo exemplo_aux abaixo para saber como fazer a lista nesse caso
//		aux1_erro.setListaDados(null);
		
		
	}

	private void teste_prepara() {
		// TODO Rafael
		
		System.out.println("Fazer");
		
//		Classe c1 = new Classe("Risco","Alto");
//		Dado d1_1 = new Dado("Historico de Credito", "Baixo");
//		Dado d1_2 = new Dado("Divida", "Moderada");
//		List<Dado> listaDados1 = new ArrayList<Dado>(List.of(d1_1, d1_2));
//	
//		DadoEClasse dc1 = new DadoEClasse(listaDados1, c1);
//		
//		Classe c2 = new Classe("Risco","Baixo");
//		Dado d2_1 = new Dado("Historico de Credito", "Alto");
//		Dado d2_2 = new Dado("Divida", "Baixa");
//		List<Dado> listaDados2 = new ArrayList<Dado>(List.of(d2_1, d2_2));
//	
//		DadoEClasse dc2 = new DadoEClasse(listaDados2, c2);
//		
//		List<DadoEClasse> ldc = new ArrayList<DadoEClasse>(List.of(dc1, dc2));
//		Request req = new Request(ldc);
//
//		p.prepara(req);
	}

	private void teste_metodo_5() {
		// TODO Depois, JoÃ£o
		System.out.println("Por Ãºltimo");
	}

	private void teste_metodo_7() {
		// TODO Depois, JoÃ£o
		System.out.println("Deve setar no Noh o Prop, e setar o ramo dela e adiciona na lista de filhos, de acordo com o aux que tiver");
//		Noh resultado = new Noh();
//		Aux2 aux2 = new Aux2();
//		aux2.setNohAtual(null);
//		aux2.setRamoAtual(null);
//		aux2.setValor(aux2.getRamoAtual());
//		
//		p.metodo7(resultado, aux2);
	}

	private void teste7() {
		// TODO Depois, Julio
		System.out.println("Deve fazer a partiÃ§Ã£o."
				+ "\n Percorre toda a lista Dados (aux1) e retorna aqueles que o valor do atributo seja = valor do loop"
				+ "\n sÃ³ olha as linhas (List), nÃ£o olha as colunas (HashMap), talvez precise de um bool <<contem>>");
		
//		Aux aux1 = new Aux();
//		aux1.setListaDados(null);
//		// ver o mÃ©todo exemplo_aux abaixo para saber como fazer o aux1 nesse caso
//		
//		List<Map<String, String>> particaoV = new ArrayList<Map<String, String>>();
//
//		String prop = "";
//		String valor = "";
//		
//		p.metodo6_construirParticao(prop, valor, aux1.getListaDados(), particaoV);	
	}

	private void teste6() {
		// TODO Rafael
		System.out.println("Faz o loop na lista de valores do Aux4, seta o valor ramo no aux");	
		System.out.println("NÃ£o Ã© necessÃ¡rio");
		System.out.println("Mas antes sÃ³ manda um valor na lista de valores (aux4) pro metodo5 pra ver o que dÃ¡.");
	}

	private void teste5() {
		System.out.println("Recebe o aux3, vÃª a prop tirada, busca os valores da prop tirada e colocam eles em "
				+ "\n uma lista de valores, no Aux4"
				+ "\n ver https://mkyong.com/java/java-get-keys-from-value-hashmap/");	
		// TODO Rafael
//		Aux3 aux3 = new Aux3();
//		Set<String> setLista = new HashSet<String>(List.of("Divida", "SeiLa"));
//		aux3.setCopiaSetProps(setLista);
//		aux3.setPropTirada("Historico de Credito");
//		p.metodo4(aux3);
	}

	private void teste4() {
		System.out.println("Deve selecionar uma propriedade da SET Prop, ele recebe a lista prop"
				+ "\n retira o primeiro item, cria uma copia e retorna o Aux3");
		// TODO Joao
//		Set<String> listaProps = new HashSet<String>();
//		p.metodo3(listaProps);
	}

	private void teste3() {
		System.out.println("Deve receber uma lista com todos elementos e classes originais (sÃ³ alta e moderada) "
				+ "\n deve retornar um nÃ³ com valorClasse preenchido com alta, moderada -"
				+ "\n ele itera sobre as classeValor e separa por virgula");
		// TODO Julio
		// Aux aux1 = new Aux();
		// ver o mÃ©todo exemplo_aux abaixo para saber como fazer o aux1 nesse caso
		// p.metodo2(aux1);
	}

	private void teste2() {
		System.out.println("No induzir arvore deve ter um if que verifica se o ListaDados tem sÃ³ classes (sÃ³ alta e moderada), sem valores");
		// TODO Julio
		// Aux aux1 = new Aux();
		// ver o mÃ©todo exemplo_aux abaixo para saber como fazer o aux1 nesse caso
		// p.metodo1_5(aux1);
	}

	private void teste1() {
		System.out.println("Deve receber uma lista com todos os elementos da mesma classe (todos risco alto) e "
				+ "\n retornar nÃ³ com valor preenchido com alto, por exemplo");		
		// TODO Joao
		List<Map<Integer, String>> listadado = new ArrayList<Map<Integer, String>>();
		
		Map<Integer, String> mapi1 = new HashMap<Integer, String>();
		Map<Integer, String> mapi2 = new HashMap<Integer, String>();
		Map<Integer, String> mapi3 = new HashMap<Integer, String>();
		
		mapi1.put(1, "Risco");
		mapi1.put(2, "alto");
		mapi1.put(3, "alto");
		//mapi1.put(3, "baixo");
		mapi1.put(4, "alto");
		
		mapi2.put(1,"Historico");
		mapi2.put(2,"baixo");
		mapi2.put(3,"baixo");
		mapi2.put(4, "baixo");
		
		mapi3.put(1,"Divida");
		mapi3.put(2,"alto");
		mapi3.put(3,"alto");
		mapi3.put(4,"alto");
		
		listadado.add(mapi1);
		listadado.add(mapi2);
		listadado.add(mapi3);
		
		
		 //AuxProcesso aux1 = new AuxProcesso();
		//aux1.setListaDados(listadado);
		// ver o mÃ©todo exemplo_aux abaixo para saber como fazer o aux1 nesse caso
		System.out.println(p.metodo1(listadado));
	}

	private void teste_metodo0_5() {
		System.out.println("No induzir arvore deve ter um if que verifica se o ListaDados tem todos os elementos da mesma classe (todos risco alto)");
		// TODO Joao
		// p.induzirArvore(auxiliador());
	}

	private void teste_metodo0() {
		System.out.println("Deve chamar o induzir Ã¡rvore, que cria um aux, e Ã© sÃ³");
		System.out.println("NÃ£o fazer agora");
		// p.induzirArvore
	}

	private AuxProcesso exemplo_aux() {
		AuxProcesso aux1 = new AuxProcesso();
		List<Map<String, String>> listaDados = new ArrayList<Map<String, String>>();
		Map<String, String> d1 = new HashMap<String, String>();
		d1.put("Risco", "Alto");
		d1.put("Historico de Credito", "Baixo");
		d1.put("Divida", "Alta");
		
		Map<String, String> d2 = new HashMap<String, String>();
		d1.put("Risco", "Baixo");
		d1.put("Historico de Credito", "Medio");
		d1.put("Divida", "Baixa");
		
		listaDados.add(d1);
		listaDados.add(d2);
		
		aux1.setListaDados(listaDados);
		return aux1;
	}
	
	
	public void teste_hashmap() {
		Map<String, String> teste = new HashMap<String, String>();
		teste.put("Risco", "alto");
		teste.put("Historico de Credito", "valor 2");
		teste.put("Nome 3", "valor 3");
		teste.put("Nome 1", "valor 4");
		System.out.println("Tudo:" + teste.toString());
		System.out.println("Todas as keys:" + teste.keySet());
		System.out.println("todos os valores:" + teste.values());
		System.out.println("Tamanho: " + teste.size());
		System.out.println("Valor do Nome 1: " + teste.get("Nome 1"));
	}


		
		
			
}
