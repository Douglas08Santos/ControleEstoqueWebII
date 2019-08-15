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
	
}
