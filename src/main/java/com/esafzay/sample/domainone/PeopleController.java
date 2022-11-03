package com.esafzay.sample.domainone;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PeopleController {
  private final PeopleService PeopleService;

  @GetMapping
  public List<PeopleDto> getPeople() {
    System.out.println("Some logging");
    return PeopleService.getPeople();
  }
}
