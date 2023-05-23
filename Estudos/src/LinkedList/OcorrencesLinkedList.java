package LinkedList;

import java.util.Iterator;

public class OcorrencesLinkedList {
	
	public static <T> void countOcorrences(SingleLinkedListNode<T> head) {
		int[] aux = new int[10];
		
		SingleLinkedListNode<Integer> current = (SingleLinkedListNode<Integer>) head;
		while(!current.isNIL()) {
			int digit = current.getData();
			aux[digit]++;
			current = current.getNext();
		}
		
		for (int i = aux.length - 1; i >= 0 ; i--) {
			if(aux[i]> 0) {
				System.out.println("Dígito " + i + ": " + aux[i] + " Ocorrência(s)");
			}
		}
		
	}
	
	public static void main(String[] args) {
		SingleLinkedListNode<Integer> head = new SingleLinkedListNode<>(1,
                new SingleLinkedListNode<>(2,
                        new SingleLinkedListNode<>(3,
                                new SingleLinkedListNode<>(1,
                                        new SingleLinkedListNode<>(3,
                                                new SingleLinkedListNode<>(2,
                                                        new SingleLinkedListNode<>(3,
                                                                new SingleLinkedListNode<>())))))));

        countOcorrences(head);
	}

}
