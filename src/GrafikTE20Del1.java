import javax.swing.*;
import java.awt.*;

public class GrafikTE20Del1 extends Canvas {
    Graphics dbg;
    Image image;

    private final int height = 600;
    private final int width = 800;
    int treeX = 200;
    int treeY = 200;

    int amogX = 50;
    int amogY = 50;

    int visirX = 63;
    int visirY = 63;
    public GrafikTE20Del1() {
        JFrame frame = new JFrame("Del 1");
        this.setSize(width, height);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void drawTree(Graphics g, int x, int y) {
        g.setColor(new Color(0x00DD33));
        g.fillRect(x,y,20,40);
        g.setColor(Color.black);
        g.drawRect(x+8,y+40,4,20);
    }
    public void paint(Graphics g) {
        drawTree(g, treeX,treeY);
        drawTree(g, treeX+30,treeY);
        drawTree(g, treeX+60,treeY);
        Amogus(g,amogX,amogY);
        Amogus(g,amogX,amogY+10);
        Amogus(g,amogX,amogY+30);
        Amogus(g,amogX+10,amogY);
        Amogus(g,amogX+10,amogY+15);
        Amogus(g,amogX+16,amogY);
        Amogus(g,amogX+16,amogY+15);
        Amogus(g,amogX+26,amogY+10);
        Amogus(g,amogX+26,amogY+30);
        Amogus(g,amogX+26,amogY);
        Visir(g,visirX,visirY);
    }

    private void Amogus(Graphics g, int x, int y) {
        g.setColor(new Color(0xF50101));
        g.fillRect(x,y,10,20);
    }
    private void Visir (Graphics g, int x, int y) {
        g.setColor(new Color(0x205FE8));
        g.fillRect(x,y,20,10);
    }


    public static void main(String[] args) {
        GrafikTE20Del1 exempel = new GrafikTE20Del1();
    }
}