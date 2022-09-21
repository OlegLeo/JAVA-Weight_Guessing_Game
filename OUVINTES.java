public class OUVINTES {



    //ATRIBUTOS
    private int id;
    private String nome;
    private String localidade;

    private int idade;
    private int numJogos;
    private int numVezesJogosGanhos;
    private double ultimoPalpite;

    //CONSTRUTOR

    public OUVINTES(){
        id = 0;
        nome = " ";
        idade = 0;
        localidade = " ";
        numJogos = 0;
        numVezesJogosGanhos = 0;
        ultimoPalpite =  0;
    }

    public OUVINTES(int id, String nome,int idade, String localidade, int numJogos, int numVezesJogosGanhos,double ultimoPalpite) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.localidade = localidade;
        this.numJogos = numJogos;
        this.numVezesJogosGanhos = numVezesJogosGanhos;
        this.ultimoPalpite = ultimoPalpite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    public int getNumJogos() {
        return numJogos;
    }

    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }

    public int getNumVezesJogosGanhos() {
        return numVezesJogosGanhos;
    }

    public void setNumVezesJogosGanhos(int numVezesJogosGanhos) {
        this.numVezesJogosGanhos = numVezesJogosGanhos;
    }

    public double getUltimoPalpite() {
        return ultimoPalpite;
    }

    public void setUltimoPalpite(double ultimoPalpite) {
        this.ultimoPalpite = ultimoPalpite;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "\u001B[34mNome: "+nome+"\u001B[0m\u001B[32m\nNº de Jogos Ganhos: "+numVezesJogosGanhos+"\u001B[0m\n\u001B[33mNº de Jogos Participados: "+numJogos+"\u001B[0m";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
