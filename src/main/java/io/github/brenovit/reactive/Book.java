package io.github.brenovit.reactive;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book implements SubjectLibrary{

    private String name;
    private boolean inStock;
    private List<Observer> obs = new ArrayList<Observer>();

    /**
     * @param inStock the inStock to set
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed");
        notifyObservers();
    }

    @Override
    public void subscribe(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyObservers() {
        System.out.println(this.toString());
        obs.forEach(o -> o.update(this.inStock));
    }
}
