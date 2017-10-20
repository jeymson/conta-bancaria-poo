package aula05;

/**Que coisas eu tenho? --> Atributos
 * Que coisas eu faço? --> Métodos
 * Como estou agora? --> Estado
 *
 * @author Jeymson
 */
public class Conta {

    private float saldo;
    private String tipoConta;
    private String cliente;
    private boolean status;
    public String numConta;
    
      
    
    public Conta(String tipoConta, String cliente, String numConta) {
        this.status = false;
        this.saldo=0;
        this.tipoConta = tipoConta;
        this.cliente = cliente;
        this.abrirConta(tipoConta, numConta);
    }

   private void abrirConta(String tipoConta, String numConta){
       if(tipoConta.equalsIgnoreCase("cp") || this.tipoConta.equalsIgnoreCase("cc")){
           if(tipoConta.equals("cc")){
               this.setSaldo(50);
           }else{
               this.setSaldo(150);
           }
           this.setNumConta(numConta);
           this.setTipoConta(tipoConta);
           this.setStatus(true);
       }
   }
   
   public String fecharConta(){
       String msg;
       if(this.getSaldo()==0){
           msg = "Conta encerrada com sucesso.";
       }else{
           msg = "Não foi possível encerrar sua conta.\nVocê possui saldo de R$"+this.getSaldo();
       }
       this.setStatus(false);
       return msg;
       
   }
    public String sacar(float valor){
        String msg;
        if ((this.saldo - valor)>=0){
                this.saldo-= valor;
                msg = "Saque no valor de R$"+valor+" permitido.\nSeu novo saldo é: R$"+this.getSaldo();
        }else{
            msg = "Você não possui saldo suficiente para efetuar esta operação: R$"+this.getSaldo();
        }   
        return msg;
    }
    
    public String depositar(float valor){
        String msg;
        if(isStatus()){
            this.saldo+=valor;
            msg = "O depósito de R$"+valor+" foi efetuado com sucesso.\nSeu novo saldo é R$"+this.getSaldo();
        }else{
            msg = "Conta inativa!";
        }    
        return msg;
    }
    
    public void pagarMensal(){
        if(tipoConta.equalsIgnoreCase("cp") || this.tipoConta.equalsIgnoreCase("cc")){
           if(tipoConta.equals("cc")){
               this.setSaldo(this.getSaldo()-50);
           }else{
               this.setSaldo(this.getSaldo()-20);
           }
           this.setTipoConta(tipoConta);
           this.setStatus(true);
       }
    }
    
    public String extrato(){
        String extrato="=====================\nCliente: "+this.cliente+"\n"
                + "Tipo: "+this.tipoConta+" - "+this.getNumConta()+"\n"
                + "Saldo: "+this.getSaldo()+"\n"
                + "=====================";
        return extrato;    
    }

//GETTERS AND SETTERS    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
     public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    
}
