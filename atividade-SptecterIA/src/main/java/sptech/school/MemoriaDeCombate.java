package sptech.school;

public class MemoriaDeCombate {

    private String estilo;
    private Integer vitorias;
    private Integer derrotas;

    public MemoriaDeCombate(String estilo) {
        this.estilo = estilo;
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public void registrarVitoria() {
        this.vitorias++;
    }

    public void registrarDerrota() {
        this.derrotas++;
    }

    public String getEstilo() {
        return estilo;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }
}
