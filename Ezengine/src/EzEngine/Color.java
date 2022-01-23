package EzEngine;

import java.security.PublicKey;

public class Color {
    public float r;
    public float g;
    public float b;
    public float a;
    public Color(float r,float g,float b){
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = 1;
    }
    public Color(float r,float g,float b,float a){
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public static Color red(){return new Color(0.255f,0,0);}
    public static Color green(){return new Color(0,0.255f,0);}
    public static Color blue(){return new Color(0,0,0.255f);}
    public static Color white(){return new Color(0.255f,0.255f,0.255f);}
    public static Color Black(){return  new Color(0,0,0);}
}
