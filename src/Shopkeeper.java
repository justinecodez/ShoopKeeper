import java.util.Scanner;

public class Shopkeeper {
    public static void main(String[] args) {
        //declare variables
        int choicesPrice[];
        //Call Display method all available products
        new Shopkeeper().displayProducts();

        //prompt to costumer
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your choice");
        int choice=input.nextInt();
        if (choice==1){
            
        }

        System.out.println(choice);
    }
    //Display all available products
    public void displayProducts(){
        System.out.println("\n" +
                "\n1) Milk 44,\n2) Honey 162,\n3) Eggs 357," +
                "\n4) Bread 41,\n5) Spinach 42,\n6) Towel 236," +
                "\n7) Soda 65,\nChoose Product by Number\n");
    }
}
