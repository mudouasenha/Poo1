
public class Agenda
{
    Contato[] contatos;
    int[] numeros;

    public Agenda(int n) {
        contatos = new Contato [n];
        numeros = new int [n];
    }

    public int retorneQuantidade() {
        int qtd = 0;
        for (Contato c : contatos)
            if (c != null)
                qtd++;

        return qtd;
    }

    public Contato pesquisePorTelefone(long telefone) {
        Contato c = null;
        int i = 0;

        while (c == null && i < contatos.length) 
            if (contatos[i] != null && contatos[i].getTelefone() == telefone)
                c = contatos[i];
            else
                i++;

        return c;
    }

    public Contato[] pesquisePorNome(String fragmentoDeNome) {
        Contato[] contatosComNome;
        Contato[] contatosTemp = new Contato[contatos.length];
        int qtd = 0;
        String fragmentoMaiusculas = fragmentoDeNome.toUpperCase();

        for (Contato c : contatos)
            if (c != null && contemNome(c.getNome(), fragmentoMaiusculas))
                contatosTemp[qtd++] = c;

        if (qtd == contatos.length)
            contatosComNome = contatosTemp;
        else {
            contatosComNome = new Contato [qtd];
            for (int i = 0; i < qtd; i++)
                contatosComNome[i] = contatosTemp[i];
        }

        return contatosComNome;
    }

    public Contato[] pesquiseTodos() {
        Contato[] osContatos;
        Contato[] osContatosTemp = new Contato [contatos.length];
        int qtd = 0;

        for (Contato c : contatos)
            if (c != null)
                osContatosTemp[qtd++] = c;

        if (qtd == contatos.length)
            osContatos = osContatosTemp;
        else {
            osContatos = new Contato[qtd];
            for (int i = 0; i < qtd; i++)
                osContatos[i] = osContatosTemp[i];
        }
        return osContatos;
    }

    public void cadastre(Contato novoContato) {
        int posicaoLivre = encontrePosicaoLivre();
        contatos[posicaoLivre] = novoContato;
    }

    private boolean contemNome(String nome, String fragmento) {
        return nome.toUpperCase().indexOf(fragmento) != -1;
    }

    private int encontrePosicaoLivre() {
        int posicao = -1;
        int i = 0;

        while (posicao == -1 && i < contatos.length)
            if (contatos[i] == null)
                posicao = i;
            else
                i++;

        if (posicao == -1) { // array esta cheio. Precisa aumentar.
            posicao = contatos.length;
            Contato[] novoArray = new Contato[contatos.length + 5];
            for (i = 0; i < contatos.length; i++)
                novoArray[i] = contatos[i];
            contatos = novoArray;
            
        }
        return posicao;
    }

}
