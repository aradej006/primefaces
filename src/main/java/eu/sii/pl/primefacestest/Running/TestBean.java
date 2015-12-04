package eu.sii.pl.primefacestest.Running;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@RequestScoped
@Named
public class TestBean implements Serializable{

    private String world;


    @PostConstruct
    public void sdas(){
        world = "World!!!!";
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
