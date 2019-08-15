package br.ufrn.imd.model;

import java.util.List;

import br.ufrn.imd.RH.Setor;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusRequisicao;
import br.ufrn.imd.model.estoque.SaidaEstoque;

public class SaidaRequisicaoInterna {
	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itensRequisicao;
	private List<HistoricoRequisicao> historicoRequisicao;
	private SaidaEstoque saidaEstoque;
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
	 * @return the requisitante
	 */
	public Usuario getRequisitante() {
		return requisitante;
	}
	/**
	 * @param requisitante the requisitante to set
	 */
	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}
	/**
	 * @return the setorRequisitante
	 */
	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}
	/**
	 * @param setorRequisitante the setorRequisitante to set
	 */
	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}
	/**
	 * @return the responsavelSetor
	 */
	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}
	/**
	 * @param responsavelSetor the responsavelSetor to set
	 */
	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}
	/**
	 * @return the statusRequisicao
	 */
	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}
	/**
	 * @param statusRequisicao the statusRequisicao to set
	 */
	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}
	/**
	 * @return the itensRequisicao
	 */
	public List<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}
	/**
	 * @param itensRequisicao the itensRequisicao to set
	 */
	public void setItensRequisicao(List<ItemRequisicao> itensRequisicao) {
		this.itensRequisicao = itensRequisicao;
	}
	/**
	 * @return the historicoRequisicao
	 */
	public List<HistoricoRequisicao> getHistoricoRequisicao() {
		return historicoRequisicao;
	}
	/**
	 * @param historicoRequisicao the historicoRequisicao to set
	 */
	public void setHistoricoRequisicao(List<HistoricoRequisicao> historicoRequisicao) {
		this.historicoRequisicao = historicoRequisicao;
	}
	/**
	 * @return the saidaEstoque
	 */
	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}
	/**
	 * @param saidaEstoque the saidaEstoque to set
	 */
	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}
	
	
	
}
