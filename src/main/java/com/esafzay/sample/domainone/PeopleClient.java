package com.esafzay.sample.domainone;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "people", url = "https://ghibliapi.herokuapp.com")
public interface PeopleClient {

  @GetMapping(path = "people")
  List<PeopleDto> getPeople();
}
