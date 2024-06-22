package com.pedro.letscode;

import java.io.ObjectInputStream.GetField;

import com.pedro.letscode.LojasPet.PetShop;

public class ClassFuncoes {
	
	public static void main(String[] args) {
	
		
		Cachorro cachorro1 = new Cachorro("Spike", "Preto", 25.7, 6.2, 8, "nada");
		
		Gato gato1 = new Gato("Garfield", "Listrado", 8.6);
		
		Peixe peixe1 = new Peixe("Nemo", "Laranja", 0.2);

		//Classe de referencia(Polimorfismo) pode ser qualquer(Animal, gato, peixe), o que nao pode é o objeto
		//ser qualquer uma  
	
		
		Animal gato2 = new Gato("Garfield", "Listrado", 8.6);	
	
		Animal gator3 = new Peixe("Garfield", "Listrado", 8.6);
		
		Animal gato4 = new Gato("Garfield", "Listrado", 8.6);	
				
		cachorro1.som();
		gato1.som();
		peixe1.som();
		
	}

}


/*
 * //Cachorro cachorro1 = new Cachorro();
		
		//toda as informações que eu estava setando um por um nos atributos, eu posso fazer isso com
		//uma unica linha com o construtor
		Cachorro cachorro1 = new Cachorro("Spike", "Preto", 25.7, 6.2, 8, "nada");
		
		Gato gato1 = new Gato("Garfield", "Listrado", 8.6);
		
		Peixe peixe1 = new Peixe("Nemo", "Laranja", 0.2);
	
 * 
 * //Polimorfismo referenciando um objeto
		PetShop petshop1 = new PetShop();
		
		petshop1.tomarBanho(cachorro1);
		System.out.println(cachorro1.getEstadoDeEspirito());
		
		petshop1.tomarBanho(gato1);
		System.out.println(gato1.getEstadoDeEspirito());
		
		petshop1.tosar(cachorro1);
		System.out.println(cachorro1.getEstadoDeEspirito());
		
		//@Override
		cachorro1.som();
		gato1.som();
		peixe1.som();
 * 
 * 	System.out.println(cachorro1.getContCahorro());//Aqui posso ver a qtd desta variavel na classe antes e depois
		
 * //Com o toString conseguimos demostrar o endereço de memória de cada objeto
		System.out.println(cachorro1.toString());
		System.out.println(cachorro2.toString());
		
		
		
		System.out.println("---------------------");
		System.out.println(cachorro1.toString());
		System.out.println(cachorro2.toString());*/




/*imprimindo o Construtor
System.out.println(cachorro2.getNome());
System.out.println(cachorro2.getCor());
System.out.println(cachorro2.getAltura());
System.out.println(cachorro2.getPeso());
System.out.println(cachorro2.getTamanhoDoRabo());
System.out.println(cachorro2.getEstadoEspirito());


/*	Definindo os objetos 
cachorro1.setNome("Spike");
cachorro1.setCor = "Preto";
cachorro1.setAltura = 25.7;
cachorro1.setPeso = 6.2;
cachorro1.setTamanhoDoRabo = 8;



Executamos um metodo do objeto

Ele vai retorno do metodo que é bolinha, por isso precisa do sysout
System.out.println("O cachorro pegou uma " + cachorro1.pegar());

Sempre chamo o metodo e dentro do parenteses eu coloco a acao para ele me retornar um valor
System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
System.out.println("Pedi para o cahorro sair");
System.out.println("O cachorro está " + cachorro1.interagir("Vai deitar"));
System.out.println("O cachorro está " + cachorro1.interagir("nada"));
System.out.println("o cachorro está " + cachorro1.interagir("Pisar no rabo"));


*/




/*String nome = "Pedro Coder";
		
		saudacao(nome);//Aqui na chamada da função eu informo o parametro definido no metodo
		
		
		int result = soma(5 , 17);// defino quais serão os valores armazenados que irão realizar a ação 
		
		System.out.println("Resultado da soma = " + result);
		
	}
	
	
	public static int soma(int a, int b) {//Dentro dos parenteses eu defino os parametros
		return a + b; // Aqui eu defino o que esse metodo ira retornar no mais atraves do 'return'
	}
	
	/*public static void saudacao(String nome) {//Dentro dos parenteses eu defino os parametros
		System.out.println("Hello, " + nome);
	}*/
	
