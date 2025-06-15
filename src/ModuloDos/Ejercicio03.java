package ModuloDos;
import java.awt.Color;

public class Ejercicio03 {
    public static void main(String[] args) {
        int r =(int)(Math.random() * 256);
        int g =(int)(Math.random() * 256);
        int b =(int)(Math.random() * 256);

        Color color =  new Color(r,g,b);

        System.out.printf("Color RGB: (%d,%d,%d)",color.getRed(),color.getGreen(),color.getBlue());

        int num =  97 + (int)(Math.random() *(122-97+1));
        System.out.println("\n" + (char)num);
    }
}
