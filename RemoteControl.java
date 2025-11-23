import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> history = new ArrayList<>();

    // Executa o comando e adiciona ao histórico
    public void buttonPressed(Command command) {
        command.execute();
        history.add(command);
    }

    // Método store(): Salva o histórico em arquivo
    public void store() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("log_comandos.ser"))) {
            out.writeObject(history);
            System.out.println("--- Backup realizado com sucesso ---");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método load(): Recupera o histórico e reexecuta as ações
    @SuppressWarnings("unchecked")
    public void load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("log_comandos.ser"))) {
            System.out.println("--- Iniciando Restauração após falha ---");
            
            // Recupera a lista do arquivo
            history = (List<Command>) in.readObject();
            
            // Reexecuta cada comando na ordem
            for (Command command : history) {
                command.execute();
            }
            System.out.println("--- Sistema restaurado ao estado anterior ---");
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}