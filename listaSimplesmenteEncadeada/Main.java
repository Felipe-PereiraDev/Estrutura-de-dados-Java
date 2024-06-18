import listaEncadeada.Lista;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        String valor;
        int opcao;
        do{
            menu();
            System.out.print("opção:");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Elemento que deseja adicionar:");
                    valor = scanner.next();
                    lista.inserir_no_inicio(valor);
                    break;
                case 2:
                    System.out.println("Elemento que deseja adicionar:");
                    valor = scanner.next();
                    lista.inserir_no_fim(valor);
                    break;
                case 3:
                    System.out.println("Elemento que deseja adicionar:");
                    valor = scanner.next();
                    lista.inserir_ordenado(valor);
                    break;
                case 4:
                    lista.remover_inicio();
                    break;
                case 5:
                    lista.remover_fim();
                    break;
                case 6:
                    System.out.println("Elemento que deseja excluir:");
                    valor = scanner.next();
                    lista.remover_elemento(valor);
                    break;
                case 7:
                    lista.imprimirLista();
                    break;
                case 8:
                    System.out.println("encerrando programa");
                    break;
                default:
                    System.err.println("Opção inválida, tente outra opção!");
                    break;
            }
        }while(opcao != 8);
        scanner.close();
    }
    public static void menu(){
        System.out.println("+___________________________+");
        System.out.println(
                "|\t1 - INSERIR NO INICIO\t|\n" +
                "|\t2 - INSERIR NO FIM\t\t|\n" +
                "|\t3 - INSERIR ORDENADO\t|\n" +
                "|\t4 - REMOVER NO INICIO\t|\n" +
                "|\t5 - REMOVER NO FIM\t\t|\n" +
                "|\t6 - REMOVER ELEMENTO\t|\n" +
                "|\t7 - IMPRIMIR LISTA\t\t|\n" +
                "|\t8 - FECHAR PROGRAMA\t\t|");
        System.out.println("+___________________________+");
    }
}