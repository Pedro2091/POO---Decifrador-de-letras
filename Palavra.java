public class Palavra {
    private String palavra;
    private int nLetras;

    Palavra(String palavra){
        this.palavra = palavra;
        this.nLetras = palavra.length();
    }

    @Override
    public String toString() {
        return this.palavra + ", " + this.nLetras;
    }

    public String getPalavra(){
        return this.palavra;
    }
    public void setPalavra(String palavra){
        this.palavra = palavra;
    }

    public int getNLetras(){
        return this.nLetras;
    }
    public void setnLetras(int nLetras){
        this.nLetras = nLetras;
    }
}
