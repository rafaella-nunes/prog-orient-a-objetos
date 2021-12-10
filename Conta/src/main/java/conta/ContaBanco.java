package conta;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: "+ this.getStatus());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if(tipo == "cc"){
            setSaldo(50);
    }
        else if(tipo == "cp"){
            setSaldo(150);
        }
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro! Realize saque primeiro.");
        }
        else if(saldo < 0){
            System.out.println("Conta em debito! Realize o pagamento primeiro.");
        }
        else{
            setStatus(false);
        }
        
    }
    public void depositar(float deposito){
        if(status == true){
            setSaldo(getSaldo() + deposito);
        }
        else{
            System.out.println("Conta Fechada!");
        }
    }
    public void sacar(float quantia){
        if(status == true){
            if(saldo >= quantia){
                setSaldo(getSaldo()- quantia);
            }
            else{
                System.out.println("Voce nao possui dinheiro suficiente a ser sacado.");
            }
        }
        else{
            System.out.println("Conta fechada.");
        }
    }
    public void pagarMensal(){
        int mensalidade = 0;
        if(tipo == "cc"){
            mensalidade = 12;
        }
        else if(tipo == "cp"){
            mensalidade = 20;
        }
        
        if(status == true){
            if(saldo > mensalidade){
                saldo = saldo - mensalidade;
            }
            else{
                System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Conta fechada.");
        }
    }
    
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
