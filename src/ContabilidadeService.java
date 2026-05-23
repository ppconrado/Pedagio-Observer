public class ContabilidadeService implements Observer {

    @Override
    public void atualizar(Passagem passagem) {
        System.out.println("[CONTABILIDADE] Receita registrada: R$ "
                + passagem.getValor());
    }
}
