package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaListaDplEncadeada = new ListaDuplamenteEncadeada<String>();
		
		minhaListaDplEncadeada.add("c1");
		minhaListaDplEncadeada.add("c2");
		minhaListaDplEncadeada.add("c3");
		minhaListaDplEncadeada.add("c4");
		minhaListaDplEncadeada.add("c5");
		minhaListaDplEncadeada.add("c6");
		minhaListaDplEncadeada.add("c7");
		
		System.out.println(minhaListaDplEncadeada);
		
		minhaListaDplEncadeada.remove(3);
		minhaListaDplEncadeada.add(3, "99");
		System.out.println(minhaListaDplEncadeada);
		System.out.println(minhaListaDplEncadeada.get(3));
	}
}
