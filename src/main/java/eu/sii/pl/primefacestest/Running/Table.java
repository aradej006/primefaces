package eu.sii.pl.primefacestest.Running;


import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;
import java.util.Date;


@RequestScoped
@Named
public class Table {

    private Long id;
    private boolean process;
    private boolean customer;
    private int creationDate;
    private String status;
    private String taskPreview;
    private String showInstruction;


    public Table() {
    }

    public Table(Long id, boolean process, boolean customer, int creationDate, String status, String taskPreview, String showInstruction) {
        this.id = id;
        this.process = process;
        this.customer = customer;
        this.creationDate = creationDate;
        this.status = status;
        this.taskPreview = taskPreview;
        this.showInstruction = showInstruction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getProcess() {
        return process;
    }

    public void setProcess(boolean process) {
        this.process = process;
    }

    public boolean getCustomer() {
        return customer;
    }

    public void setCustomer(boolean customer) {
        this.customer = customer;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskPreview() {
        return taskPreview;
    }

    public void setTaskPreview(String taskPreview) {
        this.taskPreview = taskPreview;
    }

    public String getShowInstruction() {
        return showInstruction;
    }

    public void setShowInstruction(String showInstruction) {
        this.showInstruction = showInstruction;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", process='" + process + '\'' +
                ", customer='" + customer + '\'' +
                ", creationDate=" + creationDate +
                ", satus='" + status + '\'' +
                ", taskPreview='" + taskPreview + '\'' +
                ", showInstruction='" + showInstruction + '\'' +
                '}';
    }
}
