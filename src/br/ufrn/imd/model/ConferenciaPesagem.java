package br.ufrn.imd.model;

import java.util.Date;

import br.ufrn.imd.model.material.LoteMaterial;

public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private int numeroVolumes;
	private double taraKg;
	private int pesoVolumes;
	private boolean executado;
	private boolean conferido;
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the lote
	 */
	public LoteMaterial getLote() {
		return lote;
	}
	/**
	 * @param lote the lote to set
	 */
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	/**
	 * @return the numeroVolumes
	 */
	public int getNumeroVolumes() {
		return numeroVolumes;
	}
	/**
	 * @param numeroVolumes the numeroVolumes to set
	 */
	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}
	/**
	 * @return the taraKg
	 */
	public double getTaraKg() {
		return taraKg;
	}
	/**
	 * @param taraKg the taraKg to set
	 */
	public void setTaraKg(double taraKg) {
		this.taraKg = taraKg;
	}
	/**
	 * @return the pesoVolumes
	 */
	public int getPesoVolumes() {
		return pesoVolumes;
	}
	/**
	 * @param pesoVolumes the pesoVolumes to set
	 */
	public void setPesoVolumes(int pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}
	/**
	 * @return the executado
	 */
	public boolean isExecutado() {
		return executado;
	}
	/**
	 * @param executado the executado to set
	 */
	public void setExecutado(boolean executado) {
		this.executado = executado;
	}
	/**
	 * @return the conferido
	 */
	public boolean isConferido() {
		return conferido;
	}
	/**
	 * @param conferido the conferido to set
	 */
	public void setConferido(boolean conferido) {
		this.conferido = conferido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (conferido ? 1231 : 1237);
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (executado ? 1231 : 1237);
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + numeroVolumes;
		result = prime * result + pesoVolumes;
		long temp;
		temp = Double.doubleToLongBits(taraKg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConferenciaPesagem other = (ConferenciaPesagem) obj;
		if (conferido != other.conferido)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (executado != other.executado)
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (numeroVolumes != other.numeroVolumes)
			return false;
		if (pesoVolumes != other.pesoVolumes)
			return false;
		if (Double.doubleToLongBits(taraKg) != Double.doubleToLongBits(other.taraKg))
			return false;
		return true;
	}
	
	
	
	
}
