
public class MostradorDeContato
{
    Contato c;
    long numero;

    public MostradorDeContato(Contato c, long numero) {
        this.c = c;
        this.numero = numero;
    }

    public void mostre() {
        if (c == null) {
            System.out.println("\n\n*****************");
            System.out.println("Nao ha contato com telefone " + numero);
            System.out.println("*****************");
        }
        else {
            System.out.println("\n\n******************************");
            System.out.println("Dados do contato:");
            System.out.println(c.getNome());
            System.out.println(c.getTelefone());
            System.out.println(c.getEmail());
            System.out.println("*********************************");
        }

    }
}
