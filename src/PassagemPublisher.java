import java.util.ArrayList;
import java.util.List;

public class PassagemPublisher {

    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer obs) {
        observers.add(obs);
    }

    public void removerObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notificar(Passagem passagem) {
        for (Observer obs : observers) {
            obs.atualizar(passagem);
        }
    }

    // Simula o registro de passagem
    public void registrarPassagem(Passagem passagem) {
        System.out.println("Passagem registrada: " + passagem.getCodigoTag());
        notificar(passagem);
    }
}
