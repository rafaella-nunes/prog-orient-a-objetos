package aula01;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        if (this.tampada==true){
            System.out.println("esta tampada");
        }
        else if (this.tampada == false){
        System.out.println("nao esta tampada");
    }
        
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro. A caneta esta tampada");
        }
        else{
            System.out.println("Rabisco feito.");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
