package com.esafzay.sample.domainone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "people", url = "https://ghibliapi.herokuapp.com")
public interface PeopleClient {

    @GetMapping(path = "people")
    List<PeopleDto> getPeople();

}
