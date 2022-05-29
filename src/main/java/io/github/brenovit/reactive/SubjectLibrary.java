package io.github.brenovit.reactive;

public interface SubjectLibrary {
    public void subscribe(Observer ob);

    public void unsubscribe(Observer ob);

    public void notifyObservers();
}
