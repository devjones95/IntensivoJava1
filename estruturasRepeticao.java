
public class Main
{
	public static void main(String[] args) {
		System.out.println("Bem vindo a aula 5 de Java - Estruturas de Repetição - Loops: for, while, do-while");
		
	    
	    /*
	       for
	       
	       a variável ´declarada dentro do for (int i = 0), 
	       em seguida a condição, também declarada dentro do for (i < 10), 
	       em seguida o incremento (i++)*/
	    for(int i = 0; i < 10; i++) { 
	        System.out.println("i: " + i);
	    }
	    
	    
	    /*
	        while
	        
	        a variável é declarada fora do while
	        em seguida a condição é declarada dentro do while
	        logo após, o incremento
	    */
	    
	    int i = 0;
	    while(i <= 100) {
	        System.out.println("i: " + i); // enquanto o i for menor que 100, o while vai acrescentar +1 no i até ele atingir a condição de 100
	        i++;
	    }
	    
	    // Loop infinito com o while
	    
	    while(true){
	        System.out.println("Loop Infinito"); // imprime "Loop infinito na tela, porém temos o break, que corta esse loop, do contrário, ele rodaria eternamente"
	        break;
	    }
	    
	    
	    /*
	    do while
	    
	    O do while, executa primeiro e depois verifica a condição
	    */
	    
	    int a = 1;
	    do{
	        System.out.println("a: " + a);
	        a++;
	    }while(a < 1);
	}
}
