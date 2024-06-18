package PilhaDinamica;

public class No {
    No proximo;
    private String valor;

    public No(String dado){
        this.valor = dado;
        this.proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
