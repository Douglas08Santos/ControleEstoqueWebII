package br.ufrn.imd.model;

import java.util.Date;

import br.ufrn.imd.enu.ViaTransporte;



public class GuiaRemessa {
	private int numeroGuiaRemessa;
	private Date dataEmissão;
	private ViaTransporte viaTransporte;
	private String especieEmabalagem;
	private NaturezaOperacao naturezaOperacao;
	private int remessa;
	/**
	 * @return the numeroGuiaRemessa
	 */
	public int getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}
	/**
	 * @param numeroGuiaRemessa the numeroGuiaRemessa to set
	 */
	public void setNumeroGuiaRemessa(int numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}
	/**
	 * @return the dataEmissão
	 */
	public Date getDataEmissão() {
		return dataEmissão;
	}
	/**
	 * @param dataEmissão the dataEmissão to set
	 */
	public void setDataEmissão(Date dataEmissão) {
		this.dataEmissão = dataEmissão;
	}
	/**
	 * @return the viaTransporte
	 */
	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}
	/**
	 * @param viaTransporte the viaTransporte to set
	 */
	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}
	/**
	 * @return the especieEmabalagem
	 */
	public String getEspecieEmabalagem() {
		return especieEmabalagem;
	}
	/**
	 * @param especieEmabalagem the especieEmabalagem to set
	 */
	public void setEspecieEmabalagem(String especieEmabalagem) {
		this.especieEmabalagem = especieEmabalagem;
	}
	/**
	 * @return the naturezaOperacao
	 */
	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}
	/**
	 * @param naturezaOperacao the naturezaOperacao to set
	 */
	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	/**
	 * @return the remessa
	 */
	public int getRemessa() {
		return remessa;
	}
	/**
	 * @param remessa the remessa to set
	 */
	public void setRemessa(int remessa) {
		this.remessa = remessa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissão == null) ? 0 : dataEmissão.hashCode());
		result = prime * result + ((especieEmabalagem == null) ? 0 : especieEmabalagem.hashCode());
		result = prime * result + ((naturezaOperacao == null) ? 0 : naturezaOperacao.hashCode());
		result = prime * result + numeroGuiaRemessa;
		result = prime * result + remessa;
		result = prime * result + ((viaTransporte == null) ? 0 : viaTransporte.hashCode());
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
		GuiaRemessa other = (GuiaRemessa) obj;
		if (dataEmissão == null) {
			if (other.dataEmissão != null)
				return false;
		} else if (!dataEmissão.equals(other.dataEmissão))
			return false;
		if (especieEmabalagem == null) {
			if (other.especieEmabalagem != null)
				return false;
		} else if (!especieEmabalagem.equals(other.especieEmabalagem))
			return false;
		if (naturezaOperacao == null) {
			if (other.naturezaOperacao != null)
				return false;
		} else if (!naturezaOperacao.equals(other.naturezaOperacao))
			return false;
		if (numeroGuiaRemessa != other.numeroGuiaRemessa)
			return false;
		if (remessa != other.remessa)
			return false;
		if (viaTransporte != other.viaTransporte)
			return false;
		return true;
	}
	
	
	
	
}
