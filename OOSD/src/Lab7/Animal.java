package Lab7;

public class Animal {
    private String name;

    public Animal(String name){
        SetName(name);
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }
}
