package aula01;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        if (this.tampada==true){
            System.out.println("esta tampada");
        }
        else if (this.tampada == false){
        System.out.println("nao esta tampada");
    }
        
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro. A caneta esta tampada");
        }
        else{
            System.out.println("Rabisco feito.");
        }
        
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
