package com.example.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
import java.util.Map;
import java.io.*;
import java.lang.*;
import  org.springframework.http.MediaType;
import java.lang.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.springboot.model.*;
import java.text.SimpleDateFormat;
import com.example.springboot.dao.*;
import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class Controller {

    private final SensorDao sensorDao = new InMemorySensorDao();

    private Integer key = 10;
    
	@GetMapping("/")
	public String index() {
		return "Greetings from price controller!";
	}

    @PostMapping("/write")
    public ResponseEntity<String> addData(@RequestBody Sensor sensor){
        System.out.println("Received data : " + sensor.toString() + " write to db" );
        sensorDao.writeData(sensor);
        return new ResponseEntity<>("Write Successful", HttpStatus.OK);
    }

    
    @GetMapping("/getByIdAndDate/{id}/{date}")
    public ResponseEntity<Sensor> getByIdAndDate(@PathVariable int id, @PathVariable LocalDate date) {
        System.out.println("Get request for id : " + id + " local date : " + date);
        Sensor s = sensorDao.getByIdAndDate(id, date);
        return new ResponseEntity<Sensor>(s, HttpStatus.OK);
    }

    @DeleteMapping("/deleteByIdAndDate/{id}/{date}")
    public ResponseEntity<String> deleteDataById(@PathVariable int id, @PathVariable LocalDate date){
        System.out.println("Delete request for id : " + id + " local date : " + date);
        sensorDao.deleteByIdAndDate(id, date);
        return new ResponseEntity<>("Delete Successful", HttpStatus.OK);
    }

    @GetMapping("/getPredicition")
    public ResponseEntity<Double> getPredicition(){
        return new ResponseEntity<>(12.22, HttpStatus.OK);
    }

}
