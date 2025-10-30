package com.iot.dashboard.simulator2.Controller;

import com.iot.dashboard.simulator2.Model.DeviceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DeviceController {
     @Autowired
    private DeviceData deviceData;

     //checking Api
    @GetMapping("/API")
    public static String create(){
        return "hello ";
    }

    //actual work started


}
