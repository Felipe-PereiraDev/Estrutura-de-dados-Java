package PilhaDinamica;

public class Pilha {
    private No topo;
    private int tamanho;

    public Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }

    // Método para empilhar
    public void push(String novo_valor){
        No novo_no = new No(novo_valor);
        if (this.topo == null){ // Se a pilha estiver vazia o topo recebe o novo_no
            this.topo = novo_no;
        }
        else{
            // o próximo do novo_no aponta para o topo
            novo_no.setProximo(this.topo);
            // o topo agora aponta para o novo_no
            this.topo = novo_no;
        }
        System.out.println("Elemento \" "+ novo_no.getValor() + " \" adicionado com sucesso");
        this.tamanho++;
    }

    // Método para desempilhar
    public No pop(){
        No no_removido = null;
        if(this.topo == null){ // Verifica se a pilha está vazia
            System.out.println("Lista vazia");
        }
        else {
            // o no_removido aponta para o topo
            no_removido = this.topo;
            System.out.println("Elemento \" "+ no_removido.getValor() + " \" removido");
            // agora o topo aponta para o próximo do nó removido
            this.topo = no_removido.getProximo(); // ou this.topo = this.topo.getPróximo

            /* O topo foi desencadeado da pilha e o novo topo passou a ser o topo.getProximo */
            this.tamanho--;
        }
        return no_removido;
    }

    // Imprime o tamanho(altura) da Pilha
    public void tamanhoPilha(){
        System.out.println("Tamanho da pilha: " +this.tamanho);
    }

    // Método para imprimir todos os elementos da Pilha
    public void imprimirPilha(){
        No aux = this.topo;
        System.out.println("Pilha:");
        System.out.println("-=-=-=-==-=-=-=-==-=-==-=-=-=-=-=-=-=-=");
        if (this.topo == null) {
            System.out.println("Pilha vazia");
        }
        else{
            // Percorre a pilha enquanto houver elementos
            while (aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
        System.out.println("-=-=-=-==-=-=-=-==-=-==-=-=-=-=-=-=-=-=");
    }

    // Mostra o topo da pilha
    public void getTopo() {
        if (topo == null) {
            System.out.println("Pilha vazia");
        }
        else {
            System.out.println("Topo: "+topo.getValor());
        }
    }
}
