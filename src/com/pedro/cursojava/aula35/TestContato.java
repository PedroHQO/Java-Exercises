package com.pedro.cursojava.aula35;

public class TestContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Valdomiro");
		//contato.setEndereco("Luis Oliveira");
		//contato.setTel("35 123 456");
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua Pimogadaba");
		end.setNumero("n/a");
		end.setComplemento("3/4");
		end.setCidade("Bubelandia");
		end.setUf("Birimbinha");
		end.setCep("6667666");
		
		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("35");
		tel.setNumero("9 789-456");
		
		Telefone tel1 = new Telefone();
		tel1.setTipo("Trabalho");
		tel1.setDdd("31");
		tel1.setNumero("9 654-987");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Fixo");
		tel1.setDdd("37");
		tel2.setNumero("0789-4566");
		
		Telefone[] telefones = new Telefone[3];
		telefones[0] = tel;
		telefones[1] = tel1;
		telefones[2] = tel2;
		
		contato.setTelefones(telefones);
		
		//Teste relacionamento tem-um telefone
		//contato.setTelefone(tel);
		
		
		//Setando contato, se essa parte não estiver no código não imprimira o bloco if no console, porém não dará erro também
		//aqui estou instanciando contato e setando Endereco
		contato.setEndereco(end);
		
		
		System.out.println("Dados cadastrais:\n" + contato.getNome());
		
		//Bloco para assegurar que o objeto será chamado de forma segura
		//Relacionamento tem um contato
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*(if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getTipo() + ": (" + contato.getTelefone().getDdd() + ") " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getTipo() + ": (" + t.getDdd() + ") " + t.getNumero());
			}
		}
	}

}
