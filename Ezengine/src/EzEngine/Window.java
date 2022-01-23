package EzEngine;

import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class Window {
    public Vector2 size;
    public String title;
    public long window;
    public Color BackgroundColor;
    public boolean isfullscreen;
    long fullscreen;


    public Window(Vector2 size,String title,boolean isfullscreen,Color BackgroundColor){
        this.size = size;
        this.title = title;
        this.isfullscreen = isfullscreen;
        this.BackgroundColor = BackgroundColor;
    }
    public void Run(){
        init();
        Loop();

    }
    void init(){
        if(!glfwInit()){
            System.err.println("GLFW Not Initilized");
        }
        if(isfullscreen){
            fullscreen = glfwGetPrimaryMonitor();
        }
        if(!isfullscreen){
            fullscreen =0;
        }
        window = glfwCreateWindow((int) size.x,(int) size.y,title,fullscreen,0);

        glfwMakeContextCurrent(window);
        glfwSwapInterval(1);
        glfwShowWindow(window);

        GL.createCapabilities();
    }

    void Loop(){
        while (!glfwWindowShouldClose(window)){
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            glfwSwapBuffers(window);

            glClearColor(BackgroundColor.r,BackgroundColor.g,BackgroundColor.b,BackgroundColor.a);
            glfwPollEvents();
        }
    }

}
