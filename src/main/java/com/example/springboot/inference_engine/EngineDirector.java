package com.example.springboot.inference_engine;

public class EngineDirector {
    private EngineBuilder engineBuilder;

    public void setEngineBuilder(EngineBuilder _engineBuilder) {
        engineBuilder = _engineBuilder;
    }

    public void buildEngine(){
        EngineBuilder engineBuilder = new RegressionEngineBuilder();
        engineBuilder.setModel();
    }

    public InferenceEngine getEngine() {
        return engineBuilder.getEngine();
    }
}