import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero {
    private BufferedImage h_card1;
    private BufferedImage h_card2;
    private BufferedImage h_card3;
    private BufferedImage h_card4;
    private BufferedImage h_card5;
    private BufferedImage h_card6;
    private BufferedImage h_card7;
    private BufferedImage h_card8;
    private BufferedImage h_card1small;
    private BufferedImage h_card2small;
    private BufferedImage h_card3small;
    private BufferedImage h_card4small;
    private BufferedImage h_card5small;
    private BufferedImage h_card6small;
    private BufferedImage h_card7small;
    private BufferedImage h_card8small;

    private Game h_game;

    Hero(Game game) throws IOException {
        this.h_game = game;


        //this.InitializeCard(hero);

    }

    public Image getCard1() {
        return this.h_card1;
    }

    public Image getCard2() {
        return this.h_card2;
    }

    public Image getCard3() {
        return this.h_card3;
    }

    public Image getCard4() {
        return this.h_card4;
    }

    public Image getCard5() {
        return this.h_card5;
    }

    public Image getCard6() {
        return this.h_card6;
    }

    public Image getCard7() {
        return this.h_card7;
    }

    public Image getCard8() {
        return this.h_card8;
    }

    public Image getCard1small() {
        return this.h_card1small;
    }

    public Image getCard2small() {
        return this.h_card2small;
    }

    public Image getCard3small() {
        return this.h_card3small;
    }

    public Image getCard4small() {
        return this.h_card4small;
    }

    public Image getCard5small() {
        return this.h_card5small;
    }

    public Image getCard6small() {
        return this.h_card6small;
    }

    public Image getCard7small() {
        return this.h_card7small;
    }

    public Image getCard8small() {
        return this.h_card8small;
    }

    public void InitializeCard(int hero) {
        try {
            if (hero == 1) {
                this.h_card1 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card2 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card3 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card4 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card5 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card6 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card7 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card8 = ImageIO.read(new File("Hero\\1\\Bohater1Karta1.png"));
                this.h_card1small = ImageIO.read(new File("Hero\\1\\Bohater1Karta1small.png"));
                this.h_card2small = ImageIO.read(new File("Hero\\1\\Bohater1Karta2small.png"));
                this.h_card3small = ImageIO.read(new File("Hero\\1\\Bohater1Karta3small.png"));
                this.h_card4small = ImageIO.read(new File("Hero\\1\\Bohater1Karta4small.png"));
                this.h_card5small = ImageIO.read(new File("Hero\\1\\Bohater1Karta5small.png"));
                this.h_card6small = ImageIO.read(new File("Hero\\1\\Bohater1Karta6small.png"));
                this.h_card7small = ImageIO.read(new File("Hero\\1\\Bohater1Karta7small.png"));
                this.h_card8small = ImageIO.read(new File("Hero\\1\\Bohater1Karta8small.png"));

            }
            if (hero == 2) {
                this.h_card1 = ImageIO.read(new File("Hero\\2\\Bohater2Karta1.png"));
                this.h_card2 = ImageIO.read(new File("Hero\\2\\Bohater2Karta2.png"));
                this.h_card3 = ImageIO.read(new File("Hero\\2\\Bohater2Karta3.png"));
                this.h_card4 = ImageIO.read(new File("Hero\\2\\Bohater2Karta4.png"));
                this.h_card5 = ImageIO.read(new File("Hero\\2\\Bohater2Karta5.png"));
                this.h_card6 = ImageIO.read(new File("Hero\\2\\Bohater2Karta6.png"));
                this.h_card7 = ImageIO.read(new File("Hero\\2\\Bohater2Karta7.png"));
                this.h_card8 = ImageIO.read(new File("Hero\\2\\Bohater2Karta8.png"));
                this.h_card1small = ImageIO.read(new File("Hero\\2\\Bohater2Karta1small.png"));
                this.h_card2small = ImageIO.read(new File("Hero\\2\\Bohater2Karta2small.png"));
                this.h_card3small = ImageIO.read(new File("Hero\\2\\Bohater2Karta3small.png"));
                this.h_card4small = ImageIO.read(new File("Hero\\2\\Bohater2Karta4small.png"));
                this.h_card5small = ImageIO.read(new File("Hero\\2\\Bohater2Karta5small.png"));
                this.h_card6small = ImageIO.read(new File("Hero\\2\\Bohater2Karta6small.png"));
                this.h_card7small = ImageIO.read(new File("Hero\\2\\Bohater2Karta7small.png"));
                this.h_card8small = ImageIO.read(new File("Hero\\2\\Bohater2Karta8small.png"));
            }
            if (hero == 3) {
                this.h_card1 = ImageIO.read(new File("Hero\\3\\Bohater3Karta1.png"));
                this.h_card2 = ImageIO.read(new File("Hero\\3\\Bohater3Karta2.png"));
                this.h_card3 = ImageIO.read(new File("Hero\\3\\Bohater3Karta3.png"));
                this.h_card4 = ImageIO.read(new File("Hero\\3\\Bohater3Karta4.png"));
                this.h_card5 = ImageIO.read(new File("Hero\\3\\Bohater3Karta5.png"));
                this.h_card6 = ImageIO.read(new File("Hero\\3\\Bohater3Karta6.png"));
                this.h_card7 = ImageIO.read(new File("Hero\\3\\Bohater3Karta7.png"));
                this.h_card8 = ImageIO.read(new File("Hero\\3\\Bohater3Karta8.png"));
                this.h_card1small = ImageIO.read(new File("Hero\\3\\Bohater3Karta1small.png"));
                this.h_card2small = ImageIO.read(new File("Hero\\3\\Bohater3Karta2small.png"));
                this.h_card3small = ImageIO.read(new File("Hero\\3\\Bohater3Karta3small.png"));
                this.h_card4small = ImageIO.read(new File("Hero\\3\\Bohater3Karta4small.png"));
                this.h_card5small = ImageIO.read(new File("Hero\\3\\Bohater3Karta5small.png"));
                this.h_card6small = ImageIO.read(new File("Hero\\3\\Bohater3Karta6small.png"));
                this.h_card7small = ImageIO.read(new File("Hero\\3\\Bohater3Karta7small.png"));
                this.h_card8small = ImageIO.read(new File("Hero\\3\\Bohater3Karta8small.png"));
            }
            if (hero == 4) {
                this.h_card1 = ImageIO.read(new File("Hero\\4\\Bohater4Karta1.png"));
                this.h_card2 = ImageIO.read(new File("Hero\\4\\Bohater4Karta2.png"));
                this.h_card3 = ImageIO.read(new File("Hero\\4\\Bohater4Karta3.png"));
                this.h_card4 = ImageIO.read(new File("Hero\\4\\Bohater4Karta4.png"));
                this.h_card5 = ImageIO.read(new File("Hero\\4\\Bohater4Karta5.png"));
                this.h_card6 = ImageIO.read(new File("Hero\\4\\Bohater4Karta6.png"));
                this.h_card7 = ImageIO.read(new File("Hero\\4\\Bohater4Karta7.png"));
                this.h_card8 = ImageIO.read(new File("Hero\\4\\Bohater4Karta8.png"));
                this.h_card1small = ImageIO.read(new File("Hero\\4\\Bohater4Karta1small.png"));
                this.h_card2small = ImageIO.read(new File("Hero\\4\\Bohater4Karta2small.png"));
                this.h_card3small = ImageIO.read(new File("Hero\\4\\Bohater4Karta3small.png"));
                this.h_card4small = ImageIO.read(new File("Hero\\4\\Bohater4Karta4small.png"));
                this.h_card5small = ImageIO.read(new File("Hero\\4\\Bohater4Karta5small.png"));
                this.h_card6small = ImageIO.read(new File("Hero\\4\\Bohater4Karta6small.png"));
                this.h_card7small = ImageIO.read(new File("Hero\\4\\Bohater4Karta7small.png"));
                this.h_card8small = ImageIO.read(new File("Hero\\4\\Bohater4Karta8small.png"));
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Success of initialize Player Card");
    }
}
