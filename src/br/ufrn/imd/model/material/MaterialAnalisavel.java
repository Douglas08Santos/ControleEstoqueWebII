package br.ufrn.imd.model.material;

import java.math.BigDecimal;

import br.ufrn.imd.Producao.DenominacaoComumBrasileira;
import br.ufrn.imd.RH.Documento;

public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private int prazoEntrega;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;
}
