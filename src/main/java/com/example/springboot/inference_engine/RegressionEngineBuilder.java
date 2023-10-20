package com.example.springboot.inference_engine;

import org.apache.spark.ml.regression.LinearRegression;
import org.apache.spark.ml.regression.LinearRegressionModel;

public class RegressionEngineBuilder implements EngineBuilder {
    private  InferenceEngine iEngine;

    public RegressionEngineBuilder(){
        iEngine = new InferenceEngine();
    }

    public void setModel(){
        LinearRegression lr = new LinearRegression()
                            .setMaxIter(10)
                            .setRegParam(0.3)
                            .setElasticNetParam(0.8);
        // LinearRegressionModel model = new LinearRegressionModel();
        iEngine.setModel(lr);
    }
    
    public InferenceEngine getEngine() {
        return iEngine;
    }
}