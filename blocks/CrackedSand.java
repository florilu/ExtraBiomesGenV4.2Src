package net.minecraft.src.blocks;

import java.util.Random;
import net.minecraft.src.*;

public class CrackedSand extends Block
{
	public CrackedSand (int i, int j)
    {
        super(i,j,Material.rock);
    }

    public int idDropped(int i, Random random)
    {
        return mod_blocks.CrackedSand.blockID;               
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