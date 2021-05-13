
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha p = new Pilha(10);
		p.empilhar("Livro 1");
		p.empilhar("Livro 2");
		p.empilhar("Livro 3");
		System.out.println(p.topo()); //imprimi o livro 3
		System.out.println(p.tamanho()); //imprimi o valor 3
		
		Object [] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[2] = "OUTRO";
		
		//Desempilhando
		System.out.println("---------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		System.out.println(p.getElementos().length);
	}

}
