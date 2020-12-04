package com.jonathan;

import java.util.Objects;

public class ListData {
    //Array list
    private String firsName;
    private String lastName;
    private int id;

    public ListData(String firsName, String lastName, int id) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListData listData = (ListData) o;
        return id == listData.id &&
                firsName.equals(listData.firsName) &&
                lastName.equals(listData.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName, id);
    }

    @Override
    public String toString() {
        return "ListData{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
