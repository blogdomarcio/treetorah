package model;

public class Dados {

    private Long id;
    private String data;
    private String cidade;
    private Long numero_arvores;
    private Long volume;
    private Long arvores_repostas;
    private Double valor_pagar;

    @Override
    public String toString(){
        return "Protocolo : 00" + id.toString() + " - " + cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getNumero_arvores() {
        return numero_arvores;
    }

    public void setNumero_arvores(Long numero_arvores) {
        this.numero_arvores = numero_arvores;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getArvores_repostas() {
        return arvores_repostas;
    }

    public void setArvores_repostas(Long arvores_repostas) {
        this.arvores_repostas = arvores_repostas;
    }

    public Double getValor_pagar() {
        return valor_pagar;
    }

    public void setValor_pagar(Double valor_pagar) {
        this.valor_pagar = valor_pagar;
    }


}
