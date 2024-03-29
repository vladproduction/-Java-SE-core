package vladproduction.com.app03;

import vladproduction.com.app01.JavaDataTypesPrimitive;
public class Person {

    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Person(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public String toString() {
        return String.format("%s, %d", name, id);
    }
}
