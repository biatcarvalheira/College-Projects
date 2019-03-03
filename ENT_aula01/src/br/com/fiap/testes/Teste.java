package br.com.fiap.testes;
import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Genero;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno ("Bia", 42092667, 80857);
		
		
		//ele so vai aceitar os valores definidos na constante genero 
		
		aluno.setSexo(Genero.FEMININO);
	}

}
