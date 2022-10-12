package agh.ics.oop;

public class Vector2d {
    final int x;
    final int y;

    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(%d, %d)".formatted(x,y);
    }

    public boolean precedes(Vector2d other){
        if (x <= other.x && y <= other.y){
            return true;
        }
        return false;
    }

    public boolean follows(Vector2d other){
        if (x >= other.x && y >= other.y){
            return true;
        }
        return false;
    }

    public Vector2d add(Vector2d other){
        return new Vector2d(x + other.x, y + other.y);
    }

    public Vector2d subtract(Vector2d other){
        return new Vector2d(x - other.x, y - other.y);
    }
}
