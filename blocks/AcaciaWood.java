package net.minecraft.src.blocks;

import java.util.Random;
import net.minecraft.src.*;

public class AcaciaWood extends Block
{
	public AcaciaWood (int i, int j)
    {
        super(i,j,Material.wood);
    }
    
    public int idDropped(int i, Random random)
    {
        return mod_blocks.AcaciaWood.blockID;               
    }
    
    public int getBlockTextureFromSide(int a)
    {
    	if(a == 0)
    	{
    		return mod_blocks.AcaciaBelow;
    	}
    	else if(a == 1)
    	{
    		return mod_blocks.AcaciaAbove;
    	}
    	else
    	{
    		return mod_blocks.AcaciaSide;
    	}
    }

	public Block setHardness(float par1)
    {
        this.blockHardness = par1;

        if (this.blockResistance < par1 * 5.0F)
        {
            this.blockResistance = par1 * 5.0F;
        }

        return this;
    }
}