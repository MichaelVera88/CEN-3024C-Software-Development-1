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

}
