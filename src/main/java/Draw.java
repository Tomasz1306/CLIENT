import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel{

    private Game d_game;
    private Menu d_menu;
    private Multiplayer d_multi;
    private Player d_player;
    private Gameplay d_gameplay;

    private final Font d_font = new Font("Consolas", Font.PLAIN, 20);;
    Draw(Game game, Menu menu, Multiplayer multi, Player player,Gameplay gameplay){
        this.d_game = game;
        this.d_menu = menu;
        this.d_multi = multi;
        this.d_player = player;
        this.d_gameplay = gameplay;
        this.setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(d_font);
        g.setColor(Color.white);
        this.setBackground(Color.black);
        Graphics2D g2 = (Graphics2D) g;

        this.DrawMenu(g, g2);
        this.DrawMultiplayer(g, g2);
        this.DrawGameplay(g,g2);

    }

    public void DrawMenu(Graphics g, Graphics2D g2){
        this.d_menu.setVisible();
        if(this.d_game.getScene() == 1){
            this.setBackground(Color.black);

            this.add(this.d_menu.getStart());
            this.add(this.d_menu.getMulti());
            this.add(this.d_menu.getOption());
            this.add(this.d_menu.getExit());
        }
    }
    public void DrawMultiplayer(Graphics g, Graphics2D g2){
        this.d_multi.setVisible();
        if(this.d_game.getScene() == 5){
            this.setBackground(Color.black);

            this.add(this.d_multi.getButtonConnect());
            this.add(this.d_multi.getButtonReload());
            this.add(this.d_multi.getButtonChooseHero());
            this.add(this.d_multi.getButtonBack());
            this.add(this.d_multi.getButtonHero1());
            this.add(this.d_multi.getButtonHero2());
            this.add(this.d_multi.getButtonHero3());
            this.add(this.d_multi.getButtonHero4());
            this.add(this.d_multi.getTextFieldIp());
            this.add(this.d_multi.getTextFieldPort());
            this.add(this.d_multi.getTextFieldNick());

            if(this.d_multi.getConnected()){
                g.setColor(Color.green);
            }else{
                g.setColor(Color.white);
            }
            g.drawString("IP Status: " + this.d_multi.getIp(),610,500);
            g.drawString("PORT Status: " + this.d_multi.getPort(), 610,550);
            g.drawString("Nick Status: " + this.d_multi.getNick(), 610, 600);
            g.setColor(Color.white);
            g.drawString("Player 1: " + this.d_multi.getInfo1(), 910,500);
            g.drawString("Player 2: " + this.d_multi.getInfo2(), 910,550);
            g.drawString("Hero 1 Status: " + this.d_multi.getHero1(), 910, 600);
            g.drawString("Hero 2 Status: " + this.d_multi.getHero2(), 910, 650);

        }
    }
    public void DrawGameplay(Graphics g, Graphics2D g2){
        if(this.d_game.getScene() == 6){

            g.drawString("HEALT: " + this.d_player.getHp(), 50,50);
            g.drawString("MANA: " + this.d_player.getMana(), 50, 100);

            g.drawImage(this.d_gameplay.getPlayerCard1(),100,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard2(),250,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard3(),400,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard4(),550,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard5(),700,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard6(),850,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard7(),1000,550, null);
            g.drawImage(this.d_gameplay.getPlayerCard8(),1150,550, null);

            g.drawImage(this.d_gameplay.getOponentCard1(), 400, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard2(), 480, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard3(), 560, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard4(), 640, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard5(), 720, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard6(), 800, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard7(), 880, 0, null);
            g.drawImage(this.d_gameplay.getOponentCard8(), 960, 0, null);

            if(this.d_gameplay.getMouseCard1()){
                g.drawString("Karta 1", 400, 400);
            }
            if(this.d_gameplay.getMouseCard2()){
                g.drawString("Karta 2", 400, 400);
            }
            if(this.d_gameplay.getMouseCard3()){
                g.drawString("Karta 3", 400, 400);
            }
            if(this.d_gameplay.getMouseCard4()){
                g.drawString("Karta 4", 400, 400);
            }
            if(this.d_gameplay.getMouseCard5()){
                g.drawString("Karta 5", 400, 400);
            }
            if(this.d_gameplay.getMouseCard6()){
                g.drawString("Karta 6", 400, 400);
            }
            if(this.d_gameplay.getMouseCard7()){
                g.drawString("Karta 7", 400, 400);
            }
            if(this.d_gameplay.getMouseCard8()){
                g.drawString("Karta 8", 400, 400);
            }

        }
    }
}
