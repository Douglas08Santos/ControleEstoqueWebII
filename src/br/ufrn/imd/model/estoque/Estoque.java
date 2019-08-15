package br.ufrn.imd.model.estoque;

import java.math.BigDecimal;
import java.util.List;

import br.ufrn.imd.model.Almoxarifado;
import br.ufrn.imd.model.material.LoteMaterial;
import br.ufrn.imd.model.material.Material;

public class Estoque {
	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private List<MovimentacaoEstoque> historicoMovimentacoes;
}
