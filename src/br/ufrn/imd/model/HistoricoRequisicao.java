package br.ufrn.imd.model;

import java.util.Date;

import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusRequisicao;

public class HistoricoRequisicao {
	private Date dataRegistro;
	private StatusRequisicao status;
	private Usuario usuario;
	private String observacoes;
	/**
	 * @return the dataRegistro
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}
	/**
	 * @param dataRegistro the dataRegistro to set
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	/**
	 * @return the status
	 */
	public StatusRequisicao getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusRequisicao status) {
		this.status = status;
	}
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}
	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
	
	

}
