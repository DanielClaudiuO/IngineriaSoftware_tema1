package tema_1;

public class ProductionDeployment extends Deployment{

    protected ProductionDeployment(int Id) {
        super(Id, LoggingLevel.ERROR);
    }

    @Override
    protected void DeployAddress() {
        setDeployAddress("different address form server");
    }

    @Override
    protected void ServerAddress() {
        setServerAddress("different location from deployment");
    }

    @Override
    protected void LogConsole() {
        setConsole("log only errors");
    }
}
