public class Pixel {
/*
int x = 255;
int y = x << 8; // y = 65280
int z = y >> 4; // z = 4080

int x = 1431655765;            01010101010101010101010101010101
int mask = 16711680;           00000000111111110000000000000000
int result = x & mask;         00000000010101010000000000000000 
int result = (x & mask) >> 16  00000000000000000000000001010101 // 170
*/

    private int rgb; //   >> shift right    |    << shift left

    private static final int RED_MASK = 0x000000FF;
    private static final int GREEN_MASK = 0x0000FF00;
    private static final int BLUE_MASK = 0x00FF0000;

    // private int red;
    // private int green;
    // private int blue;

    //default constructor if empty
    public Pixel() {
        setRed(0);
        setGreen(0);
        setBlue(0);
        //this(0, 0, 0); 
    }
    //custom constructor
    public Pixel(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public String toStringHex() {
        return String.format("#%02X%02X%02X", getRed(), getGreen(), getBlue());
    }

    public String toString() {
        return "rgb(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }
    
    public int getRed() {
        return rgb & RED_MASK;
        //return red;
    }
    public void setRed(int r) {  //Red: bits 0-7
        if(r >= 0 && r <= 255) {
            rgb = (rgb & ~RED_MASK) | (r & RED_MASK);
            //red = r;
        } else {
            rgb = (rgb & ~ RED_MASK); // set red to 0
            //red = 0;
        }
    }

    public int getGreen() {
        return (rgb & GREEN_MASK) >> 8;
        //return green;
    }
    public void setGreen(int g) {   //Green: bits 8-15
        if(g >= 0 && g <= 255) {
            rgb = (rgb & ~GREEN_MASK) | ((g << 8) & GREEN_MASK);
            //green = g;
        } else {
            rgb = (rgb & ~GREEN_MASK);
            //green = 0;
        }
    }

    public int getBlue() {
        return (rgb & BLUE_MASK) >> 16;
        //return blue;
    }
    public void setBlue(int b) {
        if(b >= 0 && b <= 255) {
            rgb = (rgb & ~BLUE_MASK) | ((b << 16) & BLUE_MASK);
            //blue = b;
            //rgb = ???;
        } else {
            rgb = (rgb & ~BLUE_MASK);
            //blue = 0;
        }
    }

}
