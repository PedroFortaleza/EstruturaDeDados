public class Vetor {
    public String[] elementos; 
    public Integer tamanho; 

    public Vetor(int capacidade){
         this.elementos = new String[capacidade];
         this.tamanho = 0;
    }

    public boolean adicionar(String elemento){
        aumentarCapacidade();
        if(tamanho < elementos.length){ 
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
    }
    else{
        return false; 
    }
        
    }

    private void aumentarCapacidade(){
        if(tamanho == elementos.length) {
            String[] elementosNovos = new String[elementos.length * 2]; 
            for(int i = 0; i < elementos.length; i++){
                elementosNovos[i] = elementos[i] ;
             }
             elementos = elementosNovos;
        }

    }
}
