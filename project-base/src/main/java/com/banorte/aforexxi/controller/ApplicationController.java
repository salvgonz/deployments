package com.banorte.aforexxi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

  @Value(value = "${application.util.message}")
  private String message;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ResponseEntity<String> getMessage() {
    
    String response = "{ 'message': '"+ message +"' }";
    
    return new ResponseEntity<String>(response, HttpStatus.OK);
  }
}
