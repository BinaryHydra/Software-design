package lt.vu.mif.mape.facade.task;

public interface TaskFacade {

    boolean sendMessage(String text, Long sender, Long receiver);
}
