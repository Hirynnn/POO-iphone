import componentes.Calculadora;
import componentes.Musica;
import componentes.Telefone;
import componentes.Internet;

public class Iphone {

    public static void main(String[] args) {
        // testando a calculdora 
       Calculadora cl = new Calculadora ();
       cl.somar(3,5);
       cl.dividir(5, 4);
       cl.multiplicar(4,5);
       cl.elevar(15);
       
        System.out.println("-----------");
       // testando a musica
       Musica ms = new Musica();
       ms.escolherMusica("Best Friend ");
       ms.tocarMusica();
       ms.pausarMusica();
       
        System.out.println("--------");
       // testando a internet
       Internet it = new Internet();
       it.inserirLink("www.twitter/hirynnn");
       it.exibirLink();
       it.atualizarPagina();
       it.novaAba();
       
        System.out.println("--------");
       // testando o telefone 
       
       Telefone tl = new Telefone();
       tl.inserirNumero(40028922);
       tl.ligar();
       tl.atender();
       tl.correioVoz();
    }
}
