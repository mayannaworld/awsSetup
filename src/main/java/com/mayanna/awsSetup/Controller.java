package com.mayanna.awsSetup;


import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    AmazonS3 amazonS3;

    @Autowired
    public Controller(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }

    @GetMapping
    public String getSomething() {

        return amazonS3.getRegionName();

    }
}
