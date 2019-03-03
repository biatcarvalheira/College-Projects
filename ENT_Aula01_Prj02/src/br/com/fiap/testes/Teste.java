package br.com.fiap.testes;
import java.awt.Window.Type;
import java.lang.reflect.Field;

import br.com.fiap.bean.Carro;
import br.com.fiap.bean.anotacoes.Coluna;
import br.com.fiap.bean.anotacoes.Tabela;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um carro 
		Carro carro = new Carro();
		//se quisesse usar o metodo para outra classe é so trocar o parametro pelo objeto da outra classe
		criarTabela(carro);
		criarSelect(carro);
		
		
	}
	
	public static void criarTabela(Object obj) {
		//API Reflection vamos recuperar o nome da classe
		
				String nome = obj.getClass().getName();
				System.out.println(nome);
		//Recuperar os atributos --> declared: todos os campos que foram declarados dentro da classe
			Field[] atributos = obj.getClass().getDeclaredFields();
		//retorna um array de objetos que no caso tem 3 posicoes
			
			for(Field f: atributos) {
				//exibe o nome dos 3 atributos
				System.out.println(f.getName());
				//precisamos recuperar a anotacao que esta acima dos atributos @Coluna
				//Para cada atributo, vai ser criado um nome, tipo, e obrigatorio conforme criado nas anotacoes (@Coluna)
				Coluna anotacao = f.getAnnotation(Coluna.class);
				System.out.println("Nome: " + anotacao.nome());
				System.out.println("Tipo: " + anotacao.tipo());
				System.out.println("Obrigatorio: " + anotacao.obrigatorio());
			}
			
	}
	
	public static void criarSelect (Object obj) {
		//PARA CRIAR UM SELECT DA TABELA
		
		//Recuperar o nome configurado na notacao da @tabela --> que no caso é TAB_CARRO
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		//Exibir o SQL
		System.out.println("SELECT * FROM " + anotacao.nome());
	}
	


}
