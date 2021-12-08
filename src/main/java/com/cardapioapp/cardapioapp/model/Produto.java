package com.cardapioapp.cardapioapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToMany(mappedBy = "produto")
	private List<ProdutoPedido> produtoPedido = new ArrayList<>(0);
	
	@NotNull
	private String descrição;
	@NotNull
	private String tipo;
	@NotNull
	private float valor;
	
	
	public Produto(String descrição, String tipo, float valor) {
		super();
		this.descrição = descrição;
		this.tipo = tipo;
		this.valor = valor;
		
		
	}
	
	public Produto() {
		
	}
	
	
	



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	
	
	
	
	
	
}
