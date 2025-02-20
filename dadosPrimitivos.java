
public class dadosPrimitivos
{
	public static void main(String[] args) {
		System.out.println("Bem vindo a sua aula 02 de Java - Variáveis e tipos de dados primitivos");
		
		// Tipos de dados primitivos
		
		int idade = 29; // int representa um número inteiro
		double altura = 1.75; //double representa um número flutuante, em alguns lugares é chamado de float
		double peso = 100.5;
		double imc = peso / (altura * altura);
		char genero = 'M'; // char representa um caractere (apenas 1) no caso de STRING seria uma cadeia de caracteres
		boolean ativo = true;
		
		System.out.println("idade: " + idade);
		System.out.println("altura: " + altura);
		System.out.println("peso: " + peso); 
		System.out.println("imc: " + imc); 
		System.out.println("gênero: " + genero);
		System.out.println("ativo: " + ativo);
		
		// Convertendo o IMC para um número com 2 casas decimais.
	
		imc = Math.round(imc *100.0) / 100.0;
		System.out.println("IMC: " + imc);
		
		// Convertendo inteiro para decimal
		int numero = 10;
		double numeroDecimal = numero;
		System.out.println("Número Decimal: " + numeroDecimal);
		
		// Operações com diferentes tipos de dados
		int a = 10;
		double b = 2.5;
		
		double resultado = a / b;
	
		System.out.println("Resultado: " + resultado);
		
		
		/*Diferença entre char e String:
		char: char não pode ser concatenado com uma String.
		char não suporta mais de um caractere*/
		
		String frase = "Olá mundo"
		char letra = 'o'
		
		
		
	}
}
