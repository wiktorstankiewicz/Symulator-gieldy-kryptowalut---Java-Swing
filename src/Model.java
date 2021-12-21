import java.util.ArrayList;

public class Model implements Observable{
    private final ArrayList<Observer> observerArrayList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observerArrayList){
            o.update();
        }
    }
}
