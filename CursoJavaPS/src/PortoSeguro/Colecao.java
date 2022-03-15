package PortoSeguro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecao {
	public static void main(String[] args) {
		
		//criação do List
		List<Integer> minhaLista = new ArrayList<Integer>(); 
		
		//inserindo elementos do meu ArrayList --> minhaLista
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(8);
		minhaLista.add(10);
		minhaLista.add(7);
		minhaLista.add(5);
		minhaLista.add(7);
		
		
		//percorrendo os elementos da minhaLista
		for(Integer listaElemento:minhaLista) {
			System.out.println(listaElemento);
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();
		
		
		//removendo um item da minha lista
		minhaLista.remove(0);
		
		for(Integer listaElemento:minhaLista) {
			System.out.println(listaElemento);
		}
		
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\nO primeiro elemento da minha lista é: "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		//Ordena os elementos da minha lista
		Collections.sort(minhaLista);
		
		System.out.println("\nLista ordenada");
		System.out.println(minhaLista);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(1);
		meuSet.add(6);
		meuSet.add(4);
		meuSet.add(8);
		meuSet.add(3);
		meuSet.add(12);
		meuSet.add(10);
		meuSet.add(8);
		meuSet.add(5);
		
		//ordena os elementos do meuSet
		Iterator<Integer> imeuSet= meuSet.iterator();
		
		while(imeuSet.hasNext()) {
			System.out.println(imeuSet.next());
		}
	
		
	}
}
