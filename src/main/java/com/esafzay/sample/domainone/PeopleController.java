package com.esafzay.sample.domainone;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
@Slf4j
public class PeopleController {
  private final PeopleService peopleService;

  @GetMapping
  public List<PeopleDto> getPeople() {
    log.debug("Received get-people");
    return peopleService.getPeople();
  }
}
