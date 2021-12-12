package pessoa;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Marina", 20, "F");
        p[1] = new Pessoa("Mario", 20, "M");
        
        l[0] = new Livro("Alice no pais das maravilhas", "Lewis Carroll", 110, p[0]);
        l[1] = new Livro("Rebbecca", "Zelda Fitzgerald", 200, p[1]);
        l[2] = new Livro("Diario de um banana", "Jeff Kinney", 120, p[1]);
        
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(50);
        System.out.println(l[0].detalhes());
    }
}
