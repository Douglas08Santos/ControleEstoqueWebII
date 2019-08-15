package br.ufrn.imd.model;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.RH.PessoaJuridica;

public class NotaFiscal {
	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatario;
	private BigDecimal valorTotal;
	/**
	 * @return the serieNF
	 */
	public int getSerieNF() {
		return serieNF;
	}
	/**
	 * @param serieNF the serieNF to set
	 */
	public void setSerieNF(int serieNF) {
		this.serieNF = serieNF;
	}
	/**
	 * @return the numeroNF
	 */
	public int getNumeroNF() {
		return numeroNF;
	}
	/**
	 * @param numeroNF the numeroNF to set
	 */
	public void setNumeroNF(int numeroNF) {
		this.numeroNF = numeroNF;
	}
	/**
	 * @return the transportadora
	 */
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	/**
	 * @param transportadora the transportadora to set
	 */
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	/**
	 * @return the motorista
	 */
	public String getMotorista() {
		return motorista;
	}
	/**
	 * @param motorista the motorista to set
	 */
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	/**
	 * @return the placaVeiculo
	 */
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	/**
	 * @param placaVeiculo the placaVeiculo to set
	 */
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	/**
	 * @return the dataEmissao
	 */
	public Date getDataEmissao() {
		return dataEmissao;
	}
	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	/**
	 * @return the emitente
	 */
	public PessoaJuridica getEmitente() {
		return emitente;
	}
	/**
	 * @param emitente the emitente to set
	 */
	public void setEmitente(PessoaJuridica emitente) {
		this.emitente = emitente;
	}
	/**
	 * @return the destinatario
	 */
	public PessoaJuridica getDestinatario() {
		return destinatario;
	}
	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(PessoaJuridica destinatario) {
		this.destinatario = destinatario;
	}
	/**
	 * @return the valorTotal
	 */
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + numeroNF;
		result = prime * result + serieNF;
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
		NotaFiscal other = (NotaFiscal) obj;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (numeroNF != other.numeroNF)
			return false;
		if (serieNF != other.serieNF)
			return false;
		return true;
	}
		
	
}
