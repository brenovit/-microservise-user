package io.github.brenovit.reactive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EndUser implements Observer {

    private String name;

    public EndUser(String name, SubjectLibrary subjectLibrary) {
        this.name = name;
        subjectLibrary.subscribe(this);
    }

    @Override
    public void update(boolean avail) {
        System.out.println("Hello " + name + " book availability changed to " + avail);

    }

}
