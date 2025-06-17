package javacollection;

import java.util.*;

public class Coleccionesjava {

	public static void main(String[] args) {
		//---------LISTS
		System.out.println("============LISTS============");
		
		//Lista dinamica basada en array.
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Uno");
		arrayList.add("Dos");
		arrayList.add("Tres");
		arrayList.remove("Tres");
		arrayList.set(1, "Cuatro");
		
		System.out.println("ArrayList: " + arrayList);
		
		
		//LinkedList: lista doblemente enlazada
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Uno");
		linkedList.add("Dos");
		linkedList.add("Tres");
		linkedList.remove(1);
		linkedList.remove("Uno");
		
		System.out.println("LinkedList: " + linkedList);
		
		//------------SET-------------
		
		System.out.println("============SET============");
		
		//No mantiene el orden, no permite duplicados // Calcula su hashCode
													  // Usa ese hash para determinar en casilla coloca el hash
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Naranja");
		hashSet.add("mango");
		hashSet.add("Piña");
		hashSet.add("Guanabana");
		hashSet.add("Naranja");
		
		System.out.println("HashSet: " + hashSet);
		
		// TreeSet: mantiene orden natural // Arbol binario balanceado. Ordena segun un comparador
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Naranja");
		treeSet.add("mango");
		treeSet.add("Piña");
		treeSet.add("Guanabana");
		treeSet.add("Naranja");
		treeSet.add("Kiwi");
		treeSet.remove("Kiwi");
		
		System.out.println("TreeSet: " + treeSet);
		
		//LinkedHashSet: mantiene orden de insersión, lista doblemente enlazada.
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Naranja");
		linkedHashSet.add("mango");
		linkedHashSet.add("Piña");
		linkedHashSet.add("Guanabana");
		//linkedHashSet.add("Naranja");
		linkedHashSet.add("Kiwi");
		//linkedHashSet.remove("Kiwi");
		
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		
		//------------QUEUE-------------
		
		System.out.println("============QUEUE============");
		
		//Orden natural // Ordena por elemento minimo por defecto
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(52);
		priorityQueue.add(8);
		priorityQueue.add(1);
		priorityQueue.add(6);
		
		System.out.println("PriorityQueue: " + priorityQueue);
		

		
		//Orden natural // Ordena por elemento minimo por defecto
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Frente");
		arrayDeque.addLast("Final");
		arrayDeque.addFirst("Inicio");
		
		
		System.out.println("ArrayDeque: " + arrayDeque);
		
		
		//------------MAP-------------
		
		System.out.println("============MAP============");
		
		//Sin orden garantizado
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Tres");
		hashMap.put(1, "Uno");
		hashMap.put(4, "Cuatro");
		
		System.out.println("HashMap: " + hashMap);
		
		//Treemap: ordena por clave
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(3, "Tres");
		treeMap.put(1, "Uno");
		treeMap.put(4, "Cuatro");
		treeMap.put(5, "Cinco");
		treeMap.put(7, "Siete");
		
		System.out.println("TreeMap: " + treeMap);
		
		//LinkedHashMap: mantiene orden de insesión
				Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
				linkedHashMap.put(3, "Tres");
				linkedHashMap.put(1, "Uno");
				linkedHashMap.put(4, "Cuatro");
				linkedHashMap.put(5, "Cinco");
				linkedHashMap.put(7, "Siete");
				
				System.out.println("LinkedHashMap: " + linkedHashMap);
		

	}

}
