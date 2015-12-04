package eu.sii.pl.primefacestest.Running;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Named
@ApplicationScoped
public class TableBean implements Serializable {

    private List<Table> tables;
    private List<Table> filteresTable;

    private List<String> tablesStatus;


    private Random random;

    @PostConstruct
    public void init() {
        random = new Random();
        tables = create();
    }


    private List<Table> create() {
        int size = 10;
        List<Table> list = new ArrayList<Table>();
        for (int i = 0; i < size; i++) {
            list.add(new Table(getRandomID(), getRandomProcess(), getRandomCustomers(), getRandomCreateDate(), getRandomStatus(), getRandomTaskPreview(), getRandomShowInstruction()));
        }
        return list;
    }


    public boolean filterByStatus(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        if (filterText == null || filterText.equals("")) {
            return true;
        }

        if (value == null) {
            return false;
        }
        return ((Comparable) value).compareTo(String.valueOf(filterText)) > 0;
    }

    private int getRandomCreateDate() {
        return (int) (Math.random() * 10 + 2010);
    }

    public List<String> getTablesStatus() {
        tablesStatus = new ArrayList<String>();
        for (int i = 0; i < tables.size(); i++) {
            if (!tablesStatus.contains(tables.get(i).getStatus()))
                tablesStatus.add(tables.get(i).getStatus());
        }
        return tablesStatus;
    }

    private String getRandomShowInstruction() {
        return "lista";
    }

    private String getRandomTaskPreview() {
        return "www.google.pl";
    }

    private String getRandomStatus() {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            return "started";
        } else {
            return "complited";
        }
    }


    private boolean getRandomCustomers() {
        return (Math.random() > 0.5) ? true: false;
    }

    private boolean getRandomProcess() {
        return (Math.random() > 0.5) ? true: false;
    }

    private Long getRandomID() {
        return Math.abs(random.nextLong() % 1000);
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public List<Table> getFilteresTable() {
        return filteresTable;
    }

    public void setFilteresTable(List<Table> filteresTable) {
        this.filteresTable = filteresTable;
    }

    @Override
    public String toString() {
        return "TableBean{" +
                "random=" + random +
                ", tables=" + tables +
                '}';
    }


}
