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

}
