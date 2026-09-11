public class Driver {
    public static void main(String[] args) {
        // System.out.println("MyDate Demo");

        // MyDate bDay;
        // bDay = new MyDate(3, 19, 1973);
        // System.out.println(bDay.toString());

        Pixel Pixel;
        Pixel = new Pixel(25, 20, 255);
        System.out.println("Pixel Test:\n" + Pixel.toString());


        Icon icon;
        icon = new Icon(5, 5);
        System.out.println("Icon Test 1:\n" + icon.toString());

        icon.setPixel(1, 2, Pixel);
        System.out.println("Icon Test 2:\n" + icon.toString());
    }
}