package pilha;

import java.util.ArrayList;

public class Pilha<type> {
    private ArrayList<type> pilha;

    public Pilha() {
        this.pilha = new ArrayList<type>();
    }
    
    
    public void empilhar(type item){
        this.pilha.add(item);
    }
    
    public type desempilhar(){
        return this.pilha.remove(this.pilha.size() - 1);
    }
    
    public boolean estaVazia(){
        if(this.pilha.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
