package componentes;

public class Telefone {

    int numero;

    public void inserirNumero(int num) {
        numero = num;
    }

    public void ligar() {
        System.out.println("Ligando! ");
        System.out.println("tururu turururur");
        if (numero % 2 == 0) {
            System.out.println("Atendeu! ");
        } else {
            System.out.println("Não atendeu!");
        }
    }

    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    public void correioVoz() {
        System.out.println("Ouvindo o correio de voz");
    }
}

