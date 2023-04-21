import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.Socket;


public class Game extends JFrame{

    private Socket g_socket;
    private int g_screenSizeX;
    private int g_screenSizeY;
    private int g_mouseX;
    private int g_mouseY;
    private int g_scene;
    private String g_title;

    private Draw g_draw;
    private Event g_event;
    private Menu g_menu;
    private Multiplayer g_multi;
    private Player g_player;
    private Hero g_hero;
    private Gameplay g_gameplay;

    private int  g_hero2 = 0;
    Game() throws IOException {

        this.g_scene = 1;
        this.InitializeWindow();
        this.InitializeClasses();


        this.add(g_draw);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);
        this.addMouseMotionListener(g_event);
    }

    public void InitializeWindow(){
        this.setSize(1400, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
    }
    public void InitializeClasses() throws IOException {
        this.g_hero = new Hero(this);
        this.g_player = new Player(this, this.g_hero);
        this.g_gameplay = new Gameplay(this,this.g_player);
        this.g_multi = new Multiplayer(this,this.g_player,this.g_hero,this.g_gameplay);
        this.g_menu = new Menu(this);
        this.g_draw = new Draw(this,this.g_menu,this.g_multi,this.g_player,this.g_gameplay);
        this.g_event = new Event(this,this.g_draw,this.g_gameplay);

    }
    public int getScene(){
        return this.g_scene;
    }
    public void setScene(int scene){
        this.g_scene = scene;
    }
    public void RePaint(){
        this.g_draw.repaint();
    }
    public Socket getSocket(){
        return this.g_socket;
    }
    public void setHero2(int hero){
        this.g_hero2 = hero;
    }
    public int getHero2(){
        return this.g_hero2;
    }
    public void setSocket(Socket socket){ this.g_socket = socket; }
}
