import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String texto = "You shall not pass";

        String[] palavras = texto.split(" ");

        ArrayList<Palavra> palavraLista = new ArrayList<>();

        for(int i=palavras.length-1; i>=0; i--){
            palavraLista.add(new Palavra(palavras[i]));
        }

        for (Palavra palavra : palavraLista) {
            System.out.println(palavra);
        }
    }
}
