
package com.example.springboot.inference_engine;

public interface EngineBuilder {
    public void setModel();
    public InferenceEngine getEngine();

}