package com.Ox08.samples.migration.step1.crudapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
/**
 * The 'user' entity, converted  from POJO in original version.
 * Note on @Table annotation, its required to specify table name because keyword 'user' is prohibited in
 * some DBMS
 *
 * Also, JPA entity should be serializable.
 */
@Entity
@Table(name = "s_user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(min=2,max=10)
    private String firstName;
    @Size(min=2,max=20)
    private String lastName;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
