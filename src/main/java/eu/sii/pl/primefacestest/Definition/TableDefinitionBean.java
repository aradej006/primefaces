package eu.sii.pl.primefacestest.Definition;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class TableDefinitionBean implements Serializable{

    private List<TableDefinition> tablesDefinition;

    @PostConstruct
    public void init(){

        tablesDefinition = create();
    }

    private List<TableDefinition> create() {
        int size = 20;
    List<TableDefinition> list = new ArrayList<TableDefinition>();
    for (int i = 0;i<size; i++){
        list.add(new TableDefinition());
    }

        return null;
    }


}
