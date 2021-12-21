package pilha;

public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilhastr = new Pilha<String>();
        pilhastr.empilhar("PRIMEIRO");
        pilhastr.empilhar("SEGUNDO");
        pilhastr.empilhar("TERCEIRO");
        
        Pilha<Integer> pilhaint = new Pilha<Integer>();
        pilhaint.empilhar(1);
        pilhaint.empilhar(2);
        pilhaint.empilhar(3);
        
        System.out.println("--------");
        System.out.println(pilhastr.desempilhar());
        System.out.println(pilhastr.desempilhar());
        System.out.println(pilhastr.desempilhar());
        
        System.out.println("---------");
        System.out.println(pilhaint.desempilhar());
        System.out.println(pilhaint.desempilhar());
        System.out.println(pilhaint.desempilhar());
    }
}
