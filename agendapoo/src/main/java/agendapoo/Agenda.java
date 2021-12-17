package agendapoo;

import java.util.ArrayList;

public class Agenda {
    ArrayList <Pessoa> Contatos = new ArrayList<>();

    
    public void inserirPessoa(Pessoa contato){
        if(contato.getValidar()==true){
            Contatos.add(contato);
            System.out.println("Contato adicionado.");
        }
        else{
            System.out.println("Nao foi possivel adicionar contato");
        }
    }
    public void removerPessoa(Pessoa contato){
        Contatos.remove(contato);
    }
    
    public void imprimirAgenda(){
        for(int i = 0; i < Contatos.size(); i++) {
            System.out.println(Contatos.get(i).getNome());
        }
    }
}
