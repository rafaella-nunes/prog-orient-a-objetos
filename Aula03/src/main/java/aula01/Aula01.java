package aula01;


public class Aula01 {
    
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 75;
        c1.modelo = "BIC";
        c1.ponta = 0.7f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
