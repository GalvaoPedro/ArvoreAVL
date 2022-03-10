import java.util.Scanner;
public class AVL {
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    ArvoreAVL arvore = new ArvoreAVL();
    String codigo;
    int resp;
    do {
        menu();
        resp = in.next().charAt(0);
        switch (resp) {
            case '1':
                System.out.println("digite o valor");
                resp = in.nextInt();
                arvore.inserir(resp);
                break;
            case '2':
                System.out.println("digite o valor");
                resp = in.nextInt();
                arvore.remover(resp);
                break;
            case '3':
                System.out.println("PRINTANDO EM PRE-ORDER");
                arvore.printPreOrder();
                break;
            case '4' :
                System.out.println("PRINTANDO POST-ORDER");
                arvore.printPostOrder();
                break;
            case '5':
                System.out.println("PRINTANDO IN-ORDER");
                arvore.printInOrder();
                break;
            
            case '0':
                System.out.println("Encerrando programa.");
                break;
                           
            default:
                System.err.println("Opção inválida");
                break;
        }
    } while (resp != '0');
}

public static void menu() {
    System.out.println("\nMENU: ");
    System.out.println("1 - inserir valor \n2 - remover valor \n3 - printar PRE-ORDER \n4- printar POST-ORDER \n5 - printar IN-ORDER\n6 - testaLLRaiz");
    System.out.println("Informe a opção desejada:");
}
}

