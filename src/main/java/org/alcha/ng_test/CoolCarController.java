package org.alcha.ng_test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created By: Alcha
 * Created On: 2019/02/02/13/2019 @ 02:48
 */
@RestController
public class CoolCarController {
  private CarRepository mRepository;
  public CoolCarController(CarRepository repository) {
    mRepository = repository;
  }

  @GetMapping("/cool-cars")
  @CrossOrigin(origins = "http://localhost:4200")
  public Collection<Car> coolCars() {
    return mRepository.findAll().stream()
            .filter(this::isCool)
            .collect(Collectors.toList());
  }

  private boolean isCool(Car car) {
    return !car.getName().equals("AMC Gremlin") &&
            !car.getName().equals("Triumph Stag") &&
            !car.getName().equals("Ford Pinto") &&
            !car.getName().equals("Yugo GV");
  }
}
