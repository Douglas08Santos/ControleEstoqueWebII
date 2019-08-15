package br.ufrn.imd.model.material;

import java.math.BigDecimal;

import br.ufrn.imd.model.DimensaoUnidade;
import br.ufrn.imd.model.LocalizacaoAlmoxarifado;

public class VolumeMaterial {
	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	//Eh o mesmo que Localizacao??
	private LocalizacaoAlmoxarifado localizacao;
	private LoteMaterial lote;
	private VolumeMaterial volumeOrigem;
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
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}
	/**
	 * @return the qtdInicial
	 */
	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}
	/**
	 * @param qtdInicial the qtdInicial to set
	 */
	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}
	/**
	 * @return the qtdAtual
	 */
	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}
	/**
	 * @param qtdAtual the qtdAtual to set
	 */
	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	/**
	 * @return the dimensao
	 */
	public DimensaoUnidade getDimensao() {
		return dimensao;
	}
	/**
	 * @param dimensao the dimensao to set
	 */
	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}
	/**
	 * @return the localizacao
	 */
	public LocalizacaoAlmoxarifado getLocalizacao() {
		return localizacao;
	}
	/**
	 * @param localizacao the localizacao to set
	 */
	public void setLocalizacao(LocalizacaoAlmoxarifado localizacao) {
		this.localizacao = localizacao;
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
	 * @return the volumeOrigem
	 */
	public VolumeMaterial getVolumeOrigem() {
		return volumeOrigem;
	}
	/**
	 * @param volumeOrigem the volumeOrigem to set
	 */
	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		this.volumeOrigem = volumeOrigem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dimensao == null) ? 0 : dimensao.hashCode());
		result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((qtdAtual == null) ? 0 : qtdAtual.hashCode());
		result = prime * result + ((qtdInicial == null) ? 0 : qtdInicial.hashCode());
		result = prime * result + ((volumeOrigem == null) ? 0 : volumeOrigem.hashCode());
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
		VolumeMaterial other = (VolumeMaterial) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dimensao == null) {
			if (other.dimensao != null)
				return false;
		} else if (!dimensao.equals(other.dimensao))
			return false;
		if (localizacao == null) {
			if (other.localizacao != null)
				return false;
		} else if (!localizacao.equals(other.localizacao))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (qtdAtual == null) {
			if (other.qtdAtual != null)
				return false;
		} else if (!qtdAtual.equals(other.qtdAtual))
			return false;
		if (qtdInicial == null) {
			if (other.qtdInicial != null)
				return false;
		} else if (!qtdInicial.equals(other.qtdInicial))
			return false;
		if (volumeOrigem == null) {
			if (other.volumeOrigem != null)
				return false;
		} else if (!volumeOrigem.equals(other.volumeOrigem))
			return false;
		return true;
	}
	
	

}
