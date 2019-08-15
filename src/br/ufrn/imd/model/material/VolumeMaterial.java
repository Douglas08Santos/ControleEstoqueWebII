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

}
