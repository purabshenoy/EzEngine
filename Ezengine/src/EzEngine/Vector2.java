package EzEngine;

public class Vector2 {
    public float x;
    public float y;

    public Vector2(){
        x = zero().x;
        y = zero().y;
    }
    public Vector2(float x,float y){
        this.x = x;
        this.y = y;
    }
    public Vector2 zero(){
        return new Vector2(0,0);
    }
}
