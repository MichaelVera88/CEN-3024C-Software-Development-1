import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Handler
{
    public static void main(String[] args)
    {
        List<Accessory> accessoryList = new ArrayList<>();
        List<Accessory> accessories = loadData("accessories.txt");

        Inventory playerInventory = new Inventory(accessoryList, accessories);
        playerInventory.getAccessoryList();
    }

    public static List<Accessory> loadData(String path)
    {
        List<Accessory> accessories = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String stringID;
            while ((stringID = br.readLine()) != null)
            {
                if (stringID.trim().isEmpty())
                {
                    continue;
                }

                String name = br.readLine();
                String stringStatNames = br.readLine();
                String stringStatVals = br.readLine();
                String rarity = br.readLine();
                String description = br.readLine();
                String requirements = br.readLine();
                String stringUpgrade = br.readLine();
                String source = br.readLine();
                String stringMp = br.readLine();
                String stringPrice = br.readLine();

                int ID = Integer.parseInt(stringID);
                int upgrade =  Integer.parseInt(stringUpgrade);
                int mp = Integer.parseInt(stringMp);
                int price = Integer.parseInt(stringPrice);

                String[] statNames = stringStatNames.split(",");
                String[] arrayStatVals = stringStatVals.split(",");
                int[] statVals = new int[arrayStatVals.length];
                for (int i = 0; i < arrayStatVals.length; i++)
                {
                    statVals[i] = Integer.parseInt(arrayStatVals[i].trim());
                }

                accessories.add(new Accessory(ID, name, rarity, statNames, statVals, description, requirements, upgrade, source, mp, price));
            }
        } catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return accessories;
    }
}
