package com.pedro.letscode;

public class Cachorro extends Animal {

	//Definição de classes, não coloquei valores, pois senao eu estaria definindo um valor fixo
	//Está definição chamos de atributos
	
	static int contCachorro;//Essa variavel serve mais para as classes do que os objetos
	

	
	private int tamanhoDoRabo;
	

	
	//Contrutores: Eles tem o nome da classe. Dentro do parenteses colocamos o que queremos receber
	
	//Contrutor padrão

	
	public Cachorro(String nome, String cor, double altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
		super(nome, cor, peso);
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.tamanhoDoRabo = tamanhoDoRabo;
		this.estadoDeEspirito = estadoDeEspirito;
		
		contCachorro++;
	}
	
	
	
	/*Mudando o tipo do meu atributo para private eu estou encapsulando. Logo se eu quiser acessar	
	Em outra classe esses atributos, precisarei utilizar Getters/Setters
	Metodos*/
	public String getNome() {
		return this.nome;
	}
	


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public int getTamanhoDoRabo() {
		return this.tamanhoDoRabo;
	}
	
	public void setTamanhoDoRabo(int tamanhoDoRabo) {
		this.tamanhoDoRabo = tamanhoDoRabo;
	}
	
	public int getContCahorro() {
		return this.contCachorro;
	}
	
	public void setContCachorro(int contCachorro) {
		this.contCachorro = contCachorro;
	}
	
	//definindo metodos
	
	//isto é a assinatura de um metodo. Ele é publico, não tem retorno e tem um nome comer, 
	//não tem variavel nenhuma e não faz nada
	


	//Criei um metodo pegar, porem com retorno
	public String pegar() {
	
		//Todo o metodo com retorno eu sou obrigado a usar o return e deve ser do mesmo tipo do metodo
		//neste caso String
		return "Bolinha";
	}
	
	public String getEstadoEspirito() {
		return this.estadoDeEspirito;
	}
	
	//Metodo que espera um retorno de String
	public String interagir(String acao) {
		//Definindo a ação que sera retornado no metodo
		
		switch(acao) {
		case "carinho": this.estadoDeEspirito = "Feliz"; break;
		case "Vai deitar": this.estadoDeEspirito = "Triste"; break;
		case "Pisar no rabo": this.estadoDeEspirito = "Bravo"; break;
		default: this.estadoDeEspirito = "Neutro";
		
		}
		
		
		
//		if(acao.equals("carinho")) {
//			//O this é para espeficar de qual atributo eu estou falando, 
//			//eu poderia deixar sem o this, porem com ele eu garanto que vai puxar o que eu quero
//			this.estadoDeEspirito = "Feliz";
//		}else if(acao.equals("Vai deitar")) {
//			this.estadoDeEspirito = "Bravo";
//		}else {
//			this.estadoDeEspirito = "Neutro";
//		}
		
		return estadoDeEspirito;
	}
	
	//metodo toString, definimos quando uma variavel é única como um CPF, CNPJ. 
	//Posso saber que ao proucurar será único
	@Override//Pega um metodo que pe do Pai da classe e altera 
	public String toString() {
		return "Cachorro [nome=" + nome + "]";
	}


	//Altero o metodo som, para herdar o metodo som da classe Pai, porem com as 
	//caracteristicas do filho, por isso do @Override
	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("AU AU AU");
	}
	
	
	
	
}
