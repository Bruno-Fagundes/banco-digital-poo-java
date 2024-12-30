public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.print("=== Extrato da Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}
