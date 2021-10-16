package tema_1;

import com.company.Card;
import com.company.CardFactory;
import com.company.CardType;

import java.time.Instant;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Deployment deployment1=DeploymentFactory.MakeDeployment(1,LoggingLevel.TRACE);
        Deployment deployment2=DeploymentFactory.MakeDeployment(1,LoggingLevel.DEBUG);
        Deployment deployment3=DeploymentFactory.MakeDeployment(1,LoggingLevel.ERROR);
        System.out.println(deployment1.toString());
        System.out.println(deployment2.toString());
        System.out.println(deployment3.toString());

    }
}
