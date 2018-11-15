package com.kkaty.alexxweek1day3homeworkproject;

public class Animal {
    private String type = "mammal";
    public void growhair(){
        System.out.println("growing hair");
    }
    private String reproduction = "sexually";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }
}
