public class Programa
{
    public static void main(String[] args) {
        Agenda a = new Agenda(5);
        InterfaceComUsuario iu = new InterfaceComUsuario(a);
        
        iu.cadastreContato();
    }
}
