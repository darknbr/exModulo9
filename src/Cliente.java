public class Cliente {
    private String nome;
    private String sobrenome;
    private int compras;

    public Cliente(String nome, String sobrenome, int compras) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getCompras() {
        return compras;
    }

    public int setCompras(int compras) {
        return this.compras = compras;
    }

    public String setSobrenomeNome(String sobrenome) {
        return this.sobrenome = sobrenome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }
    public String toString() {
        return nome + " " + sobrenome + " " + compras;
    }
}
