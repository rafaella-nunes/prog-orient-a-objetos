package empregado;

public class Principal {
    public static void main(String[] args) {
        Empresa solare = new Empresa("Solare", 896417638);
        Endereco ruanend = new Endereco("Rua do ABC", "Centro", 5790087, "Alagoinha", 7);
        Endereco lavend = new Endereco("Rua do Sol", "Centro", 6533004, "Maracanau", 9);
        Empregado ruan = new Empregado(1080f, "Assistente", ruanend, "Ruan", 27, "M", 8754);
        Recepcionista lav = new Recepcionista(lavend, "Lavinia", 20, "F", 6578);
        Registrar empregados = new Registrar();
        Departamentos rh = new Departamentos("Recursos Humanos", "ADM");
        Departamentos adm = new Departamentos("Administrativo", "Financeiro");
        solare.novoDep(rh);
        solare.novoDep(adm);
        
        
        empregados.novoEmpregado(ruan);
        empregados.novoEmpregado(lav);
        empregados.imprimirEmpregados();
        System.out.println("----------------");
        rh.adicionarEmpregado(lav);
        adm.adicionarEmpregado(ruan);
        adm.getEmpregados();
        System.out.println("-----------------");
        rh.getEmpregados();
        System.out.println("-----------------");
        solare.transfEmpregado(ruan, adm, rh);
        System.out.println("-----------------");
        rh.getEmpregados();
        System.out.println("-----------------");
        solare.transfEmpregado(lav, adm, rh);
        System.out.println("------------------");
        
    }
    
}
