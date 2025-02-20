
import java.util.Arrays; // precisamos importar o "pacote" Arrays antes de qualquer coisa.
import java.util.ArrayList; // o mesmo vale para o ArrayList.

public class Main
{
	public static void main(String[] args) {
		System.out.println("Bem vindo a aula 6 de Java - Arrays e ArrayList");
		
	    /*
	    Array
	    
	    No array, devemos seguir alguns passos para declará-lo em Java:
	    
	    int[] numeros = new int[5];
	    numeros[0] = 10;
	    numeros[1] = 20;
	    numeros[2] = 30;
	    numeros[3] = 40;
	    numeros[4] = 50;
	    
	    Repare que:
	    Primeiro declaramos qual é o tipo de dados que irá compor nosso array, nesse caso, int.
	    Em seguida, com os [], declaramos ao Java, que se trata de um array.
	    Numeros, é o nome do nosso array.
	    Finalmente, instanciamos nosso array, dando o tamanho que ele terá, no caso, 5.
	    Após esses passos, seguimos com a declaração dos elementos do nosso array, ou seja, os numeros[].
	    
	    */
	    
	    int[] numeros = new int[5];
	    numeros[0] = 10;
	    numeros[1] = 20;
	    numeros[2] = 30;
	    numeros[3] = 40;
	    numeros[4] = 50;
	    //numeros[5] = 60;  esse elemento não entra no nosso array, pois como vemos acima, demos 5 de limite de elementos, esse seria o sexto, então daria erro.
	    
	    System.out.println("Array de números: " + Arrays.toString(numeros));
	    
	    
	    
	    
	  /*
	  ArrayList - array dinâmico
	  
	  Nele podemos adicionar quantos itens quisermos, podemos editar esse ArrayList, adicionando mais 
	  elementos, removendo, escolher a posição específica do elemento que queremos manipular além de muitas outras
	  funcionalidades.
	  */
	    
	  ArrayList<Integer> numerosArray = new ArrayList<>();
	  numerosArray.add(10); // posição 1
	  numerosArray.add(20); // posição 2
	  numerosArray.add(30); // posição 3
	  numerosArray.add(40); // posição 4
	  numerosArray.add(50); // posição 5 
	  numerosArray.add(60); // posição 6 
	  numerosArray.add(70); // posição 7 
	  numerosArray.add(80); // posição 8 
	  numerosArray.add(90); // posição 9
	  numerosArray.add(100); // posição 10
	  
	  System.out.println("ArrayLyst de números: " + numerosArray);
	  
	  // também podemos remover elementos do nosso ArrayList, por exemplo, vamos remover o elemento de posição 60
	  numerosArray.remove(6);
	  
	  System.out.println("ArrayLyst de números: " + numerosArray);
	  
	  
	}
}
