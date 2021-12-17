package empregado;

public class Principal {
    public static void main(String[] args) {
        Endereco ruanend = new Endereco("Rua do ABC", "Centro", 5790087, "Alagoinha", 7);
        Endereco lavend = new Endereco("Rua do Sol", "Centro", 6533004, "Maracanau", 9);
        Empregado ruan = new Empregado(1080f, "Assistente", ruanend, "Ruan", 27, "M", 8754);
        Recepcionista lav = new Recepcionista(lavend, "Lavinia", 20, "F", 6578);
        Registrar empregados = new Registrar();
        
        empregados.novoEmpregado(ruan);
        empregados.novoEmpregado(lav);
        empregados.imprimirEmpregados();
        
        empregados.demitirEmpregado(ruan);
        empregados.imprimirEmpregados();
    }
    
}
