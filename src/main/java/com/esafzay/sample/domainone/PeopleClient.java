package com.esafzay.sample.domainone;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "github", url = "https://api.github.com")
public interface PeopleClient {

  @GetMapping(path = "/users")
  List<PeopleDto> getPeople();
}
