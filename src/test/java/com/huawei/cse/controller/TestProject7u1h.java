package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject7u1h {

        Project7u1hDelegate project7u1hDelegate = new Project7u1hDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project7u1hDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}