import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Event extends MouseAdapter{

    private Game e_game;
    private Draw e_draw;
    private Gameplay e_gameplay;

    private Point e_mousePosition;
    Event(Game game, Draw draw, Gameplay gameplay){
        this.e_game = game;
        this.e_draw = draw;
        this.e_gameplay = gameplay;
        this.e_mousePosition = new Point();
    }

    public void mouseMoved(MouseEvent e){
        if(this.e_game.getScene() == 6){
            this.setMousePosition(e);
            this.e_gameplay.Update(false, this.e_mousePosition.x, this.e_mousePosition.y);
            this.e_draw.repaint();
        }
    }
    public void mouseClicked(MouseEvent e){
        if(this.e_game.getScene() == 6){
            this.setMousePosition(e);
            this.e_gameplay.Update(true, this.e_mousePosition.x, this.e_mousePosition.y);
            this.e_draw.repaint();
        }
    }

    public void setMousePosition(MouseEvent e){
        if(this.e_game.getScene() == 6){
            PointerInfo a;
            a = MouseInfo.getPointerInfo();
            Point p = new Point(a.getLocation());
            SwingUtilities.convertPointFromScreen(p, e.getComponent());
            this.e_mousePosition.x=(int) p.getX();
            this.e_mousePosition.y=(int) p.getY();
            //this.e_mousePosition.x -= 7;
            //this.e_mousePosition.y -= 28;
        }
    }
}
