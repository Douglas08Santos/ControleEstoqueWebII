package br.ufrn.imd.model.material;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.Producao.OrdemProducao;
import br.ufrn.imd.RH.PessoaJuridica;
import br.ufrn.imd.enu.EstadoLote;

public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;
	
}
