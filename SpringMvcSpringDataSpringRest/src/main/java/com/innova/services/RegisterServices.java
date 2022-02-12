package com.innova.services;

import com.innova.dto.RegisterDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegisterServices {

    //http://localhost:8080/rest/list/
    @GetMapping(value = "/rest/list/")
    public List<RegisterDto> getUserList(){
        List<RegisterDto> RegisterDtoList=new ArrayList<>();
        RegisterDtoList.add(RegisterDto.builder().userName("ali").userSurname("ali").emailAddress("ali@ali.com").userPassword("111111").build());
        RegisterDtoList.add(RegisterDto.builder().userName("veli").userSurname("veli").emailAddress("veli@veli.com").userPassword("222222").build());
        RegisterDtoList.add(RegisterDto.builder().userName("hasan").userSurname("hasan").emailAddress("hasan@hasan.com").userPassword("333333").build());
        RegisterDtoList.add(RegisterDto.builder().userName("hüseyin").userSurname("hüseyin").emailAddress("hüseyin@hüseyin.com").userPassword("444444").build());
        return RegisterDtoList;
    }
}
