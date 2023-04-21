import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.net.URISyntaxException;

public class Gameplay {

    private Game g_game;
    private Player g_player;

    private Socket g_socket;
    private PrintWriter out2;
    private BufferedReader in2;

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
    private boolean g_clickCard1;
    private boolean g_clickCard2;
    private boolean g_clickCard3;
    private boolean g_clickCard4;
    private boolean g_clickCard5;
    private boolean g_clickCard6;
    private boolean g_clickCard7;
    private boolean g_clickCard8;

    private Image g_oponentCard1;
    private Image g_oponentCard2;
    private Image g_oponentCard3;
    private Image g_oponentCard4;
    private Image g_oponentCard5;
    private Image g_oponentCard6;
    private Image g_oponentCard7;
    private Image g_oponentCard8;

    private Image g_emptyCard;

    private Point g_oponentCard;
    private Point g_playerCard;

    Gameplay(Game game, Player player) throws IOException {
        this.g_game = game;
        this.g_player = player;
        this.g_oponentCard = new Point();
        this.g_playerCard = new Point();

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
    public boolean getClickCard1(){return this.g_clickCard1; }
    public boolean getClickCard2(){return this.g_clickCard2; }
    public boolean getClickCard3(){return this.g_clickCard3; }
    public boolean getClickCard4(){return this.g_clickCard4; }
    public boolean getClickCard5(){return this.g_clickCard5; }
    public boolean getClickCard6(){return this.g_clickCard6; }
    public boolean getClickCard7(){return this.g_clickCard7; }
    public boolean getClickCard8(){return this.g_clickCard8; }
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
    public Point getPlayerCardCoord(){
        return this.g_playerCard;
    }
    public Point getOponentCardCoord(){
        return this.g_oponentCard;
    }

    public void InitializeCard()  {
        try {
            System.out.println("Hero2: " + this.g_game.getHero2());
            if (this.g_game.getHero2() == 1) {
                this.g_oponentCard1 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard2 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard3 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard4 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard5 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard6 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard7 = ImageIO.read(new File("Gameplay\\1.png"));
                this.g_oponentCard8 = ImageIO.read(new File("Gameplay\\1.png"));
            }
            if (this.g_game.getHero2() == 2) {
                this.g_oponentCard1 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard2 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard3 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard4 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard5 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard6 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard7 = ImageIO.read(new File("Gameplay\\2.png"));
                this.g_oponentCard8 = ImageIO.read(new File("Gameplay\\2.png"));
            }
            if (this.g_game.getHero2() == 3) {
                this.g_oponentCard1 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard2 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard3 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard4 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard5 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard6 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard7 = ImageIO.read(new File("Gameplay\\3.png"));
                this.g_oponentCard8 = ImageIO.read(new File("Gameplay\\3.png"));
            }
            if (this.g_game.getHero2() == 4) {
                this.g_oponentCard1 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard2 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard3 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard4 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard5 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard6 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard7 = ImageIO.read(new File("Gameplay\\4.png"));
                this.g_oponentCard8 = ImageIO.read(new File("Gameplay\\4.png"));
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Success of initialize Oponent Card");
    }
    public void Update(boolean mouseClicked, int x, int y){
        if (x >= 100 && x <= (100 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 170;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard1==false) {
                System.out.println("Zaznaczono karte 1");
                this.out2.println("Zaznaczono karte 1");
                this.g_mouseCard1 = true;
            }
            if(mouseClicked){
                System.out.println("Karta 1 zostal kliknieta");
                this.g_clickCard1 = true;
            }

        }
        else if (x >= 250 && x <= (250 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 320;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard2==false){
                this.out2.println("Zaznaczono karte 2");
                System.out.println("Zaznaczono karte 2");
                this.g_mouseCard2 = true;
            }
            if(mouseClicked){
                this.g_clickCard2 = true;
            }

        }
        else if (x >= 400 && x <= (400 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 470;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard3==false){
                this.out2.println("Zaznaczono karte 3");
                System.out.println("Zaznaczono karte 3");
                this.g_mouseCard3 = true;
            }
            if(mouseClicked){
                this.g_clickCard3 = true;
            }

        }
        else if (x >= 550 && x <= (550 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 620;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard4==false){
                this.out2.println("Zaznaczono karte 4");
                System.out.println("Zaznaczono karte 4");
                this.g_mouseCard4 = true;
            }
            if(mouseClicked){
                this.g_clickCard4 = true;
            }

        }
        else if (x >= 700 && x <= (700 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 770;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard5==false){
                this.out2.println("Zaznaczono karte 5");
                System.out.println("Zaznaczono karte 5");
                this.g_mouseCard5 = true;
            }
            if(mouseClicked){
                this.g_clickCard5 = true;
            }

        }
        else if (x >= 850 && x <= (850 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 920;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard6==false){
                this.out2.println("Zaznaczono karte 6");
                System.out.println("Zaznaczono karte 6");
                this.g_mouseCard6 = true;
            }
            if(mouseClicked){
                this.g_clickCard6 = true;
            }
        }
        else if (x >= 1000 && x <= (1000 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 1070;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard7==false){
                this.g_mouseCard7 = true;
                this.out2.println("Zaznaczono karte 7");
                System.out.println("Zaznaczono karte 7");
            }
            if(mouseClicked){
                this.g_clickCard7 = true;
            }
        }
        else if (x >= 1150 && x <= (1150 + 145) && y >= 550 && y <= (550 + 208)) {
            this.g_playerCard.x = 1220;
            this.g_playerCard.y = 520;
            if(this.g_mouseCard8==false){
                this.out2.println("Zaznaczono karte 8");
                System.out.println("Zaznaczono karte 8");
                this.g_mouseCard8 = true;
            }
            if(mouseClicked){
                this.g_clickCard8 = true;
            }
        }else{
            this.g_playerCard.x = -100;
            this.g_playerCard.y = -100;
            if(this.g_mouseCard1==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard1 = false;
                this.g_mouseCard1 = false;
            }
            if(this.g_mouseCard2==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard2 = false;
                this.g_mouseCard2 = false;
            }
            if(this.g_mouseCard3==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard3 = false;
                this.g_mouseCard3 = false;
            }
            if(this.g_mouseCard4==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard4 = false;
                this.g_mouseCard4 = false;
            }
            if(this.g_mouseCard5==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard5 = false;
                this.g_mouseCard5 = false;
            }
            if(this.g_mouseCard6==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard6 = false;
                this.g_mouseCard6 = false;
            }
            if(this.g_mouseCard7==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard7 = false;
                this.g_mouseCard7 = false;
            }

            if(this.g_mouseCard8==true){
                this.out2.println("Odznaczono karte");
                this.g_clickCard8 = false;
                this.g_mouseCard8 = false;
            }

        }
    }
    public void Check(){
        new Thread(() -> {

            System.out.println("Uruchomiono metode check w Gameplay");
            String input;
            try {
                this.g_socket = this.g_game.getSocket();
                this.out2 = new PrintWriter(this.g_socket.getOutputStream(), true);
                this.in2 = new BufferedReader(new InputStreamReader(this.g_socket.getInputStream()));

                while(true){
                    input = this.in2.readLine();
                    if(input != null){
                        if(input.equals("Zaznaczono karte 1")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 1");
                            this.g_oponentCard.x = 430;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 2")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 2");
                            this.g_oponentCard.x = 510;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 3")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 3");
                            this.g_oponentCard.x = 590;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 4")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 4");
                            this.g_oponentCard.x = 670;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 5")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 5");
                            this.g_oponentCard.x = 750;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 6")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 6");
                            this.g_oponentCard.x = 830;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 7")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 7");
                            this.g_oponentCard.x = 910;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Zaznaczono karte 8")){
                            System.out.println("Przeciwnik zaznaczyl karte nr 8");
                            this.g_oponentCard.x = 990;
                            this.g_oponentCard.y = 110;
                        }
                        if(input.equals("Odznaczono karte")){
                            System.out.println("Przeciwnik odznaczyl karte");
                            this.g_oponentCard.x = -100;
                            this.g_oponentCard.y = -100;
                        }
                        this.g_game.RePaint();
                        //System.out.println("Server: " + input);
                    }
                }
            } catch (IOException e) {
                System.err.println("Couldn't get I/O for the connection to ");
                //System.exit(1);
            }
        }).start();
    }

}
