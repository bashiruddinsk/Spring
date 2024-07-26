package com.neoteric.nss.customerservice.model;

import jdk.jfr.MetadataDefinition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserForm {
    public String mobileNumber;
    public String name;
    public String email;
}
