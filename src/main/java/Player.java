import java.awt.*;
import java.io.IOException;

public class Player {
    private String p_nick;
    private int p_hp;
    private int p_mana;

    private Game p_game;
    private Hero p_hero;

    Player(Game game, Hero hero) throws IOException {
        this.p_game = game;
        this.p_hero = hero;

    }

    public void setNick(String nick) {
        this.p_nick = nick;
    }

    public void setHp(int hp) {
        this.p_hp = hp;
    }

    public void setMana(int mana) {
        this.p_mana = mana;
    }

    public String getNick() {
        return this.p_nick;
    }

    public int getHp() {
        return this.p_hp;
    }

    public int getMana() {
        return this.p_mana;
    }

    public Image getCard1() {
        return this.p_hero.getCard1();
    }

    public Image getCard2() {
        return this.p_hero.getCard2();
    }

    public Image getCard3() {
        return this.p_hero.getCard3();
    }

    public Image getCard4() {
        return this.p_hero.getCard4();
    }

    public Image getCard5() {
        return this.p_hero.getCard5();
    }

    public Image getCard6() {
        return this.p_hero.getCard6();
    }

    public Image getCard7() {
        return this.p_hero.getCard7();
    }

    public Image getCard8() {
        return this.p_hero.getCard8();
    }

    public Image getCard1small() {
        return this.p_hero.getCard1small(); }

    public Image getCard2small() {
        return this.p_hero.getCard2small();
    }

    public Image getCard3small() {
        return this.p_hero.getCard3small();
    }

    public Image getCard4small() {
        return this.p_hero.getCard4small();
    }

    public Image getCard5small() {
        return this.p_hero.getCard5small();
    }

    public Image getCard6small() {
        return this.p_hero.getCard6small();
    }

    public Image getCard7small() {
        return this.p_hero.getCard7small();
    }

    public Image getCard8small() {
        return this.p_hero.getCard8small();
    }


    public void InitializePlayer(Hero hero, String nick, int h) {
        this.p_hero = hero;
        this.p_hero.InitializeCard(h);
        this.p_nick = nick;
        this.p_hp = 100;
        this.p_mana = 10;
    }
}
