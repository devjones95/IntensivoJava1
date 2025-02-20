
public class operadoresAritmeticosComparacao
{
	public static void main(String[] args) {
		System.out.println("Bem vindo a aula 3 de Java - Operadores Aritméticos");
		
		
	    /*Operadores Aritméticos:
	    
	    Adição +
	    Subtração -
	    Multiplicação *
	    Divisão /
	    Resto da Divisão %
	    */
		
		int a = 40;
		int b = 20;
		System.out.println(" A adição de a + b = " + (a + b));
		System.out.println(" A subtração de a - b = " + (a - b));
		System.out.println(" A multiplicação de a * b = " + (a * b));
		System.out.println(" A divisão de a / b = " + (a / b));
		System.out.println(" O resto da divisão de a % b = " + (a % b));
		
		
		
		// Operadores de Atribuição:
		
		int x = 100; // atribuímos o valor de 100 à nossa variável
		System.out.println(x);
		
		x += 2; // x = x + 2
		System.out.println(x);
		
		x -= 10; // x = x -10
		System.out.println(x);
		
		x *= 2; // x = x * 2
        System.out.println(x);
        
        x /= 4; // x = x / 4
        System.out.println(x);
        
        x %= 40; // x = x % 40
        System.out.println(x);
        
        
        
        // Operadores de comparação: ==, !=, >, <, >=, <=
        int num1 = 10;
        int num2 = 20;
        
        System.out.println(num1 == num2);// 10 é igual a 20? - false
        System.out.println(num1 > num2); // 10 é maior que 20? - false
        System.out.println(num1 < num2); // 10 é menor que 20? - true
        System.out.println(num1 <+ num2); // 10 é menor ou igual a 20? - true
        System.out.println(num1 >+ num2); // 10 é maior ou igual a 20? - false
        System.out.println(num1 != num2); // 10 é diferente de 20? - false
        
        
		
	
		
		
		
	}
}
