package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-12-26T01:49:18.168Z")

@RestSchema(schemaId = "project7u1h")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project7u1hImpl {

    @Autowired
    private Project7u1hDelegate userProject7u1hDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject7u1hDelegate.helloworld(name);
    }

}
