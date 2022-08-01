

public class DNode {

    @Override
	public String toString() {
		return "Elemento=" + element + "";
	}
	protected String element;
    protected DNode next, prev;  /*Ponteiro para o pr�ximo n� e para o n� anterior*/

    /*Construtor que cria um n� com os campos fornecidos */
   
    public DNode(String e) {
    	element = e;
        prev = null;
        next = null;
    }
    public DNode(String e, DNode p, DNode n){
        element = e;
        prev = p;
        next = n;
    }
    /*Retorna o elemento deste n�*/
    public String getElement(){
        return element;
    }
    /*Retorna o nodo anterior a este */
    public DNode getPrev(){
        return prev;
    }
    /*Retorna o nodo posterior a este */
    public DNode getNext(){
        return next;
    }
    /*Atribui o elemento deste n�*/
    public void setElement(String newElement){
        element = newElement;
    }
    /*Atribui o nodo anterior deste nodo*/
    public void setPrev(DNode newPrev){
        prev = newPrev;
    }
    /*Atribui o nodo seguinte a este nodo*/
    public void setNext(DNode newNext){
        next = newNext;
    }
}

