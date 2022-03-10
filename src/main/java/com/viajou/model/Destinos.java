package com.viajou.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Destinos implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Origem;
	private String Destino;
	private String Descricao;
	private Date DataSaida;
	private Date DataChegada;
	private Integer Valor;
	private String Img;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getOrigem() {
		return Origem;
	}
	public void setOrigem(String origem) {
		Origem = origem;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Date getDataSaida() {
		return DataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		DataSaida = dataSaida;
	}
	public Date getDataChegada() {
		return DataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		DataChegada = dataChegada;
	}
	public Integer getValor() {
		return Valor;
	}
	public void setValor(Integer valor) {
		Valor = valor;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DataChegada, DataSaida, Descricao, Destino, Id, Img, Origem, Valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destinos other = (Destinos) obj;
		return Objects.equals(DataChegada, other.DataChegada) && Objects.equals(DataSaida, other.DataSaida)
				&& Objects.equals(Descricao, other.Descricao) && Objects.equals(Destino, other.Destino)
				&& Objects.equals(Id, other.Id) && Objects.equals(Img, other.Img)
				&& Objects.equals(Origem, other.Origem) && Objects.equals(Valor, other.Valor);
	}
	
	
}
