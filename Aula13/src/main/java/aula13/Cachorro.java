package aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Au! Au!");
    }
    
    public void reagir(String frase){
        if(frase == "Toma comida" || frase == "Cheguei"){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int h, int m){
        if(h<12){
            System.out.println("Abanar");
        }
        else if (h>=18){
            System.out.println("Ignorar");
        }
        else{
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso<10){
                System.out.println("Abanar");
            }
            else{
                System.out.println("Latir");
            }
        }
        else{
            if(peso<10){
                System.out.println("Rosnar");
            }
            else{
                System.out.println("Ignorar");
            }
        }
    }
}