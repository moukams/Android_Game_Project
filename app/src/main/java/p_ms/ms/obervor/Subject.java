package p_ms.ms.obervor;

public interface Subject {

    void addObserver(Observer observer);
    void notifyObservers(int score);

}
