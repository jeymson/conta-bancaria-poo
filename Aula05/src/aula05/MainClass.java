
package aula05;

public class MainClass {

    public static void main(String[] args) {
        
        Conta c1 = new Conta("cp", "Jubileu","13584");
        Conta c2 = new Conta("cc", "Creusa","98586");
        
        System.out.println(c2.depositar(500));
        System.out.println(c2.sacar(100));
        System.out.println(c2.sacar(450));
        System.out.println(c2.fecharConta());
        
        //System.out.println(c1.depositar(300));
        //System.out.println(c2.extrato());
                
        
    }
    
}
