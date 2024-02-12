package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;

public interface IUpdatePointUseCase {
    
    boolean updatePoint(Long id, PointCommand command);

}
