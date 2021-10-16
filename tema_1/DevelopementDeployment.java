package tema_1;

public class DevelopementDeployment extends Deployment {

    protected DevelopementDeployment(int id) {
        super(id, LoggingLevel.TRACE);
    }

    @Override
    protected void DeployAddress() {
        setDeployAddress("local");
    }

    @Override
    protected void ServerAddress() {
        setServerAddress("local");
    }

    @Override
    protected void LogConsole() {
        setConsole("log everything");
    }
}
