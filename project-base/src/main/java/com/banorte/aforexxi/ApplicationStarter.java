/*
* (C)Copyright 2019, Banorte Afore XXl
*
* Este archivo contiene información que es exclusivo de 
* Banorte Afore XXl y se considera confidencial. 
* Esta estrictamente prohibido copiar o 
* compartir de manera total o parcial en cualquier formato, 
* ya sea mecánico o electrónico.
*
* Nombre de archivo: ApplicationStarter.java
* Autor: salvgonz
* Fecha de creación: 2/07/2019
*/

package com.banorte.aforexxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * The Class ApplicationStarter.
 */
@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker
@EnableHystrixDashboard
public class ApplicationStarter {

  /**
   * The main method.
   *
   * @param args the args
   */
  public static void main(String[] args) {

    SpringApplication.run(ApplicationStarter.class, args);
  }
}
