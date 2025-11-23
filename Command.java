import java.io.Serializable;

// Interface comum para todos os comandos
public interface Command extends Serializable {
    void execute();
}