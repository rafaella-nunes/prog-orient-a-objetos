package pessoa;

public class Principal {
    public static void main(String[] args) {
        Professor lav = new Professor();
        
        lav.setNome("Lavinia");
        lav.setIdade(20);
        lav.setSexo("F");
        lav.setEspecialidade("Geografia");
        lav.setSalario(700.0f);
        System.out.println(lav.toString());
    }
}
