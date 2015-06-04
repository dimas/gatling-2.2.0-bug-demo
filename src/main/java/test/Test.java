package test;

import io.gatling.core.scenario.Simulation;
import io.gatling.app.Gatling;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        final String[] gatlingCLArgs = new String[]{
                "-m",
                "-sf", ".",
                "-rf", "."
        };

        final Class<Simulation> simulation = (Class<Simulation>) Class.forName("TestScenario");

        Gatling.fromArgs(gatlingCLArgs, scala.Option.apply(simulation));

        Gatling.fromArgs(gatlingCLArgs, scala.Option.apply(simulation));

    }
}
