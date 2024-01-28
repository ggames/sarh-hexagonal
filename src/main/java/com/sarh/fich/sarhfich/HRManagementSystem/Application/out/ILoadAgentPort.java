package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;


import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;

public interface ILoadAgentPort {
    
    Agent load(Long id);
}
