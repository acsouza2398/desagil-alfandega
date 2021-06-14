package br.edu.insper.desagil.alfandega;

import java.util.ArrayList;
import java.util.List;

public class Alfandega {
	private List<Item> itens;
	private List<ItemTarifado> itensTarifados;

	public Alfandega() {
		this.itens = new ArrayList<>();
		this.itensTarifados = new ArrayList<>();
	}
	
	public List<Item> getItens(){
		return this.itens;
	}
	
	public List<ItemTarifado> getItensTarifados(){
		return this.itensTarifados;
	}

	public void declara(Item item) {
		this.itens.add(item);
	}

	public void declara(ItemTarifado itemTarifado) {
		this.itensTarifados.add(itemTarifado);
	}

	public double getTotalDeclarado() {
		return getTotalDeclarado();
	}
	
	public double getTotalDevido() {
		return getTotalDevido();
	}
}
