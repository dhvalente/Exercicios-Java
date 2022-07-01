package Lista_06.Locadora;

public class Principal {

    public static void main(String[] args) {

        Lista_06.Locadora.Repository.populaFitas();
        Repository.populaClientes();

        Comunicacao.Menu();

    }

}