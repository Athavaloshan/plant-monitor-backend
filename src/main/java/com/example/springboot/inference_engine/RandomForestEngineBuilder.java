package com.example.springboot.inference_engine;

import org.apache.spark.ml.regression.RandomForestRegressor;

public class RandomForestEngineBuilder implements EngineBuilder {

    private  InferenceEngine iEngine;

    public RandomForestEngineBuilder(){
        iEngine = new InferenceEngine();
    }

    public void setModel(){
        RandomForestRegressor rf = new RandomForestRegressor()
  .setLabelCol("label")
  .setFeaturesCol("indexedFeatures");
        iEngine.setModel(rf);
    }
    
    public InferenceEngine getEngine() {
        return iEngine;
    }
}