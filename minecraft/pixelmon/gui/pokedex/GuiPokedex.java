package pixelmon.gui.pokedex;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.Rectangle;

import pixelmon.config.PixelmonConfig;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.gui.ContainerEmpty;
import pixelmon.pokedex.Pokedex;
import pixelmon.pokedex.PokedexEntry;
import pixelmon.render.GraphicsHelper;
import pixelmon.storage.PixelmonStorage;
import net.minecraft.src.*;

public class GuiPokedex extends GuiContainer
{
	
	public int top, left;
	public int currentEntry;
	public Pokedex pokedex;
	public GuiPokedexSlot scrollPane;
	private boolean optionsHover;
	
	private GuiPokedex(String username) 
	{
		super(new ContainerEmpty());
		currentEntry = 1;
		pokedex = PixelmonStorage.PokeballManager.getPlayerStorage(PixelmonStorage.PokeballManager.getPlayerFromName(username)).pokedex;
		xSize = 256;
		ySize = 226;
	}

	public GuiPokedex(String username, int id)
	{
		this(username);
		currentEntry = id;
	}
	
	/*
	public GuiPokedex(String lookup)
	{
		this();
		currentEntry = Pokedex.nameToID(lookup);
		if(currentEntry == 0)
			currentEntry = 1;
	}
	*/
	
	public void initGui()
	{
		super.initGui();
		left = (width - xSize) / 2;
		top = (height - ySize) / 2;
		controlList.clear();
		if(scrollPane == null)
			scrollPane = new GuiPokedexSlot(this);
		//scrollPane.elementClicked(0, false);
	}
	
	int mouseX, mouseY;
	float mfloat;
	
	protected void drawGuiContainerBackgroundLayer(float par3, int par2, int par1)
	{
		pokedex = PixelmonStorage.PokeballManager.getPlayerStorage(PixelmonStorage.PokeballManager.getPlayerFromName(pokedex.owner.username)).pokedex;
		//drawDefaultBackground();
		left = (width - xSize) / 2;
		top = (height - ySize) / 2;
		mouseX = par2;
		mouseY = par1;
		mfloat = par3;
		PokedexEntry selectedEntry = pokedex.getEntry(currentEntry);
		RenderHelper.disableStandardItemLighting();
		int i = mc.renderEngine.getTexture("/pixelmon/gui/pokedex.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(i);
		drawTexturedModalRect(left, top, 0, 0, xSize, ySize);
		fontRenderer.drawString("Pokedex", left + 6, top + 5, 0xFFFFFF);
		String s = selectedEntry.getPokedexDisplayNumber() + " " + (pokedex.hasSeen(currentEntry)?selectedEntry.name:"???");
		drawCenteredString(fontRenderer, s, left + 174, top + 38 - 3, 0x575757);
		s = "Description";
		drawCenteredString(fontRenderer, s, left + 141, top + 125, 0x575757);
		boolean b = pokedex.hasCaught(currentEntry);
		//b = true;
		s = "";
		if(b)
		{
			s = selectedEntry.description;
			fontRenderer.drawSplitString(s, left + 104, top + 141 - 3, 97, 0x575757);
		}
		s = "Height: ";
		if(b)
			s += PixelmonConfig.isInMetric?selectedEntry.heightM:selectedEntry.heightC;
		else
			s += "??? " + (PixelmonConfig.isInMetric?"m":"ft");
		fontRenderer.drawString(s, left + 164, top + 69 - 10, 0x575757);
		s = "Weight: ";
		if(b)
			s += PixelmonConfig.isInMetric?selectedEntry.weightM:selectedEntry.weightC;
		else
			s += "??? " + (PixelmonConfig.isInMetric?"kg":"lbs");
		fontRenderer.drawString(s, left + 164, top + 69 + 0, 0x575757);
		fontRenderer.drawString("More...", left + 46, top + 204 - 3, optionsHover?0x0000FF:0x575757);
		scrollPane.drawScreen(mouseX, mouseY, mfloat);
		b = pokedex.hasSeen(currentEntry);
		//b = !pokedex.isUnknown(currentEntry);
		if(b)
		{
			EntityPixelmon ep = selectedEntry.getRenderTarget(mc.theWorld);
			if(ep != null)
			{
				ep.loadModel();
				if(ep.model != null)
					GraphicsHelper.drawEntityToScreen(left + 130, top + 106, 51, 55, ep, par3, true);
			}
		}
		//fontRenderer.drawString(mouseX + ", " + mouseY + ": " + rect.contains(mouseX, mouseY), mouseX, mouseY, 0xFFFFFF);
		hasDrawn = true;
	}
	
	boolean hasDrawn;
	public void updateScreen()
	{
		int x = 44;
		int y = 200;
		int width = 44;
		int height = 9;
		Rectangle rect = new Rectangle(x, y, width, height);
		if(rect.contains(mouseX - left, mouseY - top) && hasDrawn)
		{
			optionsHover = true;
			if(Mouse.isButtonDown(0))
				mc.displayGuiScreen(new GuiPokedexOptions(this));
		} else
			optionsHover = false;
		hasDrawn = false;
	}
	
	public void drawCenteredString(FontRenderer f, String s, int x, int y, int c)
	{
		f.drawString(s, x - f.getStringWidth(s) / 2, y, c);
	}
	
	public void keyTyped(char c, int i)
	{
		if(i == Keyboard.KEY_ESCAPE)
		{
			mc.displayGuiScreen(null);
		}
		if(Character.isLetter(c))
			mc.displayGuiScreen(new GuiPokedexMore(this, "" + c));
	}
	
	public boolean doesGuiPauseGame()
	{
		return true;
	}
	
}