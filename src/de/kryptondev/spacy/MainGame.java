package de.kryptondev.spacy;

import de.kryptondev.spacy.input.KeyInputManager;
import de.kryptondev.spacy.input.MouseInputManager;
import de.kryptondev.spacy.screen.MainMenuScreen;
import de.kryptondev.spacy.screen.ScreenManager;
import de.kryptondev.spacy.sound.SoundManager;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class MainGame extends BasicGame {
    
    private KeyInputManager keyInputManager;
    private MouseInputManager mouseInputManager;
    private static ScreenManager screenManager;
    
    public MainGame() {
        super("Spacy");
    }
    
    @Override
    public void init(GameContainer gc) throws SlickException {
        keyInputManager = KeyInputManager.getInstance();
        mouseInputManager = MouseInputManager.getInstance();
        screenManager = ScreenManager.getInstance();
        
        screenManager.changeScreen(new MainMenuScreen());
        
        
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {        
        keyInputManager.update(gc.getInput());
        mouseInputManager.update(gc.getInput());
        
        screenManager.update(gc, i);
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        screenManager.draw(gc, g);
    }
    
    public static void main(String[] args) {
        try {
            // Add LWJGL natives
            JavaHelper.addLibraryPath("natives/" + JavaHelper.getOperatingSystem());
            
//            SoundManager.getInstance().loadMusic("data/sounds/music");            
//            SoundManager.getInstance().loadMusic("data/sounds/sounds");

            
            AppGameContainer gc = new AppGameContainer(new MainGame());
            gc.setDisplayMode(800, 600, false);
            gc.setVSync(true);
//            gc.setDisplayMode(1366, 768, true);          
//            gc.setDisplayMode(1920, 1080, true);

            gc.setIcons(new String[]{"data/icon/icon16x16.png", 
                "data/icon/icon32x32.png", "data/icon/icon48x48.png", 
                "data/icon/icon64x64.png", "data/icon/icon128x128.png", 
                "data/icon/icon256x256.png"});
            gc.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ScreenManager getScreenManager() {
        return screenManager;
    }

    public static void setScreenManager(ScreenManager screenManager) {
        MainGame.screenManager = screenManager;
    }
    
    
    
}
