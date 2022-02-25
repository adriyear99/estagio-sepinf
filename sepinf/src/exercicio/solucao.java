package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class solucao {
	
	// verifica se a idade é um valor realista
	public static boolean idadeValida(int idade) {
		return (idade >= 5 && idade <= 100);
	}
	
	// verifica se o usuário enviou o tipo correto no input
	public static int tipoValido(Scanner scan) {
		int idade;
		
		try {
			idade = scan.nextInt();
			return idade;
			
		}catch(Exception e){
			System.out.println("Tipo de dado inválido");
		}
		
		return 0;
	}
	
	// retorna o valor da idade digitada após as verificações
	public static int validar(int i) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int idade = 0;
		
		while(!idadeValida(idade)) {
			System.out.printf("Digite a idade %d: ",i+1);
			idade = tipoValido(scan);
			if(!idadeValida(idade)) {
				System.out.println("A idade deve estar entre 5 a 100 anos");
			}
		}
		
		System.out.println("");
		return idade;	
	}
	
	// atribui a idade correta para cada irmã em ordem de nascimento
	public static void atribuirIdade(int[] arr, Pessoa p) {
		
		Arrays.sort(arr);
		
		if(p.nome == "Cibele") {
			p.idade = arr[0];
			
		}else if(p.nome == "Camila") {
			p.idade = arr[1];
			
		}else if(p.nome == "Celeste") {
			p.idade = arr[2];
			
		}else {
			System.out.println("Essa não é uma das 3 irmãs");
		}
		
	}

	public static void main(String[] args) {
		
		// cibele > camila > celeste
	
		// instanciando objetos
		Pessoa cibele = new Pessoa("Cibele");
		Pessoa camila = new Pessoa("Camila");
		Pessoa celeste = new Pessoa("Celeste");
		
		// armazenando idades em vetor
		int[] idades = new int[3];
		
		for(int i=0;i<idades.length;i++) {
			idades[i] = validar(i);
		}
		
		// atribuindo idade a cada irmã
		atribuirIdade(idades,cibele);
		atribuirIdade(idades,camila);
		atribuirIdade(idades,celeste);
		
		// mostrando idade de camila
		System.out.printf("A idade de %s é %d",camila.nome,camila.idade);
		

	}

}
