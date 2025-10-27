import java.util.HashMap;
import java.util.Map;

/*
* Stats Class:
*   - Takes 2 arrays:
*       - stat names
*       - corresponding stat values
*   - Combines & returns both arrays into a hashmap with the key being the name
*/
class Stats
{
    // Instance Variables
    private String[] statNames;
    private int[] statValues;

    // Initialization
    public Stats(String[] statNames, int[] statValues)
    {
        this.statNames = statNames;
        this.statValues = statValues;
    }

    // Combine into Hashmap
    public Map<String, Integer> getAccessoryStats()
    {
        // Check if both arrays are equal length
        if (statNames.length != statValues.length)
        {
            throw new ArrayIndexOutOfBoundsException("statNames.length and statValues.length are not equal.");
        }
        else
        {
            Map<String, Integer> accessoryStats = new HashMap<>();
            for (int i = 0; i < statNames.length; i++)
            {
                accessoryStats.put(statNames[i], statValues[i]);
            }
            return accessoryStats;
        }
    }
}

public class Accessory
{
    // Instance Variables
    public int ID;
    public String name;
    public String rarity;
    public Map<String, Integer> stats;
    public String description;
    public String requirements;
    public int upgrade;
    public String source;
    public int mp;
    public int price;

    // Initialization
    public Accessory(
            int ID,
            String name,
            String rarity,
            Map<String, Integer> stats,
            String description,
            String requirements,
            int upgrade,
            String source,
            int mp,
            int price)
    {
        this.ID = ID;
        this.name = name;
        this.rarity = rarity;
        this.stats = stats;
        this.description = description;
        this.requirements = requirements;
        this.upgrade = upgrade;
        this.source = source;
        this.mp = mp;
        this.price = price;
    }


}
