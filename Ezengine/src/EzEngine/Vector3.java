package EzEngine;

public class Vector3 {
    public float x;
    public float y;
    public float z;

    public Vector3(){
        x = zero().x;
        y = zero().y;
        z = zero().z;
    }
    public Vector3(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3 zero(){
        return new Vector3(0,0,0);
    }
}
