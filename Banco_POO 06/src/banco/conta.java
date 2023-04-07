package banco;

public class conta {
    public int numConta;
    protected String tipo;
    //cc ou cp
    private String dono;
    private float saldo;
    private boolean status;

    public conta(int nume){
       this.numConta = nume;
       this.saldo = 0;
       this.status = false;        
    }
    
    //GETTERS
    private int getNumConta() {
        return numConta;
    }

    private String getTipo() {
        return tipo;
    }

    private String getDono() {
        return dono;
    }

    private float getSaldo() {
        return saldo;
    }

    private boolean isStatus() {
        return status;
    }

    //SETTERS
    
    private void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
    
    
    //MÉTODOS!!!
    
    public void abrirConta(String pes,String cont){
        if(this.isStatus() == true){
                System.out.println("Essa conta já esta aberta!!");
        }else{
            if(cont == "CC"){
                this.status = true;
                this.tipo = "CC";
                this.setSaldo(this.getSaldo()+ 50);
                this.setDono(pes);

            }else if(cont == "CP"){
                this.status = true;
                this.tipo = "CP";
                this.setSaldo(this.getSaldo()+ 150);
                this.setDono(pes);
            }else{
                        System.out.println("ERRO NO TIPO!!");
                    }
        }
    }
    
    public void fecharConta(){
        
       if(this.saldo != 0){
           System.out.println("Conta não pode ser FECHADA! Existe um débito ou saldo nela");
       }else{
           this.status = false;
       }
        
    }
    
    public void depositar(float d){
        
        if(this.status == true){
            this.saldo += d;
        }else{
            System.out.println("Conta Fechada");
        }
    }
    
    public void sacar(float s){
        if(this.status == true){
            if(this.getSaldo() >= s){
                this.setSaldo((float) Math.floor((this.getSaldo() - s)* 100) / 100);
            }else{
                System.out.println("SAQUE INVÁLIDO! Saldo insuficiênte");
            }
        }else{
            System.out.println("SAQUE INVÁLIDO! Conta fechada!");
        }
        
        
    }
    
    public void pagarMensal(){
        float pagar; 
        if(this.isStatus() == true ){
            
                if (this.getTipo() == "CC"){
                    pagar = 12;
                    if(this.getSaldo() >= pagar){
                        this.setSaldo((float) Math.floor((this.getSaldo() - pagar)* 100) / 100);
                    }else{System.out.println("Pagamento Mensal inválido!! Saldo Insuficiênte");}
                } else if (this.getTipo() == "CP"){
                    pagar = 20;
                    if(this.getSaldo() >= pagar){
                        this.setSaldo((float) Math.floor((this.getSaldo() - pagar)* 100) / 100);
                    }else{System.out.println("Pagamento Mensal inválido!! Saldo Insuficiênte");}
                }
        }
        
        
    }
    
    public void status(){
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.isStatus());
    
    }
    
}
