package EzEngine;

import static org.lwjgl.glfw.GLFW.glfwGetTime;

public class Time {
    static double lastLoopTime;
    public static double getTime(){
        return glfwGetTime();
    }
    public static float deltaTime(){
        double time = getTime();
        float delta = (float) (time - lastLoopTime);
        lastLoopTime = time;
        return delta;
    }
}
