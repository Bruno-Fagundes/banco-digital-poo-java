public class ContaCorrente extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.print("=== Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
