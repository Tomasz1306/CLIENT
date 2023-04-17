import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Gameplay {

    private Game g_game;
    private Player g_player;


    private Image g_playerCard1;
    private Image g_playerCard3;
    private Image g_playerCard2;
    private Image g_playerCard4;
    private Image g_playerCard5;
    private Image g_playerCard6;
    private Image g_playerCard7;
    private Image g_playerCard8;
    private boolean g_mouseCard1;
    private boolean g_mouseCard2;
    private boolean g_mouseCard3;
    private boolean g_mouseCard4;
    private boolean g_mouseCard5;
    private boolean g_mouseCard6;
    private boolean g_mouseCard7;
    private boolean g_mouseCard8;

    private Image g_oponentCard1;
    private Image g_oponentCard2;
    private Image g_oponentCard3;
    private Image g_oponentCard4;
    private Image g_oponentCard5;
    private Image g_oponentCard6;
    private Image g_oponentCard7;
    private Image g_oponentCard8;

    private Image g_emptyCard;

    Gameplay(Game game, Player player){
        this.g_game = game;
        this.g_player = player;
    }

    public Image getPlayerCard1() {
        return this.g_player.getCard1small(); }

    public Image getPlayerCard2(){
        return this.g_player.getCard2small();
    }
    public Image getPlayerCard3() {
        return this.g_player.getCard3small();
    }
    public Image getPlayerCard4() {
        return this.g_player.getCard4small();
    }
    public Image getPlayerCard5() {
        return this.g_player.getCard5small();
    }
    public Image getPlayerCard6() {
        return this.g_player.getCard6small();
    }
    public Image getPlayerCard7() {
        return this.g_player.getCard7small();
    }
    public Image getPlayerCard8() {
        return this.g_player.getCard8small();
    }
    public boolean getMouseCard1(){return this.g_mouseCard1; }
    public boolean getMouseCard2(){return this.g_mouseCard2; }
    public boolean getMouseCard3(){return this.g_mouseCard3; }
    public boolean getMouseCard4(){return this.g_mouseCard4; }
    public boolean getMouseCard5(){return this.g_mouseCard5; }
    public boolean getMouseCard6(){return this.g_mouseCard6; }
    public boolean getMouseCard7(){return this.g_mouseCard7; }
    public boolean getMouseCard8(){return this.g_mouseCard8; }
    public Image getOponentCard1(){
        return this.g_oponentCard1;
    }
    public Image getOponentCard2(){
        return this.g_oponentCard2;
    }
    public Image getOponentCard3(){
        return this.g_oponentCard3;
    }
    public Image getOponentCard4(){
        return this.g_oponentCard4;
    }
    public Image getOponentCard5(){
        return this.g_oponentCard5;
    }
    public Image getOponentCard6(){
        return this.g_oponentCard6;
    }
    public Image getOponentCard7(){
        return this.g_oponentCard7;
    }
    public Image getOponentCard8(){
        return this.g_oponentCard8;
    }

    public void InitializeCard()  {
        try {
            System.out.println("Hero2: " + this.g_game.getHero2());
            if (this.g_game.getHero2() == 1) {
                this.g_oponentCard1 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard2 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard3 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard4 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard5 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard6 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard7 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
                this.g_oponentCard8 = ImageIO.read(new File(getClass().getResource("/rsc/Gameplay/1.png").toURI()));
            }
            if (this.g_game.getHero2() == 2) {
                this.g_oponentCard1 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard2 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard3 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard4 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard5 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard6 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard7 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
                this.g_oponentCard8 = ImageIO.read(new File("rsc\\Gameplay\\2.png"));
            }
            if (this.g_game.getHero2() == 3) {
                this.g_oponentCard1 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard2 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard3 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard4 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard5 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard6 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard7 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
                this.g_oponentCard8 = ImageIO.read(new File("rsc\\Gameplay\\3.png"));
            }
            if (this.g_game.getHero2() == 4) {
                this.g_oponentCard1 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard2 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard3 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard4 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard5 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard6 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard7 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
                this.g_oponentCard8 = ImageIO.read(new File("rsc\\Gameplay\\4.png"));
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Success of initialize Oponent Card");
    }
    public void Update(boolean mouseClicked, int x, int y){
        if (x >= 100 && x <= (100 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard1 = true;
        }else{
            this.g_mouseCard1 = false;
        }
        if (x >= 250 && x <= (250 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard2 = true;
        }else{
            this.g_mouseCard2 = false;
        }
        if (x >= 400 && x <= (400 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard3 = true;
        }else{
            this.g_mouseCard3 = false;
        }
        if (x >= 550 && x <= (550 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard4 = true;
        }else{
            this.g_mouseCard4 = false;
        }
        if (x >= 700 && x <= (700 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard5 = true;
        }else{
            this.g_mouseCard5 = false;
        }
        if (x >= 850 && x <= (850 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard6 = true;
        }else{
            this.g_mouseCard6 = false;
        }
        if (x >= 1000 && x <= (1000 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard7 = true;
        }else{
            this.g_mouseCard7 = false;
        }
        if (x >= 1150 && x <= (1150 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_mouseCard8 = true;
        }else{
            this.g_mouseCard8 = false;
        }
    }

}
