package pooProject.equipamento.iphone;

import pooProject.equipamento.navegador.NavegadorInternet;
import pooProject.equipamento.reprodutor.ReprodutorMusical;
import pooProject.equipamento.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA");
	}

	
	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");	
	}

	@Override
	public void pausar() {
	 System.out.println("PAUSANDO A MÚSICA");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO A MÚSICA: " + musica);		
	}
	
	
	@Override
	public void ligar(String numero) {
		System.out.println("EXIBINDO NÚMERO DIGITADO: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO TELEFONE");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

}
