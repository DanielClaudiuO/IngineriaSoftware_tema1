package tema_1;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public abstract class Deployment {
    private int Id;
    private String DeployAddress;
    private String ServerAddress;
    private LoggingLevel loggingLevel;
    private String Console;

    protected Deployment(int Id, LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
        CreateDeployment();
        LogConsole();
        ServerAddress();
        DeployAddress();
    }

    private void CreateDeployment() {
        this.setId((int) (Math.random() * 10));
    }

    protected abstract void DeployAddress();

    protected abstract void ServerAddress();

    protected abstract void LogConsole();
}
