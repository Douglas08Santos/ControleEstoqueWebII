package br.ufrn.imd.model.estoque;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.RH.PessoaJuridica;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.TipoMovimentacao;
import br.ufrn.imd.model.Almoxarifado;
import br.ufrn.imd.model.material.LoteMaterial;
import br.ufrn.imd.model.material.Material;

public class MovimentacaoEstoque {
	private Usuario responsavel;
	private PessoaJuridica pjOrigem;
	private Almoxarifado almoxarifadoOrigem;
	private PessoaJuridica pjDestino;
	private Almoxarifado almoxarifadoDestino;
	private BigDecimal qtdMovimentada;
	private LoteMaterial itemLote;
	private Material itemMaterial;
	private Date dataMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
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
	 * @return the pjOrigem
	 */
	public PessoaJuridica getPjOrigem() {
		return pjOrigem;
	}
	/**
	 * @param pjOrigem the pjOrigem to set
	 */
	public void setPjOrigem(PessoaJuridica pjOrigem) {
		this.pjOrigem = pjOrigem;
	}
	/**
	 * @return the almoxarifadoOrigem
	 */
	public Almoxarifado getAlmoxarifadoOrigem() {
		return almoxarifadoOrigem;
	}
	/**
	 * @param almoxarifadoOrigem the almoxarifadoOrigem to set
	 */
	public void setAlmoxarifadoOrigem(Almoxarifado almoxarifadoOrigem) {
		this.almoxarifadoOrigem = almoxarifadoOrigem;
	}
	/**
	 * @return the pjDestino
	 */
	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}
	/**
	 * @param pjDestino the pjDestino to set
	 */
	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}
	/**
	 * @return the almoxarifadoDestino
	 */
	public Almoxarifado getAlmoxarifadoDestino() {
		return almoxarifadoDestino;
	}
	/**
	 * @param almoxarifadoDestino the almoxarifadoDestino to set
	 */
	public void setAlmoxarifadoDestino(Almoxarifado almoxarifadoDestino) {
		this.almoxarifadoDestino = almoxarifadoDestino;
	}
	/**
	 * @return the qtdMovimentada
	 */
	public BigDecimal getQtdMovimentada() {
		return qtdMovimentada;
	}
	/**
	 * @param qtdMovimentada the qtdMovimentada to set
	 */
	public void setQtdMovimentada(BigDecimal qtdMovimentada) {
		this.qtdMovimentada = qtdMovimentada;
	}
	/**
	 * @return the itemLote
	 */
	public LoteMaterial getItemLote() {
		return itemLote;
	}
	/**
	 * @param itemLote the itemLote to set
	 */
	public void setItemLote(LoteMaterial itemLote) {
		this.itemLote = itemLote;
	}
	/**
	 * @return the itemMaterial
	 */
	public Material getItemMaterial() {
		return itemMaterial;
	}
	/**
	 * @param itemMaterial the itemMaterial to set
	 */
	public void setItemMaterial(Material itemMaterial) {
		this.itemMaterial = itemMaterial;
	}
	/**
	 * @return the dataMovimentacao
	 */
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	/**
	 * @param dataMovimentacao the dataMovimentacao to set
	 */
	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	/**
	 * @return the tipoMovimentacao
	 */
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	/**
	 * @param tipoMovimentacao the tipoMovimentacao to set
	 */
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
	

}
