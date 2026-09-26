public class Endereco {
    private String nome_rua;
    private int numero;

    public Endereco(String nome_rua, int numero) {
        this.nome_rua = nome_rua;
        this.numero = numero;
    }

    public String getNomeRua() {
        return this.nome_rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNomeRua(String nome_rua) {
        this.nome_rua = nome_rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        Endereco end = new Endereco("Rua das Flores", 123);
        System.out.println("Rua: " + end.getNomeRua() + ", Nº: " + end.getNumero());
    }
}
