import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(2);
        vetor.adicionar("pedro");
        vetor.adicionar("pedro");
        vetor.adicionar("pedro");

        Stack<String> pilha = new Stack<String>();
        pilha.push("1");
        pilha.push("1");
        pilha.push("10");
        System.out.println(pilha.pop());

        PilhaArray pilhaArray = new PilhaArray(5);
        pilhaArray.push(10);
        System.out.println(pilhaArray.pop());
        
        Queue<String> fila = new LinkedList<String>();
        fila.offer("1");
        fila.offer("2");
        //offer adicionar elemento no final da fila 

        fila.poll(); 
        //poll remover o primeiro elemento da fila 

        System.out.println(fila.peek());
        //peek vizualizar o primeiro elemento sem remover 
    }
}
