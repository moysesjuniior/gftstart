package crianca;

public class Crianca {
    private String crianca;
    private String personalidade;
    public boolean status;
    public int presente;

    public void boazinha() {
        System.out.println("Parabéns! Você foi boazinha: " + this.ganharPresente());
    }

    public void malvada() {
        System.out.println("Infezlimente, você não se comportou: " + this.naoGanhaPresente());
    }

    public void ganharPresente() {
        System.out.println("Ganhou presente!");
    }

    public void naoGanhaPresente() {
        System.out.println("Não ganhou presente!");
    }

    public String getCrianca() {
        return crianca;
    }

    public void setCrianca(String crianca) {
        this.crianca = crianca;
    }

    public String getPersonalidade() {
        if (boazinha() == ganharPresente()) {

        } else (malvada() == naoGanhaPresente());
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        if (boazinha() = ganharPresente());
        this.personalidade = personalidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

