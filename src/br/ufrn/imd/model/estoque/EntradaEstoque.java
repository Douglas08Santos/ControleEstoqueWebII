package br.ufrn.imd.model.estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.RH.Documento;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusMovimentacao;
import br.ufrn.imd.enu.TipoEntrada;
import br.ufrn.imd.model.ChecklistRecebimentoComum;
import br.ufrn.imd.model.ChecklistTransferencia;
import br.ufrn.imd.model.ConferenciaPesagem;
import br.ufrn.imd.model.NotaFiscal;
/*
 * MovimentacaoEntrada == movimentacaoEstoque??
 * */
public class EntradaEstoque {
	private String codigo;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacao;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private boolean precisaConferenciaEstado;
	private boolean precisaPesagem;
	private boolean precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the itens
	 */
	public List<MovimentacaoEstoque> getItens() {
		return itens;
	}
	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<MovimentacaoEstoque> itens) {
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
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}
	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
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
	 * @return the dataEntrada
	 */
	public Date getDataEntrada() {
		return dataEntrada;
	}
	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
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
	 * @return the precisaConferenciaEstado
	 */
	public boolean isPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}
	/**
	 * @param precisaConferenciaEstado the precisaConferenciaEstado to set
	 */
	public void setPrecisaConferenciaEstado(boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}
	/**
	 * @return the precisaPesagem
	 */
	public boolean isPrecisaPesagem() {
		return precisaPesagem;
	}
	/**
	 * @param precisaPesagem the precisaPesagem to set
	 */
	public void setPrecisaPesagem(boolean precisaPesagem) {
		this.precisaPesagem = precisaPesagem;
	}
	/**
	 * @return the precisaAnalise
	 */
	public boolean isPrecisaAnalise() {
		return precisaAnalise;
	}
	/**
	 * @param precisaAnalise the precisaAnalise to set
	 */
	public void setPrecisaAnalise(boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}
	/**
	 * @return the notaFiscal
	 */
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	/**
	 * @param notaFiscal the notaFiscal to set
	 */
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	/**
	 * @return the checklistRecebimento
	 */
	public ChecklistRecebimentoComum getChecklistRecebimento() {
		return checklistRecebimento;
	}
	/**
	 * @param checklistRecebimento the checklistRecebimento to set
	 */
	public void setChecklistRecebimento(ChecklistRecebimentoComum checklistRecebimento) {
		this.checklistRecebimento = checklistRecebimento;
	}
	/**
	 * @return the conferenciaPesagem
	 */
	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}
	/**
	 * @param conferenciaPesagem the conferenciaPesagem to set
	 */
	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}
	/**
	 * @return the checklistTransferencia
	 */
	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}
	/**
	 * @param checklistTransferencia the checklistTransferencia to set
	 */
	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
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
	/**
	 * @return the tipoEntrada
	 */
	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}
	/**
	 * @param tipoEntrada the tipoEntrada to set
	 */
	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	
	
	
}
