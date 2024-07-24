package ArrayList;

import java.util.ArrayList;

public class Exemplo03 {
 
	public static void main(String[] args) {
		
		//Criando um ArrayList de Números inteiros 
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10); //Adicionando elementos do ArrayaList
		numeros.add(20);
		
		System.out.println(numeros.get(0)); //Saída : 10 //Acessando elementos do
		System.out.println(numeros.get(1)); //Saída : 20 
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); //Sáida : 25 //Modificando um elemento
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); //Saída : 25 // Removendo um elemento 
		
		System.out.println (numeros.size()); //Saída : 2 // obtendo o tamanho do ArrayList
	}

}
