package empregador;

public class Vaga {

    private int vagaNome;
    private double vagaSalario;
    private int vagasDisponiveis;


    public Vaga(int vagaNome, double vagaSalario, int vagasDisponiveis) {
        this.vagaNome = vagaNome;
        this.vagaSalario = vagaSalario;
        this.vagasDisponiveis = vagasDisponiveis;
    }


    public int getVagaNome() {
        return vagaNome;
    }

    public void setVagaNome(int vagaNome) {
        this.vagaNome = vagaNome;
    }

    public double getVagaSalario() {
        return vagaSalario;
    }

    public void setVagaSalario(double vagaSalario) {
        this.vagaSalario = vagaSalario;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public void analisarCandidato(double salarioCandidato){



    }


}
