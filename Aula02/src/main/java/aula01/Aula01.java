package aula01;


public class Aula01 {
    
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "azul";
        c1.carga = 89;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
    }
    
}
