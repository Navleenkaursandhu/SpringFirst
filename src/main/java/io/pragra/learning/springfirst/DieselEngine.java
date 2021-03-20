package io.pragra.learning.springfirst;

public class DieselEngine implements IEngine{
    private String engineType;


    public DieselEngine(String engineType) {
        this.engineType = engineType;
    }


    public String getEngineType() {
        return engineType;
    }

    public double getEnginePower(){
        return 400;
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
