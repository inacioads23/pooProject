package pooProject.equipamento.Main;

import pooProject.equipamento.iphone.Iphone;

public class App {
	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		// NavegadorInternet
		System.out.println("--> Navegador de Internet <--");
		iphone.exibirPagina("http://terra.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		// ReprodutorMusical
		System.out.println("\n--> Reprodutor Musical <--");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Asa Branca");
		
		// AparelhoTelefônico
		System.out.println("\n--> Aparelho Telefônico <--");
		iphone.ligar("11 93262-1931");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		
	}

}
