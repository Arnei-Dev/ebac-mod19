package br.com.arneidev.reflectionstabela;

@Tabela(nomeTabela = "Tabela Ebac")
public class TabelaNome {
    private Long idTabela;

    public TabelaNome() {
    }

    public Long getIdTabela() {
        return idTabela;
    }

    public void setIdTabela(Long idTabela) {
        this.idTabela = idTabela;
    }
}
