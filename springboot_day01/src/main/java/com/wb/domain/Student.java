package com.wb.domain;

public class Student {
    private int id;
    private String name;
    private String strno;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", strno='" + strno + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrno() {
        return strno;
    }

    public void setStrno(String strno) {
        this.strno = strno;
    }
}
