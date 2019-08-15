package br.ufrn.imd.model.estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.RH.Documento;
import br.ufrn.imd.RH.MovimentacaoSaida;
import br.ufrn.imd.RH.PessoaJuridica;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusMovimentacao;
import br.ufrn.imd.model.GuiaRemessa;

public class SaidaEstoque {
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoSaida> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	/**
	 * @return the responsavel
	 */
	public Usuario getResponsavel() {
		return responsavel;
	}
	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	/**
	 * @return the dataEnvio
	 */
	public Date getDataEnvio() {
		return dataEnvio;
	}
	/**
	 * @param dataEnvio the dataEnvio to set
	 */
	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}
	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	/**
	 * @return the itens
	 */
	public List<MovimentacaoSaida> getItens() {
		return itens;
	}
	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<MovimentacaoSaida> itens) {
		this.itens = itens;
	}
	/**
	 * @return the status
	 */
	public StatusMovimentacao getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusMovimentacao status) {
		this.status = status;
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
	 * @return the anexos
	 */
	public List<Documento> getAnexos() {
		return anexos;
	}
	/**
	 * @param anexos the anexos to set
	 */
	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}
	/**
	 * @return the guiaRemessa
	 */
	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}
	/**
	 * @param guiaRemessa the guiaRemessa to set
	 */
	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}
	/**
	 * @return the pjDestinatario
	 */
	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}
	/**
	 * @param pjDestinatario the pjDestinatario to set
	 */
	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}
	/**
	 * @return the justificativa
	 */
	public String getJustificativa() {
		return justificativa;
	}
	/**
	 * @param justificativa the justificativa to set
	 */
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
	
	
}
