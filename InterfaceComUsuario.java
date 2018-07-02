public class InterfaceComUsuario
{
    Agenda a;
    java.util.Scanner leitor;

    public InterfaceComUsuario (Agenda a) {
        this.a = a;
        leitor = new java.util.Scanner(System.in);
        leitor.useDelimiter("\n");
    }

    public void interaja() {
        System.out.println(" --------------------");
        System.out.println("| Iniciando execuçao |");
        System.out.println(" --------------------");
        Contato c;
        MostradorDeContato mc;
        a.cadastre(new Contato("Fulano de Tal", 30251010, "fulano@gmail.com"));

        c = a.pesquisePorTelefone(30251010);
        mc = new MostradorDeContato(c, 30251010);
        mc.mostre();
        c = a.pesquisePorTelefone(9999);
        mc = new MostradorDeContato(c, 9999);
        mc.mostre();

        System.out.println("Fim de execuçao");
    }

    public void cadastreContato() {
        LeitorDeContato l = new LeitorDeContato(leitor, a);
        Contato novoContato;

        novoContato = l.leia();
        if (novoContato != null) {
            a.cadastre(novoContato);
            System.out.println("Cadastro feito!");
        } else
            System.out.println("Cadastro cancelado!!");
    }
}
