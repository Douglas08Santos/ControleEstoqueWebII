package br.ufrn.imd.model;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.RH.Documento;
import br.ufrn.imd.RH.Funcionario;
import br.ufrn.imd.model.material.LoteMaterial;

public class ChecklistRecebimentoComum {
	private Date dataChegada;
	private LoteMaterial lote;
	private boolean materialConfereNF;
	private boolean etiquetadoIdentificacao;
	private boolean embalagemIntegra;
	private boolean embalagemSuja;
	private boolean embalagemUmida;
	private boolean embalagemDeformada;
	private boolean embalagemVazada;
	private boolean embalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observação;
	private Funcionario conferente;
	private List<Documento> anexoFotos;
	private boolean aprovado;
	/**
	 * @return the dataChegada
	 */
	public Date getDataChegada() {
		return dataChegada;
	}
	/**
	 * @param dataChegada the dataChegada to set
	 */
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
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
	 * @return the materialConfereNF
	 */
	public boolean isMaterialConfereNF() {
		return materialConfereNF;
	}
	/**
	 * @param materialConfereNF the materialConfereNF to set
	 */
	public void setMaterialConfereNF(boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}
	/**
	 * @return the etiquetadoIdentificacao
	 */
	public boolean isEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}
	/**
	 * @param etiquetadoIdentificacao the etiquetadoIdentificacao to set
	 */
	public void setEtiquetadoIdentificacao(boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}
	/**
	 * @return the embalagemIntegra
	 */
	public boolean isEmbalagemIntegra() {
		return embalagemIntegra;
	}
	/**
	 * @param embalagemIntegra the embalagemIntegra to set
	 */
	public void setEmbalagemIntegra(boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}
	/**
	 * @return the embalagemSuja
	 */
	public boolean isEmbalagemSuja() {
		return embalagemSuja;
	}
	/**
	 * @param embalagemSuja the embalagemSuja to set
	 */
	public void setEmbalagemSuja(boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}
	/**
	 * @return the embalagemUmida
	 */
	public boolean isEmbalagemUmida() {
		return embalagemUmida;
	}
	/**
	 * @param embalagemUmida the embalagemUmida to set
	 */
	public void setEmbalagemUmida(boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}
	/**
	 * @return the embalagemDeformada
	 */
	public boolean isEmbalagemDeformada() {
		return embalagemDeformada;
	}
	/**
	 * @param embalagemDeformada the embalagemDeformada to set
	 */
	public void setEmbalagemDeformada(boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}
	/**
	 * @return the embalagemVazada
	 */
	public boolean isEmbalagemVazada() {
		return embalagemVazada;
	}
	/**
	 * @param embalagemVazada the embalagemVazada to set
	 */
	public void setEmbalagemVazada(boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}
	/**
	 * @return the embalagemLacreViolado
	 */
	public boolean isEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}
	/**
	 * @param embalagemLacreViolado the embalagemLacreViolado to set
	 */
	public void setEmbalagemLacreViolado(boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the temperatura
	 */
	public float getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the numeroConhecimento
	 */
	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}
	/**
	 * @param numeroConhecimento the numeroConhecimento to set
	 */
	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
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
	 * @return the observação
	 */
	public String getObservação() {
		return observação;
	}
	/**
	 * @param observação the observação to set
	 */
	public void setObservação(String observação) {
		this.observação = observação;
	}
	/**
	 * @return the conferente
	 */
	public Funcionario getConferente() {
		return conferente;
	}
	/**
	 * @param conferente the conferente to set
	 */
	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}
	/**
	 * @return the anexoFotos
	 */
	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}
	/**
	 * @param anexoFotos the anexoFotos to set
	 */
	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}
	/**
	 * @return the aprovado
	 */
	public boolean isAprovado() {
		return aprovado;
	}
	/**
	 * @param aprovado the aprovado to set
	 */
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (etiquetadoIdentificacao ? 1231 : 1237);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChecklistRecebimentoComum other = (ChecklistRecebimentoComum) obj;
		if (etiquetadoIdentificacao != other.etiquetadoIdentificacao)
			return false;
		return true;
	}
	
	
	
	
	
	

}
