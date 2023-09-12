public class App {
    public static void main(String[] args) throws Exception {
        Banco p1 = new Banco();
        p1.setNumConta(90);
        p1.setDono("joao");
        p1.abrirconta("cc");
        
        
        Banco p2 = new Banco();
        p2.setNumConta(81);
        p2.setDono("creuza");
        p2.abrirconta("cp");

        p1.depositar(500);
        p2.depositar(100);

        p2.sacar(10);

        p1.sacar(550);
        p1.fecharconta();
        
        p1.estadoatual();
        p2.estadoatual();
    }
}
