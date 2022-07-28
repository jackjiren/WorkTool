import java.awt.*;

public class test1 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[]    gs = ge.getScreenDevices();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gs.length; i++) {
            DisplayMode dm = gs[i].getDisplayMode();
            sb.append(i + ", width: " + dm.getWidth() + ", height: " + dm.getHeight() + "\n");
        }
        System.out.println(sb.toString());

    }


    }



