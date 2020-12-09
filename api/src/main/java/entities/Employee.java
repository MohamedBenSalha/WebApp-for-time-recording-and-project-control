package entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * This class represents a worker in the itestra society, which is used to add
 * and remove employees from the database and edit them.
 * <p>
 * The database is accessed via OR Mapper
 */

@DatabaseTable(tableName = "employees")
public class Employee {

    @NotNull
    @DatabaseField(id = true)
    private int employeeID;

    @Size(min = 1, max = 40)
    @NotNull
    @DatabaseField(canBeNull = false)
    private String name;

    @NotNull
    @Size(min = 1, max = 40)
    @DatabaseField(canBeNull = false)
    private String domicile;

    @DatabaseField(canBeNull = true)
    private String competences;

    @DatabaseField(canBeNull = true)
    private String projectIDs;


    public Employee() {}

    public Employee(int id, String name, String domicile, String competences, String projectIDs) {
        this.employeeID = id;
        this.name = name;
        this.domicile = domicile;
        this.projectIDs = projectIDs;
        this.competences = competences.toUpperCase();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetences() {
        return competences;
    }

    public void addCompetence(String competence) {
        if (!this.competences.equals("")) {
            this.competences += "-" + competence.toUpperCase();
        } else {
            this.competences = competence.toUpperCase();
        }

    }

    public String getProjectIDs() {
        return projectIDs;
    }

    public void addProject(Integer projectID) {
        this.projectIDs += "-" + projectID;
    }

    /**
     * a competence will be removed from the list of competences of the employee.
     * If this competence the first saved competence and the employee has other
     * competences, then both the competence and the delimiter symbol after it will be removed.
     * if the employee has many competences then both the competence and the delimiter
     * symbol before it will be removed, else the employee has only this competence and
     * after removing it he will have no qualities more
     *
     * @param competenceToRemove competence to be removed from the list
     *                           of competences of the employee
     */
    public void removeCompetence(String competenceToRemove) {
        competenceToRemove = competenceToRemove.toUpperCase();
        if (!this.competences.contains(competenceToRemove)) {
            System.out.println("This employee does not have this competence");
        }

        if (this.competences.contains(competenceToRemove + "-")) {
            this.competences =  this.competences.replace(competenceToRemove + "-", "");
        } else if (this.competences.contains("-" + competenceToRemove)) {
            this.competences = this.competences.replace("-" + competenceToRemove, "");
        } else {
            this.competences = "";
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", domicile='" + domicile + '\'' +
                ", competences='" + competences + '\'' +
                ", projectIDs='" + projectIDs + '\'' +
                '}' + "\n";
    }
}
