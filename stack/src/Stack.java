

public class Stack {

    protected DNode header;    /* cabeçalho*/
    protected DNode trailer;    /* nó final*/
    protected int size;              /*tamanho da Lista*/

    /**Construtor padrão que cria uma lista vazia*/
    public Stack()
    {
        header = new DNode(null,null,null);
        trailer = new DNode(null,null,null);
        header.setNext(trailer);
        size = 0;
    } 
    
    public int size(){   /*tamanho da lista*/
        return size;
  }

  public boolean isEmpty(){ /*a lista está vazia??*/
         return (size == 0);
  }

  /*Retorna o primeiro da lista*/
  public DNode getFirst()throws IllegalStateException{
         if(isEmpty())
              throw new IllegalStateException("Lista Vazia");
          return header.getNext();
  }

      /*Retorna o último da lista*/
  public DNode getLast() throws IllegalStateException{
          if(isEmpty())
              throw new IllegalStateException("Lista Vazia");
          return trailer.getPrev();
  }
  /*Retorna o nó anterior do nó dado*/

  public DNode getPrev(DNode no) throws IllegalArgumentException{
      if(no==header)
          throw new IllegalArgumentException("Não há nó anterior");
      return no.getPrev();
  }

  /*Retorna o nó sucessor do nó dado*/
  public DNode getNext(DNode no) throws IllegalArgumentException{
      if(no==trailer)
          throw new IllegalArgumentException("Não há nó posterior");
      return no.getNext();
  }
  /*Insere um dado nó antes de um dado v*/
  public void addAntes(DNode v, DNode no) throws IllegalArgumentException{
      DNode u = getPrev(v);
      no.setPrev(u);
      no.setNext(v);
      v.setPrev(no);
      u.setNext(no);
      size++;
  }

  
  /*Insere um dado nó depois de um nó "v"*/
  public void addAfter(DNode v, DNode no) throws IllegalArgumentException{
      DNode u = getNext(v);
      no.setPrev(v);
      no.setNext(u);
      v.setNext(no);
      u.setPrev(no);
      size++;

  }
  public void push(DNode no){  /*Insere um nó fornecido no fim da lista*/
      if (size == 0) {
          DNode w;
          w = header.getNext();  /*aponta para o primeiro elemento da Lista*/
          no.setNext(w);         /*atribui o endereço para o primeiro elemento */
          no.setPrev(header);   /*atribui o endereço da sentinela header*/
          w.setPrev(no);           /*aponta para o nó antigo*/
          header.setNext(no);
          size = size + 1;    
      }
      else 
    	  addAntes(trailer,no);
}
/*Remove um determinado nó "no" da lista*/
  public DNode pop() throws IllegalArgumentException{
	  DNode retorno = trailer;
	  if (size > 0) {
		  DNode noAnterior = trailer.getPrev();
		  trailer.setPrev(null);
		  noAnterior.setNext(null);
		  trailer = noAnterior;
		  size--;
	  }
      return retorno;
  }
  
  //retorna o elemento no topo da pilha, sem retirá-lo; ocorre um erro se a pilha estiver vazia.
  public DNode top() {
	  return trailer.getPrev();
  }
  
  /* Indica se o nó possui antecessor*/
  public boolean temAnt(DNode no){
      return (no!=header);
  }
  /* Indica se o nó possui sucessor*/
  public boolean temSuc(DNode no){
      return (no!=trailer);
  }
  public String toString(){
      DNode ponteiro = header.getNext();
      if (size == 0 ) return "Pilha vazia";
      String s = "{";
      int i = 1;
          while(ponteiro.getNext()!=null){
              if(i==1)
                  s+="[.]-> ";
              s+=" <- ";
              s+=ponteiro.getElement();
              s+=" -> ";
              i++;
              ponteiro = ponteiro.getNext();
          }
      return s+="<-[.]}";
  }


} /* Fim da Classe*/

