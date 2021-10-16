package tema_1;

public class DeploymentFactory {
    public static Deployment MakeDeployment(int id, LoggingLevel loggingLevel){
        switch (loggingLevel){
            case TRACE -> {
                return new DevelopementDeployment(id);
            }
            case DEBUG -> {
                return new TestingDeployment(id);
            }
            case ERROR -> {
                return new ProductionDeployment(id);
            }
            default -> {
                return null;
            }
        }
    }
}
