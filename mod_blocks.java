package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.blocks.*;

public class mod_blocks extends BaseMod
{

public static final Block Basalt = new Basalt(253,0).setHardness(3.0F).setLightValue(0.0F).setBlockName("Basalt").setCreativeTab(CreativeTabs.tabBlock);
public static final Block CrackedSand = (new CrackedSand(254, 0)).setHardness(1.0F).setLightValue(0.0F).setBlockName("Cracked Sand").setCreativeTab(CreativeTabs.tabBlock);
public static final Block AcaciaWood = new AcaciaWood(255, 0).setHardness(2.0F).setBlockName("Acacia Wood").setCreativeTab(CreativeTabs.tabBlock);
public static final Block AcaciaLeaf = new AcaciaLeaf(202, 0).setHardness(0.2F).setLightOpacity(1).setBlockName("Acacia Leaf").setCreativeTab(CreativeTabs.tabDeco);
public static final Block AcaciaSapling = new AcaciaSapling(201, 15).setHardness(0.0F).setBlockName("Acacia Sapling").setCreativeTab(CreativeTabs.tabDeco);
public static final Block AcaciaPlanks = (new AcaciaPlanks(200, 0)).setHardness(2.0F).setBlockName("Acacia Planks").setCreativeTab(CreativeTabs.tabBlock);
public static final Block PineWood = (new PineWood(250, 0)).setHardness(2.0F).setBlockName("Pine Wood").setCreativeTab(CreativeTabs.tabBlock);

public static int AcaciaAbove = ModLoader.addOverride("/terrain.png", "/textures/blocks/AcaciaAbove.png");
public static int AcaciaBelow = ModLoader.addOverride("/terrain.png", "/textures/blocks/AcaciaBelow.png");
public static int AcaciaSide = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciawood.png");
public static int PineSide = ModLoader.addOverride("/terrain.png", "/textures/blocks/PineSide.png");

public mod_blocks()
{    

    ModLoader.registerBlock(Basalt);
    ModLoader.registerBlock(CrackedSand);
    ModLoader.registerBlock(AcaciaWood);
    ModLoader.registerBlock(AcaciaLeaf);
    ModLoader.registerBlock(AcaciaSapling);
    ModLoader.registerBlock(AcaciaPlanks);
    ModLoader.registerBlock(PineWood);
    
    CrackedSand.blockIndexInTexture = ModLoader.addOverride("/terrain.png","/textures/blocks/crackedsand.png");
    AcaciaPlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciaplanks.png");
    AcaciaLeaf.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acacialeaf.png");
    AcaciaSapling.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciasapling.png");
    Basalt.blockIndexInTexture = ModLoader.addOverride("/terrain.png","/textures/blocks/basalt.png");

    ModLoader.addName(Basalt, "Basalt");
    ModLoader.addName(CrackedSand, "Cracked Sand");
    ModLoader.addName(AcaciaWood, "WIP");
    ModLoader.addName(AcaciaLeaf, "WIP");
    ModLoader.addName(AcaciaSapling, "WIP");
    ModLoader.addName(AcaciaPlanks, "WIP");
    ModLoader.addName(PineWood, "Pine Wood EBG");
    
}               

public String getVersion()
    {
        return "1.3.2";
    }
  
        public void load()
        {
        	;
        }

} 