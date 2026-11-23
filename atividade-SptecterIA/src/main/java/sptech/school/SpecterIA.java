package sptech.school;

// Classe abstrata que define a base e o contrato de duelo para todos os Specters
public abstract class SpecterIA {

    private Integer energia;
    private Boolean sincronizado;
    // Composicao: cada SpecterIA possui e gerencia sua propria MemoriaDeCombate
    private MemoriaDeCombate memoria;

    public SpecterIA(Integer energia, Boolean sincronizado, String estilo) {
        this.energia = (energia != null && energia > 0) ? energia : 0;
        this.sincronizado = Boolean.TRUE.equals(sincronizado) && this.energia > 0;
        this.memoria = new MemoriaDeCombate(estilo);
    }

    public void receberDano(Integer valor) {
        if (valor == null || valor <= 0 || !estaAtivo()) {
            return;
        }

        this.energia -= valor;
        if (this.energia <= 0) {
            this.energia = 0;
            this.sincronizado = false;
        }
    }

    public Boolean estaAtivo() {
        return Boolean.TRUE.equals(this.sincronizado) && this.energia > 0;
    }

    // Contrato polimorfico: cada subclasse define seu comportamento no turno
    public abstract void executarTurno();

    public Integer getEnergia() {
        return energia;
    }

    public MemoriaDeCombate getMemoria() {
        return memoria;
    }
}
