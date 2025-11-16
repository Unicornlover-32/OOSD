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
        System.out.println(GetName() + " is vaccinating ");
        System.out.println();
        
        if (animal instanceof Dog) {
            System.out.println("Dog, " + animal.GetName() + " has been vaccinated.");
            System.out.println();
        }
        else if (animal instanceof Cat) {
            System.out.println("Cat, " + animal.GetName() + " has been vaccinated.");
            System.out.println();
        }
    }
}
