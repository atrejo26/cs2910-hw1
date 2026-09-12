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

    public String toString() {
        return "rgb(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }
    
    public int getRed() {
        //return red;
    }
    public void setRed(int r) {
        if(r >= 0 && r <= 255) {
            //red = r;
        } else {
            //red = 0;
        }
    }

    public int getGreen() {
        //return green;
    }
    public void setGreen(int g) {
        if(g >= 0 && g <= 255) {
            //green = g;
        } else {
            //green = 0;
        }
    }

    public int getBlue() {
        //return blue;
        int blueMask = 0b00000000000000000000000011111111;
        return (rgb & blueMask);
    }
    public void setBlue(int b) {
        if(b >= 0 && b <= 255) {
            //blue = b;
            //rgb = ???;
        } else {
            //blue = 0;
        }
    }

}
