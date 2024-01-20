package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;


import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;

public interface ISaveAgentPort {
    
    void save(Agent agent);
}
