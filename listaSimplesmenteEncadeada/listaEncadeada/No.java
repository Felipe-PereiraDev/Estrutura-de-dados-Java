package listaEncadeada;

public class No {
    private No proximo;
    private String dado;


    public No(String dado){
        this.dado = dado;
        this.proximo = null;
    }
    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
}
