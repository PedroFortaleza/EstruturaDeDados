import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class TestePerformaceListas {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        for(int i = 0; i < 1_000_000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        long inicioArray = System.currentTimeMillis();
        for(int i = 0; i < 1_000; i++){
            arrayList.get(i * 100);
        }
        long fimArray = System.currentTimeMillis();

        long inicioLinked = System.currentTimeMillis();
         for(int i = 0; i < 1_000; i++){
            linkedList.get(i * 100);
        }
        long fimLinked = System.currentTimeMillis();

        System.out.println("ArrayList - tempo de acesso: " + (fimArray - inicioArray) + " ms");

        System.out.println("LinkedList - tempo de acesso: " + (fimLinked - inicioLinked ) + " ms");
    }
}
