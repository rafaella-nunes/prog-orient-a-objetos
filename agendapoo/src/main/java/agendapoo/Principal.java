package agendapoo;

public class Principal {
    public static void main(String[] args) {
        Pessoa lav = new Pessoa("Lavinia", 98557889, "lav123@gmail.com", 11111);
        Pessoa mateus = new Pessoa("Mateus", 96548752, "mateus123@hotmail.com", 22222);
        Pessoa arthur = new Pessoa("Arthur", 76349085, "arthur@live.com", 33333);
        Agenda listacont = new Agenda();
        
        mateus.validarMatricula(22222);
        lav.validarMatricula(11111);
        arthur.validarMatricula(22222);
        listacont.inserirPessoa(lav);
        listacont.inserirPessoa(mateus);
        listacont.inserirPessoa(arthur);
        listacont.imprimirAgenda();
        
    }
}
