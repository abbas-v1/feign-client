package com.esafzay.sample.domainone;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleClient peopleClient;

    public List<PeopleDto> getPeople() {
        log.info("Get people");
        System.out.println("sd logging");
        return peopleClient.getPeople().stream()
                .filter(p -> p.gender() != null && p.gender().equals("Male")).toList();
    }
}
