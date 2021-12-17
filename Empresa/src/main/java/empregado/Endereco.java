package empregado;

public class Endereco {
    private String rua;
    private String bairro;
    private int cep;
    private String cidade;
    private int numero;
    private String complemento;

    public Endereco(String rua, String bairro, int cep, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
    }
    
    

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public void mostrarEnd(){
        System.out.println("Rua: " + this.getRua() + ", bairro: " + this.getBairro() 
        + ", numero: " + this.getNumero() + ", complemento: " + this.getComplemento());
    }
    
}
