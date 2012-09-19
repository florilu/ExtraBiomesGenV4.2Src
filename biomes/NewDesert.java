package net.minecraft.src.biomes;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.structures.Pyramid;

public class NewDesert extends BiomeGenBase
{
    public NewDesert(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)Block.sand.blockID;
        this.fillerBlock = (byte)Block.sand.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 2;
        this.theBiomeDecorator.reedsPerChunk = 50;
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(1000) == 0)
        {
            int var5 = par3 + par2Random.nextInt(16) + 8;
            int var6 = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells var7 = new WorldGenDesertWells();
            var7.generate(par1World, par2Random, var5, par1World.getHeightValue(var5, var6) + 1, var6);
        }
    }
    public void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
      for(int k = 2; k < 3; k++)
      {
        int RandPosX = chunkX + random.nextInt(16);
        int RandPosY = random.nextInt(67);
        int RandPosZ = chunkZ + random.nextInt(16);
        (new Pyramid()).generate(world, random, RandPosX, RandPosY, RandPosZ);
      }
    }
}
