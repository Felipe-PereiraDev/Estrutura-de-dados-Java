package listaEncadeada;

public class Lista {
    private No primeiro;
    private int tamanho;
    public Lista(){
        this.tamanho = 0;
        this.primeiro = null;
    }
    // Método inserir no inicio
    public void inserir_no_inicio(String novo_valor){
        No novo_no = new No(novo_valor);
        novo_no.setProximo(this.primeiro);
        this.primeiro = novo_no;
        this.tamanho++;
    }

    // método de inserir ordenado
    public void inserir_no_fim(String novo_valor){
        No novo_no = new No(novo_valor);
        if(this.primeiro == null){ // está vazia?
            this.primeiro = novo_no;
        }
        else {
            No aux =  this.primeiro;
            while(aux.getProximo() != null){
                aux = aux .getProximo();
            }
            aux.setProximo(novo_no);
        }
        this.tamanho++;
    }

    // método inserir ordenado
    public void inserir_ordenado(String novo_valor){
        No novo_no = new No(novo_valor);
        if(this.primeiro == null){ // está vazia?
            this.primeiro = novo_no;
        }
        else {
            No aux = this.primeiro;
            if(novo_valor.compareTo(this.primeiro.getDado()) < 0){ // novo_valor é menor que o primeiro elemento
                novo_no.setProximo(this.primeiro);
                this.primeiro = novo_no;
            }
            else{
                while(aux.getProximo() != null && novo_valor.compareTo(aux.getProximo().getDado()) >= 0){
                    // novo_valor for maior ou igual ao valor comparado
                    aux = aux.getProximo();
                }
                novo_no.setProximo(aux.getProximo());
                aux.setProximo(novo_no);
            }
        }
        this.tamanho++;
    }

    public No remover_inicio(){
        No remover = null;
        if(this.primeiro == null){
            System.err.println("Lista  está vazia");
        }
        else{
            remover = this.primeiro;
            this.primeiro = remover.getProximo();
        }
        this.tamanho--;
        return remover;
    }

    public No remover_fim(){
        No remover = null;
        if(this.primeiro == null){
            System.err.println("Lista está vazia");
        }
        else {
            No aux = this.primeiro;
            No penultimo = aux.getProximo();
            while (aux.getProximo() != null){
                penultimo = aux;
                aux = aux.getProximo();
            }
            remover = aux;
            if (penultimo == null){
                remover = this.primeiro;
                this.primeiro = null;
            }
            else{
                remover = penultimo.getProximo();
                penultimo.setProximo(null);
            }
        }
        this.tamanho--;
        return remover;
    }

    // Método remover elemento
    public No remover_elemento(String elemento){
        No remover = null;
        if (this.primeiro == null){
            System.out.println("Lista está vazia");
        }
        else {
            if(elemento.equalsIgnoreCase(this.primeiro.getDado())){
                remover = this.primeiro;
                this.primeiro = remover.getProximo();
            }
            else {
                No aux = this.primeiro;
                while(aux.getProximo() != null && elemento.compareTo(aux.getProximo().getDado()) != 0){
                    aux = aux.getProximo();
                }
                if (aux.getProximo() != null){
                    remover = aux.getProximo();
                    aux.setProximo(remover.getProximo());
                    this.tamanho--;
                }
            }
        }
        return remover;
    }
    // Método inserir no início
    public void imprimirLista(){
        No aux =  this.primeiro;
        if(this.primeiro == null){
            System.err.println("Lista está vazia");
        }
        else{
            System.out.println("-===-=-==-=-=-=-=-===-=-=-=-=-=-=-==--=-=-=-");
            System.out.println("Lista:");
            while(aux != null){
                System.out.println(aux.getDado());
                aux = aux.getProximo();
            }
            System.out.println("\ntamanho:" + this.getTamanho());
            System.out.println("-===-=-==-=-=-=-=-===-=-=-=-=-=-=-==--=-=-=-");
        }
    }
    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
