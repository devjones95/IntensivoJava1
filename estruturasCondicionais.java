
public class estruturasCondicionais
{
	public static void main(String[] args) {
		System.out.println("Bem vindo a aula 4 de Java - Estruturas Condicionais");
		
		
		// if - else
		int idade = 15;
		
		if(idade >= 18) {
		    System.out.println("Você é maior de idade.");
		} else {
		    System.out.println("Você é menor de idade.");
		}
		
		// switch case
		
		int dia_semana = 5;
		
		switch(dia_semana) {
		    case 1:
		        System.out.println("Domingo");
		        break;
		    case 2:
		        System.out.println("Segunda");
		        break;
		    case 3:
		        System.out.println("Terça");
		        break;
		    case 4:
		        System.out.println("Quarta");
		        break;
		    case 5:
		        System.out.println("Quinta");
		        break;
		    case 6:
		        System.out.println("Sexta");
		        break;
		    case 7:
		        System.out.println("Sábado");
		        break;
		    default:
		        System.out.println("Dia inválido!");
		    
		}
	}
}
