import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner str = new Scanner(System.in)) {
            String color;
            String breed;
            String size;
            DogObject dogObj = new DogObject();

            ArrayList<DogObject> dogList = new ArrayList<DogObject>();
            System.out.print("How many dogs do you have: ");
            int dogNumber = str.nextInt();

            System.out.println("IM A LITTLfasdfasSREITJEIS  TJEISTJO  STEOIJSETasfaesfOMETUMSO");

            for (int i=0;i<dogNumber;i++){
                System.out.print("What breed is your dog: ");
                breed = str.next();
                System.out.print("What color is your dog: ");
                color = str.next();
                System.out.print("What size is your dog: ");
                size = str.next();

                dogObj.setBreed(breed);
                dogObj.setColor(color);
                dogObj.setSize(size);

                dogList.add(dogObj);
                dogObj = new DogObject();
            }
            
            int j = 1;
            for(int i=0;i<dogList.size()+1;i++){
                System.out.println(j + ". " + dogList.get(i).toString() + ", Bark Sound: " + dogList.get(i).getBark() + " " + i);
                j++;
            }
        }
    }

}
