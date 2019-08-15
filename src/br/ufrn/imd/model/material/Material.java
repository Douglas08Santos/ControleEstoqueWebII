package br.ufrn.imd.model.material;

import java.math.BigDecimal;

import br.ufrn.imd.enu.StatusMaterial;
import br.ufrn.imd.model.UnidadeMedida;

public class Material {
	private int codigo;
	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the especificacao
	 */
	public String getEspecificacao() {
		return especificacao;
	}
	/**
	 * @param especificacao the especificacao to set
	 */
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	/**
	 * @return the grupoMaterial
	 */
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	/**
	 * @param grupoMaterial the grupoMaterial to set
	 */
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	/**
	 * @return the estoqueMinimo
	 */
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	/**
	 * @param estoqueMinimo the estoqueMinimo to set
	 */
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	/**
	 * @return the pontoPedido
	 */
	public int getPontoPedido() {
		return pontoPedido;
	}
	/**
	 * @param pontoPedido the pontoPedido to set
	 */
	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}
	/**
	 * @return the unidadeEstoque
	 */
	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}
	/**
	 * @param unidadeEstoque the unidadeEstoque to set
	 */
	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}
	/**
	 * @return the unidadeEntrada
	 */
	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}
	/**
	 * @param unidadeEntrada the unidadeEntrada to set
	 */
	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}
	/**
	 * @return the fatorConversaoEntrada
	 */
	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}
	/**
	 * @param fatorConversaoEntrada the fatorConversaoEntrada to set
	 */
	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}
	/**
	 * @return the unidadeSaida
	 */
	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}
	/**
	 * @param unidadeSaida the unidadeSaida to set
	 */
	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}
	/**
	 * @return the fatorConversaoSaida
	 */
	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}
	/**
	 * @param fatorConversaoSaida the fatorConversaoSaida to set
	 */
	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}
	/**
	 * @return the dadosAdicionais
	 */
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	/**
	 * @param dadosAdicionais the dadosAdicionais to set
	 */
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	/**
	 * @return the classificacao
	 */
	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}
	/**
	 * @param classificacao the classificacao to set
	 */
	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}
	/**
	 * @return the catmat
	 */
	public int getCatmat() {
		return catmat;
	}
	/**
	 * @param catmat the catmat to set
	 */
	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}
	/**
	 * @return the condicaoArmazenagem
	 */
	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}
	/**
	 * @param condicaoArmazenagem the condicaoArmazenagem to set
	 */
	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}
	/**
	 * @return the status
	 */
	public StatusMaterial getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Material other = (Material) obj;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
