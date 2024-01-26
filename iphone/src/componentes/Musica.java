package componentes;

public class Musica {

    String musica;

    public void escolherMusica(String ms) {
        musica = ms;
    }

    public void tocarMusica() {
        System.out.println("Tocando: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Música pausada!");
    }

}
