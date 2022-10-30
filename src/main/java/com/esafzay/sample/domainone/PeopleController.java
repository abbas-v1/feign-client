package com.esafzay.sample.domainone;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PeopleController {
    private final PeopleService peopleService;

    private final PeopleClient peopleClient;

    @GetMapping
    public List<PeopleDto> getPeople() {
        System.out.println("Some logging");
        return peopleService.getPeople();
    }
}
