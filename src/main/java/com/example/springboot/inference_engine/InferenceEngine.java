package com.example.springboot.inference_engine;
import org.apache.spark.ml.regression.RegressionModel;
import org.apache.spark.ml.Transformer;
// import org.apache.spark.ml.regression;
import org.apache.spark.ml.PipelineStage;
import java.util.*;
import org.apache.spark.ml.Model;

public class InferenceEngine {
    // private RegressionModel<Vector,Model> model;
    private PipelineStage model;

    public void setModel(PipelineStage _model){
        model = _model;
    }

    public double getPredicition(){
        return 1.23;
    }
}