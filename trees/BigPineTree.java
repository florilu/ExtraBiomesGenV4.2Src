package net.minecraft.src.trees;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.blocks.*;

public class BigPineTree extends WorldGenerator
{
	int wood = mod_blocks.PineWood.blockID;
	
    public boolean generate(World par1World, Random par2Random, int par1, int par2, int par3)
    {
        while (par1World.isAirBlock (par1, par2, par3) && par2 > 5)
        {
            --par2;
        }

        int var6 = par1World.getBlockId(par1, par2, par3);

        if (var6 != Block.grass.blockID && var6 != Block.stone.blockID)
        {
            return false;
        }
        else
        {
            int x;
            int y;
            int z;
            
            //Stamm
            for (x = 1; x <= 2; ++x)
            {
            	for (y = 1; y <= 34; ++y)
            	{
            		for (z = 1; z <= 2; ++z)
            		{
            			par1World.setBlock(par1 + x, par2 + y - 4, par3 + z, wood);
            		}
            	}
            }
            //Blätter
            


            return true;
        }
    }
}
