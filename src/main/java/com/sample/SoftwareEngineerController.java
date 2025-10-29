package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Naps",
                        Collections.singletonList("kd. node, pythom")
                ),
                new SoftwareEngineer(
                        2,
                        "Kuri",
                        Collections.singletonList("kd. node, java")
                )
        );
    }
}
