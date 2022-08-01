
public class Principal {

	public static void main(String[] args) {
		
		Stack pilha1 = new Stack();
		pilha1.push(new DNode("1"));
		pilha1.push(new DNode("2"));
		pilha1.push(new DNode("3"));
		pilha1.pop();
		System.out.println(pilha1.top());
		System.out.println("Imprimindo os elementos \n" + pilha1);

    }

}
