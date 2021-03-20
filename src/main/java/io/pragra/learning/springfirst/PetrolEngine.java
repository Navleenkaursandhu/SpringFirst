package io.pragra.learning.springfirst;

public class PetrolEngine implements IEngine {

    private String engineType;


    public PetrolEngine(String engineType) {
        this.engineType = engineType;
    }


    public String getEngineType() {
        return engineType;
    }

    public double getEnginePower(){
        return 200;
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
