package br.ufrn.imd.model;

import java.util.List;

import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.TipoMaterial;

public class Almoxarifado {
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tiposMateriais;
	private List<Usuario> usuariosAlmoxarifado;
	private boolean enderecado;
	private List<LocalizacaoAlmoxarifado> localizacoes;
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
	 * @return the chefe
	 */
	public Usuario getChefe() {
		return chefe;
	}
	/**
	 * @param chefe the chefe to set
	 */
	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}
	/**
	 * @return the tiposMateriais
	 */
	public List<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}
	/**
	 * @param tiposMaterials the tiposMateriais to set
	 */
	public void setTiposMateriais(List<TipoMaterial> tiposMateriais) {
		this.tiposMateriais = tiposMateriais;
	}
	/**
	 * @return the usuariosAlmoxarifado
	 */
	public List<Usuario> getUsuariosAlmoxarifado() {
		return usuariosAlmoxarifado;
	}
	/**
	 * @param usuariosAlmoxarifado the usuariosAlmoxarifado to set
	 */
	public void setUsuariosAlmoxarifado(List<Usuario> usuariosAlmoxarifado) {
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
	}
	/**
	 * @return the enderecado
	 */
	public boolean isEnderecado() {
		return enderecado;
	}
	/**
	 * @param enderecado the enderecado to set
	 */
	public void setEnderecado(boolean enderecado) {
		this.enderecado = enderecado;
	}
	/**
	 * @return the localizacoes
	 */
	public List<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}
	/**
	 * @param localizacoes the localizacoes to set
	 */
	public void setLocalizacoes(List<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enderecado ? 1231 : 1237);
		result = prime * result + ((localizacoes == null) ? 0 : localizacoes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tiposMateriais == null) ? 0 : tiposMateriais.hashCode());
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
		Almoxarifado other = (Almoxarifado) obj;
		if (enderecado != other.enderecado)
			return false;
		if (localizacoes == null) {
			if (other.localizacoes != null)
				return false;
		} else if (!localizacoes.equals(other.localizacoes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tiposMateriais == null) {
			if (other.tiposMateriais != null)
				return false;
		} else if (!tiposMateriais.equals(other.tiposMateriais))
			return false;
		return true;
	}
	
	
	
	
}
