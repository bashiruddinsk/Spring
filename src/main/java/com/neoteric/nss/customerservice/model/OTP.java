package com.neoteric.nss.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OTP {
    public String otp;
    public String mobileNumber;
}
