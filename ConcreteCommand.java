// Comando para ligar a Luz
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

// Comando para ligar o Ventilador no Alto
class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}

// Comando para abrir a Garagem
class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;
    
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        garageDoor.up();
    }
}