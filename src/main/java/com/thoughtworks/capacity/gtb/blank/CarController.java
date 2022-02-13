package com.thoughtworks.capacity.gtb.blank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

  private final CarService carService;

  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/")
  public String HelloWorld() {
    return "hello world";
  }

}
