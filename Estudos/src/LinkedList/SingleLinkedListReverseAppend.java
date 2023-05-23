package LinkedList;

/**
 * Esta classe representa uma lista simplesmente encadeada que possui 
 * apenas um m�todo de inser��o, que executa o procedimento de inser��o da seguinte maneira:
 * 
 * Ao receber um novo elemento para inser��o, inverte-se a ordem dos elementos contidos na lista e, em seguida,
 * o elemento recebido � posicionado na frente (na primeira posi��o da lista).
 * 
 *  EXEMPLO:
 *  
 *  LISTA ATUAL: A B C
 *  NOVO ELEMENTO: D
 *  LISTA MODIFICADA: D C B A
 *  
 *  Para esta implementa��o, considera-se a exist�ncia do node sentinela (NIL) no final da lista.
 *  A exist�ncia da sentinela � considerada para execu��o dos testes autom�ticos.
 *  
 *  Procure implementar da forma mais eficiente poss�vel, pois isso ser� relevante na an�lise da solu��o proposta.
 *  
 *  ATEN��O
 *  - N�o � permitido criar outros m�todos auxiliares.
 *  - N�o � permitido criar usar estruturas auxiliares, tais como arrays.
 *  
 *  @author campelo
 *   
 */
public interface SingleLinkedListReverseAppend<T> {

    public void doIt(T elem);

}