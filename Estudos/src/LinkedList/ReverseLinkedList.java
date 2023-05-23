package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList<T> implements SingleLinkedListReverseAppend<T>{
	
	private SingleLinkedListNode head;
	
	public ReverseLinkedList() {
		head = new SingleLinkedListNode();
		}
	
	@Override
	public void doIt(T elem) {
		if (elem != null) {
			if (this.head.isNIL()) {
				this.head.setData(elem);
				this.head.setNext(new SingleLinkedListNode<>());
			} else {
				SingleLinkedListNode<T> newNode = new SingleLinkedListNode<>();

				SingleLinkedListNode<T> auxNode = this.head;
				SingleLinkedListNode<T> otherAux = new SingleLinkedListNode<>();

				newNode.setData(elem);
				newNode.setNext(new SingleLinkedListNode<T>());
				
				while (!auxNode.isNIL()) {
					otherAux.setData(auxNode.getData());
					otherAux.setNext(newNode.getNext());
					
					newNode.setNext(otherAux);
					auxNode = auxNode.getNext();
					otherAux = new SingleLinkedListNode<T>();
					
				}
				this.head = newNode;
			}
		}
	}
	
	@Override
	 public String toString() {
	    	String retorno = "";
	    	SingleLinkedListNode<T> currentNode = this.head;
	    	while (currentNode!=null) {
	    		if (!retorno.equals("")) {
	    			retorno += " ";
	    		}
	    		retorno += currentNode;
	    		currentNode = currentNode.getNext();
	    	}
			return retorno;
	    }
	
	public static void main(String[] args) {
		SingleLinkedListReverseAppend<Integer> list = new ReverseLinkedList<>();

	    System.out.println("Lista inicial: ");
	    list.doIt(3);
	    list.doIt(2);
	    list.doIt(1);
	    System.out.println(list);

	    System.out.println("Adicionando elemento 4: ");
	    list.doIt(4);
	    System.out.println(list);

	    System.out.println("Adicionando elemento 5: ");
	    list.doIt(5);
	    System.out.println(list);
	}
		
		
	}

