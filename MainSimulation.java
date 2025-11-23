public class MainSimulation {
    public static void main(String[] args) {
        // 1. Instanciação dos dispositivos
        Light livingRoomLight = new Light();
        CeilingFan fan = new CeilingFan();
        GarageDoor garage = new GarageDoor();

        // 2. Instanciação dos comandos
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command fanHigh = new CeilingFanHighCommand(fan);
        Command garageUp = new GarageDoorUpCommand(garage);

        // 3. Configuração do Controle
        RemoteControl remote = new RemoteControl();

        System.out.println("### CENÁRIO 1: Utilizando os dispositivos ###");
        remote.buttonPressed(lightOn); // Liga luz
        remote.buttonPressed(fanHigh); // Liga ventilador
        remote.buttonPressed(garageUp); // Abre garagem

        // 4. O sistema salva o estado (Store)
        remote.store();

        System.out.println("\n### CENÁRIO 2: Pane Elétrica (Sistema reiniciando...) ###");
        
        // Simulamos um novo controle remoto "zerado" após a reinicialização
        RemoteControl recoveredRemote = new RemoteControl();
        
        // 5. O sistema carrega o histórico e recupera o estado (Load)
        recoveredRemote.load();
    }
}