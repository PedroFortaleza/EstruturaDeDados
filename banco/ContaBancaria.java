package banco;

public class ContaBancaria {
    private Double saldo; 

    public ContaBancaria(){
        this.saldo = 0.0; 
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo = saldo - valor;
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
