package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;


import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;

public interface ILoadAgentPort {
    
    Agent load(Long id);
}
