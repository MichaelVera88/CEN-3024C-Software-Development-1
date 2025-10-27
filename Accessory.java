import java.util.HashMap;
import java.util.Map;

class Stats
{
    private String[] statNames;
    private int[] statValues;

    public Stats(String[] statNames, int[] statValues)
    {
        this.statNames = statNames;
        this.statValues = statValues;
    }

    public Map<String, Integer> getAccessoryStats()
    {
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
