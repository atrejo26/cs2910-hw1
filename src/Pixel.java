public class Pixel {
    private int red;
    private int green;
    private int blue;

    public Pixel(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public String toString() {
        return "rgb(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }
    
    public int getRed() {
        return red;
    }
    public void setRed(int r) {
        if(r >= 0 && r <= 255) {
            red = r;
        } else {
            red = 0;
        }
    }

    public int getGreen() {
        return green;
    }
    public void setGreen(int g) {
        if(g >= 0 && g <= 255) {
            green = g;
        } else {
            green = 0;
        }
    }

    public int getBlue() {
        return blue;
    }
    public void setBlue(int b) {
        if(b >= 0 && b <= 255) {
            blue = b;
        } else {
            blue = 0;
        }
    }

}
