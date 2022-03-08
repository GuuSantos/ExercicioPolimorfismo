package br.com.exercicio01;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Cachorro cachorro = new Cachorro();
		
		
		animal.setNome("Cachorro");
		animal.setIdadeAno(4);
		
		
		System.out.println("Animal --> "+animal.getNome());
		System.out.println("Idade do "+animal.getNome()+"(em anos) --> "+animal.getIdadeAno());
		animal.emitirSom("Cachorro");
		cachorro.animalCorrendo();
		
		System.out.println();
		animal.setNome("Cavalo");
		animal.setIdadeAno(10);
		
		System.out.println("Animal --> "+animal.getNome());
		System.out.println("Idade do "+animal.getNome()+"(em anos) --> "+animal.getIdadeAno());
		animal.emitirSom("Cavalo");
		cavalo.animalCorrendo();
		
		
		System.out.println();
		animal.setNome("Preguica");
		animal.setIdadeAno(2);
		System.out.println("Animal --> "+animal.getNome());
		System.out.println("Idade do "+animal.getNome()+"(em anos) --> "+animal.getIdadeAno());
		preguica.emitirSom();
		preguica.subirArvore();;
		
		

		
		
		
		
		
	}

}
