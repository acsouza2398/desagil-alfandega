package br.edu.insper.desagil.alfandega;

import java.util.List;

public class Imposto extends Alfandega{
	
	public Imposto() {
		super();
	}
	
	public double getTotalDeclarado() {
		double total = 0.0;
		List<Item> listaItens = this.getItens();
		List<ItemTarifado> listaItensTarifados = this.getItensTarifados();
		
		for (Item item : listaItens) {
			total += item.getRate() * item.getValor();
		}
		for (ItemTarifado itemTarifado : listaItensTarifados) {
			total += itemTarifado.getRate() * itemTarifado.getValor();
		}
		return total;
	}

	public double getTotalDevido() {
		double total = 0.0;
		List<Item> listaItens = this.getItens();
		List<ItemTarifado> listaItensTarifados = this.getItensTarifados();

		
		for (Item item : listaItens) {
			// Mesmo em itens sem tarifa, a alfândega cobra
			// uma taxa de 1% Por quê? Porque eles podem.
			total += item.getRate() * item.getValor() * 0.01;
		}
		for (ItemTarifado itemTarifado : listaItensTarifados) {
			total += itemTarifado.getRate() * itemTarifado.getValor() * itemTarifado.getTarifa();
		}
		return total;
	}

}
