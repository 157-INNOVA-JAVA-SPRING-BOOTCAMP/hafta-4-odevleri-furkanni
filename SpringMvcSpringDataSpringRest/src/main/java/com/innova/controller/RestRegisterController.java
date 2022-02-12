package com.innova.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Log4j2
public class RestRegisterController {
    // http://127.0.0.1:8080/client/controller/rest
    @GetMapping("/client/controller/rest")
    @ResponseBody
    public String getRestRegister(){
        String URL="http://localhost:8080/rest/list/";
        RestTemplate restTemplate=new RestTemplate();
        String jsonData=restTemplate.getForObject(URL,String.class);
        log.info(jsonData.toUpperCase());
        return jsonData;
    }

}
