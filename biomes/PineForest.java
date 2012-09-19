package net.minecraft.src.biomes;

import java.util.Random;
import net.minecraft.src.*;

public class PineForest extends BiomeGenBase
{
    public PineForest(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
        this.theBiomeDecorator.bigpineperchunk = 1;
        this.theBiomeDecorator.grassPerChunk = 3;
    }
   
}
