import java.util.Scanner;
import java.util.List;

public class UI
{
    // Instance Variable
    Inventory playerInventory;

    // Initialization
    public UI(Inventory playerInventory)
    {
        this.playerInventory = playerInventory;

        mainMenu();
    }

    public void mainMenu()
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("----------- Main Menu -----------");
            System.out.println("1. Show Current Inventory");
            System.out.println("2. Add Accessory");
            System.out.println("3. Upgrade Accessory");
            System.out.println("4. Delete Accessory");
            System.out.println("5. Show Total Value");
            System.out.println("6. Exit");

            System.out.print(">>> ");
            int choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    accessoryListMenu();
                    break;
                case 2:
                    addAccessoryMenu();
                    break;
                case 3:
                    upgradeAccessoryMenu();
                    break;
                case 4:
                    deleteAccessoryMenu();
                    break;
                case 5:
                    totalValueMenu();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }

    public void accessoryListMenu()
    {
        System.out.println("1");
    }

    public void accessoryInfoMenu()
    {
        System.out.println("2");
    }

    public void addAccessoryMenu()
    {
        System.out.println("3");
    }

    public void upgradeAccessoryMenu()
    {
        System.out.println("4");
    }

    public void deleteAccessoryMenu()
    {
        System.out.println("5");
    }

    public void totalValueMenu()
    {
        System.out.println("6");
    }
}
