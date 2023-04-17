import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Menu implements ActionListener {

    private Game m_game;

    public int zmienna;
    private JButton m_buttonStart;
    private JButton m_buttonMutli;
    private JButton m_buttonOption;
    private JButton m_buttonExit;

    Menu(Game game){
        this.m_game = game;
        this.InitializeButtons();
        this.zmienna = 1;
    }

    public JButton getStart(){
        return this.m_buttonStart;
    }
    public JButton getMulti(){
        return this.m_buttonMutli;
    }
    public JButton getOption(){
        return this.m_buttonOption;
    }
    public JButton getExit(){
        return this.m_buttonExit;
    }
    public void InitializeButtons(){
        this.m_buttonStart = new JButton("START");
        this.m_buttonStart.setBounds(500,200,400,100);
        this.m_buttonStart.setBackground(Color.black);
        this.m_buttonStart.setForeground(Color.white);
        this.m_buttonStart.setVisible(true);
        this.m_buttonStart.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonStart.addActionListener(this);

        this.m_buttonMutli = new JButton("MULTIPLAYER");
        this.m_buttonMutli.setBounds(500,300,400,100);
        this.m_buttonMutli.setBackground(Color.black);
        this.m_buttonMutli.setForeground(Color.white);
        this.m_buttonMutli.setVisible(true);
        this.m_buttonMutli.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonMutli.addActionListener(this);

        this.m_buttonOption = new JButton("OPTION");
        this.m_buttonOption.setBounds(500,400,400,100);
        this.m_buttonOption.setBackground(Color.black);
        this.m_buttonOption.setForeground(Color.white);
        this.m_buttonOption.setVisible(true);
        this.m_buttonOption.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonOption.addActionListener(this);

        this.m_buttonExit = new JButton("EXIT");
        this.m_buttonExit.setBounds(500,500,400,100);
        this.m_buttonExit.setBackground(Color.black);
        this.m_buttonExit.setForeground(Color.white);
        this.m_buttonExit.setVisible(true);
        this.m_buttonExit.setFont(new Font("Consolas", Font.PLAIN, 50));
        this.m_buttonExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.m_buttonStart){
            //this.m_game.setScene(2);
            this.m_game.RePaint();
        }
        if(e.getSource() == this.m_buttonMutli){
            this.m_game.setScene(5);
            this.m_game.RePaint();

        }
        if(e.getSource() == this.m_buttonOption){
        }
        if(e.getSource() == this.m_buttonExit){
            this.m_game.dispatchEvent(new WindowEvent(this.m_game, WindowEvent.WINDOW_CLOSING));
        }
    }
    public void setVisible(){
        if(this.m_game.getScene() == 1){
            this.m_buttonStart.setVisible(true);
            this.m_buttonMutli.setVisible(true);
            this.m_buttonOption.setVisible(true);
            this.m_buttonExit.setVisible(true);
        }else{
            this.m_buttonStart.setVisible(false);
            this.m_buttonMutli.setVisible(false);
            this.m_buttonOption.setVisible(false);
            this.m_buttonExit.setVisible(false);
        }
    }
}
