public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor){
        this.saldo -=  valor;
    }

    public void depositar(double valor) {
        this.saldo +=  valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.print(String.format("\nAgencia: %d", this.agencia));
        System.out.print(String.format("\nNumero: %d", this.numero));
        System.out.print(String.format("\nSaldo: %.2f\n", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos Abstratos
    public abstract void imprimirExtrato();
}
