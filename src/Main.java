public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor()); // also prints blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // now prints red
        System.out.println(anotherHouse.getColor()); // also prints red

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // prints red
        System.out.println(greenHouse.getColor()); // this one prints green
        System.out.println(anotherHouse.getColor()); // this also prints green

        new House("red");
    }
}
