package com.esafzay.sample.domainone;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PeopleService {

  private final PeopleClient pc;

  public List<PeopleDto> getPeople() {
    log.info("Get people from the feing client");
    return pc.getPeople().stream()
        .filter(p -> p.gender() != null && p.gender().equals("Male"))
        .toList();
  }
}
