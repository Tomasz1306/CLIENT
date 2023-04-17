import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Multiplayer implements ActionListener {

    private Game m_game;
    private Player m_player;
    private Hero m_hero;
    private Gameplay m_gameplay;

    private Socket m_socket;
    private JButton m_buttonConnect;
    private JButton m_buttonReload;
    private JButton m_buttonNext;
    private JButton m_buttonBack;
    private JButton m_buttonHero1;
    private JButton m_buttonHero2;
    private JButton m_buttonHero3;
    private JButton m_buttonHero4;
    private JTextField m_TextFieldIp;
    private JTextField m_TextFieldPort;
    private JTextField m_TextFieldNick;
    private String m_ip;
    private String m_nick;
    private int m_heroInt1 = 0;
    private int m_heroInt2 = 0;
    private String m_info1;
    private String m_info2;
    private int m_port;
    private boolean m_connected;

    private PrintWriter out;
    private BufferedReader in;


    Multiplayer(Game game, Player player,Hero hero,Gameplay gameplay) {
        this.m_game = game;
        this.m_player = player;
        this.m_hero = hero;
        this.m_gameplay = gameplay;
        this.m_socket = this.m_game.getSocket();
        this.m_connected = false;
        InitializeComponents();
    }

    public void InitializeComponents(){
        this.m_buttonConnect = new JButton("CONNECT");
        this.m_buttonConnect.setBounds(100,100,400,100);
        this.m_buttonConnect.setBackground(Color.black);
        this.m_buttonConnect.setForeground(Color.white);
        this.m_buttonConnect.setVisible(false);
        this.m_buttonConnect.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonConnect.addActionListener(this);

        this.m_buttonReload = new JButton("RELOAD");
        this.m_buttonReload.setBounds(100,200,400,100);
        this.m_buttonReload.setBackground(Color.black);
        this.m_buttonReload.setForeground(Color.white);
        this.m_buttonReload.setVisible(false);
        this.m_buttonReload.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonReload.addActionListener(this);

        this.m_buttonNext = new JButton("NEXT");
        this.m_buttonNext.setBounds(100,400,400,100);
        this.m_buttonNext.setBackground(Color.black);
        this.m_buttonNext.setForeground(Color.white);
        this.m_buttonNext.setVisible(false);
        this.m_buttonNext.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonNext.addActionListener(this);

        this.m_buttonBack = new JButton("BACK");
        this.m_buttonBack.setBounds(100,300,400,100);
        this.m_buttonBack.setBackground(Color.black);
        this.m_buttonBack.setForeground(Color.white);
        this.m_buttonBack.setVisible(false);
        this.m_buttonBack.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonBack.addActionListener(this);

        this.m_buttonHero1 = new JButton("HERO 1");
        this.m_buttonHero1.setBounds(100,600,100,100);
        this.m_buttonHero1.setBackground(Color.black);
        this.m_buttonHero1.setForeground(Color.white);
        this.m_buttonHero1.setVisible(false);
        this.m_buttonHero1.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.m_buttonHero1.addActionListener(this);

        this.m_buttonHero2 = new JButton("HERO 2");
        this.m_buttonHero2.setBounds(200,600,100,100);
        this.m_buttonHero2.setBackground(Color.black);
        this.m_buttonHero2.setForeground(Color.white);
        this.m_buttonHero2.setVisible(false);
        this.m_buttonHero2.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.m_buttonHero2.addActionListener(this);

        this.m_buttonHero3 = new JButton("HERO 3");
        this.m_buttonHero3.setBounds(300,600,100,100);
        this.m_buttonHero3.setBackground(Color.black);
        this.m_buttonHero3.setForeground(Color.white);
        this.m_buttonHero3.setVisible(false);
        this.m_buttonHero3.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.m_buttonHero3.addActionListener(this);

        this.m_buttonHero4 = new JButton("HERO 4");
        this.m_buttonHero4.setBounds(400,600,100,100);
        this.m_buttonHero4.setBackground(Color.black);
        this.m_buttonHero4.setForeground(Color.white);
        this.m_buttonHero4.setVisible(false);
        this.m_buttonHero4.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.m_buttonHero4.addActionListener(this);

        this.m_TextFieldIp = new JTextField("localhost");
        this.m_TextFieldIp.setBounds(600,100,400,100);
        this.m_TextFieldIp.setBackground(Color.black);
        this.m_TextFieldIp.setForeground(Color.white);
        this.m_TextFieldIp.setEditable(true);
        this.m_TextFieldIp.setFont(new Font("Consolas", Font.PLAIN, 50));

        this.m_TextFieldPort = new JTextField("2222");
        this.m_TextFieldPort.setBounds(600,200,400,100);
        this.m_TextFieldPort.setBackground(Color.black);
        this.m_TextFieldPort.setForeground(Color.white);
        this.m_TextFieldPort.setVisible(false);
        this.m_TextFieldPort.setFont(new Font("Consolas", Font.PLAIN, 50));

        this.m_TextFieldNick = new JTextField("NICK");
        this.m_TextFieldNick.setBounds(600,300,400,100);
        this.m_TextFieldNick.setBackground(Color.black);
        this.m_TextFieldNick.setForeground(Color.white);
        this.m_TextFieldNick.setVisible(false);
        this.m_TextFieldNick.setFont(new Font("Consolas", Font.PLAIN, 50));
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.m_buttonConnect){
            this.m_ip = this.m_TextFieldIp.getText();
            this.m_port = Integer.parseInt(this.m_TextFieldPort.getText());
            this.m_nick = this.m_TextFieldNick.getText();
            if(this.m_heroInt1 != 0){
                this.Connect();
            }
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonReload){
            try {
                this.Reload();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonNext){
            if(this.m_ip.equals("localhost") && this.m_port == 2222 && this.m_heroInt1 != 0 && this.m_connected && this.m_heroInt2 != 0){

                this.m_player.InitializePlayer(this.m_hero,this.m_nick, this.m_heroInt1);
                this.m_gameplay.InitializeCard();

                this.m_game.setScene(6);
            }

            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonBack){
            this.m_game.setScene(1);
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonHero1){
            this.m_heroInt1 = 1;
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonHero2){
            this.m_heroInt1 = 2;
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonHero3){
            this.m_heroInt1 = 3;
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonHero4){
            this.m_heroInt1 = 4;
            this.m_game.RePaint();
        }
    }
    public JButton getButtonConnect(){
        return this.m_buttonConnect;
    }
    public JButton getButtonReload(){
        return this.m_buttonReload;
    }
    public JButton getButtonChooseHero(){ return this.m_buttonNext; }
    public JButton getButtonBack(){ return this.m_buttonBack ;}
    public JButton getButtonHero1(){return this.m_buttonHero1;}
    public JButton getButtonHero2(){return this.m_buttonHero2;}
    public JButton getButtonHero3(){return this.m_buttonHero3;}
    public JButton getButtonHero4(){return this.m_buttonHero4;}
    public JTextField getTextFieldIp(){
        return this.m_TextFieldIp;
    }
    public JTextField getTextFieldPort(){
        return this.m_TextFieldPort;
    }
    public JTextField getTextFieldNick(){
        return this.m_TextFieldNick;
    }
    public void setVisible(){
        if(this.m_game.getScene() == 5){
            this.m_buttonConnect.setVisible(true);
            this.m_buttonReload.setVisible(true);
            this.m_buttonBack.setVisible(true);
            this.m_buttonNext.setVisible(true);
            this.m_buttonHero1.setVisible(true);
            this.m_buttonHero2.setVisible(true);
            this.m_buttonHero3.setVisible(true);
            this.m_buttonHero4.setVisible(true);
            this.m_TextFieldIp.setVisible(true);
            this.m_TextFieldPort.setVisible(true);
            this.m_TextFieldNick.setVisible(true);
        }else{
            this.m_buttonConnect.setVisible(false);
            this.m_buttonReload.setVisible(false);
            this.m_buttonBack.setVisible(false);
            this.m_buttonNext.setVisible(false);
            this.m_buttonHero1.setVisible(false);
            this.m_buttonHero2.setVisible(false);
            this.m_buttonHero3.setVisible(false);
            this.m_buttonHero4.setVisible(false);
            this.m_TextFieldIp.setVisible(false);
            this.m_TextFieldPort.setVisible(false);
            this.m_TextFieldNick.setVisible(false);
        }
    }
    public String getIp(){
        return this.m_ip;
    }
    public String getNick(){
        return this.m_nick;
    }
    public int getPort(){
        return this.m_port;
    }
    public boolean getConnected() {
        return this.m_connected;
    }
    public String getInfo1(){
        return this.m_info1;
    }
    public String getInfo2(){
        return this.m_info2;
    }
    public int getHero1(){return this.m_heroInt1;}
    public int getHero2(){return this.m_heroInt2;}
    public void Connect() {
        try {
            this.m_socket = new Socket(this.m_ip, this.m_port);

            this.out = new PrintWriter(this.m_socket.getOutputStream(), true);
            this.in = new BufferedReader(new InputStreamReader(this.m_socket.getInputStream()));
            String wiadomosc;

            wiadomosc = this.m_nick + "," + this.m_heroInt1;
            out.println(wiadomosc);

            this.m_connected = true;


        } catch (UnknownHostException e) {
            System.err.println("Nieznany host: " + this.m_ip);
        } catch (IOException e) {
            System.err.println("Błąd wejścia/wyjścia podczas próby połączenia z serwerem " + this.m_ip);
        }
    }
    public void Reload() throws IOException {
        new Thread(() -> {
            System.out.println("Uruchomiono metode Reload");

            String userInput = "Dane";
            try {
                this.out.println(userInput);
                String dane;
                String[] names;
                dane = this.in.readLine();
                names = dane.split(",");
                if(names.length != 0){
                    this.m_info1 = names[0];
                    this.m_heroInt1 = Integer.parseInt(names[1]);
                    this.m_info2 = names[2];
                    this.m_heroInt2 = Integer.parseInt(names[3]);
                    this.m_game.setHero2(this.m_heroInt2);

                }

                System.out.println("Server: " + dane);
                this.m_game.RePaint();
                Thread.interrupted();
            } catch (IOException e) {
                System.err.println("Couldn't get I/O for the connection to " + this.m_ip);
                //System.exit(1);
            }
        }).start();
    }
}
