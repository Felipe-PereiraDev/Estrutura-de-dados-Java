package PilhaDinamica;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String elemento;
        do{
            menu();
            System.out.print("opção:");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite um elemento:");
                    elemento = scanner.next();
                    pilha.push(elemento);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    pilha.getTopo();
                    break;
                case 4:
                    pilha.imprimirPilha();
                    break;
                case 5:
                    pilha.tamanhoPilha();
                    break;
                case 6:
                    System.out.println("Fechando programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por Favor escolha uma opção válida");
            }
        }while(opcao != 6);
    }
    public static void menu(){
        System.out.println("+___________________________+");
        System.out.println(
                        "|\t1 - INSERIR ELEMENTO\t|\n" +
                        "|\t2 - REMOVER ELEMENTO\t|\n" +
                        "|\t3 - MOSTRAR TOPO\t\t|\n" +
                        "|\t4 - IMPRIMIR PILHA\t\t|\n" +
                        "|\t5 - ALTURA DA PILHA\t\t|\n" +
                                "|\t6 - FECHAR PROGRAMA\t\t|");
        System.out.println("+___________________________+");
    }
}