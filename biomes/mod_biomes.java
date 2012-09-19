package net.minecraft.src.biomes;
import java.util.Random;
import net.minecraft.src.*;

public class mod_biomes extends BaseMod
{

public static BiomeGenBase newdesert = (new NewDesert(39)).setColor(13786898).setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.3F).setBiomeName("Desert");
public static BiomeGenBase foresthills = (new ForestHills(41)).setColor(353825).setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.6F, 1.9F).setBiomeName("Forest Mountains");
public static BiomeGenBase newforest = (new NewForest(42)).setColor(353825).setTemperatureRainfall(0.7F, 0.8F).setBiomeName("Forest");
public static BiomeGenBase coveredmountains = (new CoveredMountains(43)).setColor(747097).setTemperatureRainfall(0.0F, 0.8F).setMinMaxHeight(0.7F, 2.0F).setBiomeName("Covered Mountains");
public static BiomeGenBase pineforest = (new PineForest(250)).setColor(353825).setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.3F, 0.4F).setBiomeName("Pineforest");
public static BiomeGenBase pineforesthills = (new PineForest(251)).setColor(353825).setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.4F, 0.8F).setBiomeName("Pineforest Hills");

public mod_biomes()
{    
    ;
}               

public String getVersion()
    {
        return "1.3.2";
    }
  
        public void load()
        {
        	ModLoader.addBiome(mod_biomes.newdesert);
        }

} 