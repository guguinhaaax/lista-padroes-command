import java.io.Serializable;

class Light implements Serializable {
    public void on() { System.out.println("Light is ON"); }
    public void off() { System.out.println("Light is OFF"); }
}

class TV implements Serializable {
    public void on() { System.out.println("TV is ON"); }
    public void off() { System.out.println("TV is OFF"); }
    public void setInputChannel() { System.out.println("TV Channel set"); }
    public void setVolume() { System.out.println("TV Volume set"); }
}

class CeilingFan implements Serializable {
    public void high() { System.out.println("Fan is on HIGH"); }
    public void medium() { System.out.println("Fan is on MEDIUM"); }
    public void low() { System.out.println("Fan is on LOW"); }
    public void off() { System.out.println("Fan is OFF"); }
    public void getSpeed() { System.out.println("Getting Fan Speed..."); }
}

class GarageDoor implements Serializable {
    public void up() { System.out.println("Garage Door is UP"); }
    public void down() { System.out.println("Garage Door is DOWN"); }
    public void stop() { System.out.println("Garage Door STOPPED"); }
}

class Sound implements Serializable {
    public void on() { System.out.println("Sound system is ON"); }
    public void off() { System.out.println("Sound system is OFF"); }
    public void setCd() { System.out.println("Sound set to CD"); }
    public void setDvd() { System.out.println("Sound set to DVD"); }
    public void setRadio() { System.out.println("Sound set to Radio"); }
    public void setVolume() { System.out.println("Sound Volume set"); }
}

class HotTub implements Serializable {
    public void circulate() { System.out.println("HotTub is circulating"); }
    public void jetsOn() { System.out.println("HotTub Jets ON"); }
    public void jetsOff() { System.out.println("HotTub Jets OFF"); }
    public void setTemperature() { System.out.println("HotTub Temperature set"); }
}

class SecurityControl implements Serializable {
    public void arm() { System.out.println("Security System ARMED"); }
    public void disarm() { System.out.println("Security System DISARMED"); }
}