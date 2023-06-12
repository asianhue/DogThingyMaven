
public class DogObject {
    String breed;
    String color;
    String size;

    public DogObject(){
    }

    public DogObject(String breed, String color, String size){
        this.breed = breed;
        this.color = color;
        this.size = size;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getBreed(){
        return breed;
    }

    public String getColor(){
        return color;
    }

    public String getSize(){
        return size;
    }

    public String toString(){
        String toString = "Breed: " + breed + ", Color: " + color + ", Size: " + size;

        return toString;
    }

    public String getBark(){
        String bark;
        if(breed == "Chihuahua"){
            bark = "they scream";
        }else if(breed == "Labradoodle"){
            bark = "idk they bark like a labradoodle";
        }else if(breed == "Husky"){
            bark = "they whine";
        }else if (breed == "Golden Retriever"){
            bark = "loud";
        }else{
            bark = "idk they sound like dog";
        }

        return bark;
    }
}
