package agh.ics.oop;

public class World {
    public static void run(Direction[] directions){
        System.out.println("Start");
        for(Direction direction : directions){
            switch (direction) {
                case forward:
                    System.out.println("zwierzak idzie do przodu");
                    break;
                case backward:
                    System.out.println("zwierzak idzie do tyłu");
                    break;
                case rightward:
                    System.out.println("zwierzak skręca w prawo");
                    break;
                case leftward:
                    System.out.println("zwierzak skręca w lewo");
                    break;
            }
        }
        System.out.println("Stop");
    }

    public static void convert(String[] elements, Direction[] newElements){
        for(int i = 0; i < elements.length; i++){
            switch (elements[i]) {
                case "f":
                    newElements[i] = Direction.forward;
                    break;
                case "b":
                    newElements[i] = Direction.backward;
                    break;
                case "r":
                    newElements[i] = Direction.rightward;
                    break;
                case "l":
                    newElements[i] = Direction.leftward;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        //System.out.println("system wystartował");
        //int rozmiar = args.length;
        //Direction[] directions = new Direction[rozmiar];
        //convert(args, directions);
        //run(directions);
        //System.out.println("system zakończył działanie");


        Vector2d vector1 = new Vector2d(4,5);
        System.out.println(vector1);

        Vector2d vector2 = new Vector2d(3,1);
        Vector2d vector3 = vector1.add(vector2);
        System.out.println(vector3);

        boolean precedesTest = vector1.precedes(vector2);
        System.out.println(precedesTest);

        boolean followsTest = vector1.follows(vector2);
        System.out.println(followsTest);

    }

}
