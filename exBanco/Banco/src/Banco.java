public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean Status;
    public void estadoatual(){
        System.out.println("___________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

 
    public void abrirconta( String t){
        this.setTipo(t);
        this.setStatus(true);

        if(t == "cc"){
            this.saldo = 50;
        }
        else if(tipo == "cp"){
            this.saldo =150;
        }
    }
    public void fecharconta(){
        setStatus(true);
        if(this.getSaldo()> 0){
            System.out.println("conta com dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("conta em debito");
        }
        else{
            this.setStatus(false);
            System.out.println("sua conta foi fechada");
        }
    }
    public void depositar(float v){
        if(this.Status == true){
            this.setSaldo(this.getSaldo() + v);// pegue o saldo atual e substitua pelo saldo mais o valor de v;
            System.out.println("deposito realizado");
        }
        else{
            System.out.println("impossivel depositar");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("saque realizado");
        }
            else{
            System.out.println("saldo insuficente");
        }
    }
      else{
       System.out.println("impossivel sacar");
    }
}
    public void pagarmensal(){
         int v = 0;
     if(this.tipo == "cc"){
        v = 12;
     }
     else if(this.tipo == "cp"){
        v = 20;
    } 
     if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
         }
         else{
            System.out.println("impossivel pagar");
        }
     }

    public  Banco(){
        this.saldo = 0;
        this.Status = false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st ){
        this.Status = st;
    }
    public boolean getStatus(){
        return Status;
    }
    
    
}