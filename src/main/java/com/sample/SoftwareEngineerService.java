package com.sample;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(
            SoftwareEngineerRepository softwareEngineerRepository
    ){
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getSoftwareEngineers(){

        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer addNewSoftwareEngineer(SoftwareEngineer softwareEngineer){

        return softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id){

        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + " Not Found"));
    }

    public SoftwareEngineer updateSoftwareEngineer(Integer id, SoftwareEngineer softwareEngineer){

        SoftwareEngineer se = softwareEngineerRepository.findById(id).orElseThrow(() -> new RuntimeException("Engineerr Not Found"));
        se.setName(softwareEngineer.getName());
        se.setTechStack(softwareEngineer.getTechStack());

        return softwareEngineerRepository.save(se);
    }

    public void deleteSoftwareEngineer(Integer id){

        SoftwareEngineer se = softwareEngineerRepository.findById(id).orElseThrow(() -> new RuntimeException("Engineer Not Found"));

        softwareEngineerRepository.deleteById(se.getId());
    }

}
