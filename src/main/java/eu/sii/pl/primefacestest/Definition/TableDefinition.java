package eu.sii.pl.primefacestest.Definition;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;

/**
 * Created by crozman on 2015-12-04.
 */

@RequestScoped
@Named
public class TableDefinition {
    private String name;
    private String startupForm;
    private String startupGroup;
    private LocalDate creationDate;
    private LocalDate datefrom;
    private LocalDate dateTo;

    private String changeStatus;
    private String showInstances;
    private String createNewTemplate;
    private String archive;

    public TableDefinition() {
    }

    public TableDefinition(String name, String startupForm, String startupGroup, LocalDate creationDate, LocalDate datefrom, LocalDate dateTo, String changeStatus, String showInstances, String createNewTemplate, String archive) {
        this.name = name;
        this.startupForm = startupForm;
        this.startupGroup = startupGroup;
        this.creationDate = creationDate;
        this.datefrom = datefrom;
        this.dateTo = dateTo;
        this.changeStatus = changeStatus;
        this.showInstances = showInstances;
        this.createNewTemplate = createNewTemplate;
        this.archive = archive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartupForm() {
        return startupForm;
    }

    public void setStartupForm(String startupForm) {
        this.startupForm = startupForm;
    }

    public String getStartupGroup() {
        return startupGroup;
    }

    public void setStartupGroup(String startupGroup) {
        this.startupGroup = startupGroup;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(LocalDate datefrom) {
        this.datefrom = datefrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getShowInstances() {
        return showInstances;
    }

    public void setShowInstances(String showInstances) {
        this.showInstances = showInstances;
    }

    public String getCreateNewTemplate() {
        return createNewTemplate;
    }

    public void setCreateNewTemplate(String createNewTemplate) {
        this.createNewTemplate = createNewTemplate;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "TableDefinition{" +
                "name='" + name + '\'' +
                ", startupForm='" + startupForm + '\'' +
                ", startupGroup='" + startupGroup + '\'' +
                ", creationDate=" + creationDate +
                ", datefrom=" + datefrom +
                ", dateTo=" + dateTo +
                ", changeStatus='" + changeStatus + '\'' +
                ", showInstances='" + showInstances + '\'' +
                ", createNewTemplate='" + createNewTemplate + '\'' +
                ", archive='" + archive + '\'' +
                '}';
    }
}
