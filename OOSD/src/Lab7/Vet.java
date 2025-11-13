package Lab7;

public class Vet {
    private String name;

    public Vet(String name){
        SetName(name);
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }

    public void Vaccinate(Animal animal){
        
    }
}
