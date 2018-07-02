public class LeitorDeContato
{
    java.util.Scanner leitor;
    Agenda agenda;

    public LeitorDeContato(java.util.Scanner leitor, Agenda a) {
        this.leitor = leitor;
        agenda = a;
    }

    public Contato leia() {
        String nome;
        long telefone;
        String email;
        Contato c = null;

        telefone = leiaTelefone();

        if (telefone != 0) {
            nome = leiaNome();
            System.out.println("Email do contato : ");
            email = leitor.next();
            c = new Contato(nome, telefone, email);
        }

        return c;
    }

    private long leiaTelefone() {
        long numero;

        System.out.print("Numero do contato : ");
        numero = leitor.nextLong();

        if (agenda.pesquisePorTelefone(numero) != null)
            numero = 0;

        return numero;
    }

    
    
    
    private String leiaNome() {
        String nome = "";

        while (nome.length() < 5) {
            System.out.print("Nome do contato : ");
            nome = leitor.next();
            if (nome.length() < 5) 
                System.out.println("Atencao: nome tem que ter pelo menos 5 letras");
        }
        return nome;
    }

}
