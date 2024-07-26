package com.neoteric.nss.customerservice.controller;

import com.neoteric.nss.customerservice.configuration.NeotericProperties;
import com.neoteric.nss.customerservice.model.OTP;
import com.neoteric.nss.customerservice.model.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {


    @Autowired
    NeotericProperties neotericProperties;

    @PostMapping(value = "/userRegistration",
            consumes = {"application/json"},
            produces={"application/json"})

    public OTP userRegistration(@RequestBody UserForm userForm)
    {
        System.out.println("values from properties "+neotericProperties.name);
        System.out.println("values from properties "+neotericProperties.qualification);
        OTP otp=new OTP();
        otp.otp= UUID.randomUUID().toString();
        otp.mobileNumber=userForm.mobileNumber;
        return otp;
    }
}
