package com.sample;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getSoftwareEngineers();
    }

    @PostMapping
    public SoftwareEngineer addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){

        return softwareEngineerService.addNewSoftwareEngineer(softwareEngineer);
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer id){
        return  softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PatchMapping("{id}")
    public SoftwareEngineer updateSoftwareEngineer(@PathVariable Integer id,@RequestBody SoftwareEngineer softwareEngineer){

        return softwareEngineerService.updateSoftwareEngineer(id, softwareEngineer);
    }

    @DeleteMapping("{id}")
    public void deleteSoftwareEngineer(@PathVariable Integer id){

        softwareEngineerService.deleteSoftwareEngineer(id);
    }
}
