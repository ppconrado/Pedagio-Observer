public class NotificacaoClienteService implements Observer {

    @Override
    public void atualizar(Passagem passagem) {
        System.out.println("[NOTIFICAÇÃO] Cliente da tag "
                + passagem.getCodigoTag()
                + " passou no pedágio. Valor: R$ "
                + passagem.getValor());
    }
}
