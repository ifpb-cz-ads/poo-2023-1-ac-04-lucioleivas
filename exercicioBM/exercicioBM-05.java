public class ExercicioBM-05 {
    private int vitorias;
    private int derrotas;
    private int empates;
    private int posicao;

    public Exercicio05(int vitorias, int derrotas, int empates, int posicao) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.posicao = posicao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}

	static void subirtime(){
	System.out.println("o time subiu uma posicao");
    this.setPosicao(getPosicao()+1);
	}
	
	static void rebaixartime(){
	System.out.println("o time caiu uma posicao");
    this.setPosicao(getPosicao()-1);
  }
