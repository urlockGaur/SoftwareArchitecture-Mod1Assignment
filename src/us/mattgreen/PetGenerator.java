package us.mattgreen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetGenerator {

    //  1. and 2. ask user what animal to create, accept inputs
    private List<Pet> petList = new ArrayList<>();
    private Scanner keyboard = new Scanner(System.in);
    private String petType;
    private String petName;

    public void createPet() {

            System.out.print("Enter the type of pet you want to create: ");
            petType = keyboard.nextLine();

            System.out.print("Enter the pet's name: ");
            petName = keyboard.nextLine();

            //  3. Create an object of that type - contstructor

            try {
                Pet newPet = new Pet(petType) {
                };

                petList.add(newPet);
                System.out.println("Added a new " + petType + " to the list.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. " + e.getMessage());
            }
        }
    public void displayPetList()
    {
        System.out.println("Pet List: ");
        for (Pet pet : petList)
            {
                System.out.println("Type: " + petType + ", Name: " + petName);
            }
    }

}
