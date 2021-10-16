package tema_1;

public class TestingDeployment extends Deployment{

    protected TestingDeployment(int Id) {
        super(Id, LoggingLevel.DEBUG);
    }

    @Override
    protected void DeployAddress() {
        setDeployAddress("anywhere");
    }

    @Override
    protected void ServerAddress() {
        setServerAddress("anywhere");
    }

    @Override
    protected void LogConsole() {
        setConsole("log only exceptions");
    }
}
