
public class Gorilla extends Mamal{

    public void throwSomething(){
        System.out.println("Gorilla has thrown something");
        energyLevel-=5;
    }
    public void eatBananas(){
        System.out.println("Gorilla is eating a banana");
        energyLevel+=10;
    }
    public void climb(){
        System.out.println("Gorilla has climbed a tree");
        energyLevel-=10;
    }
}