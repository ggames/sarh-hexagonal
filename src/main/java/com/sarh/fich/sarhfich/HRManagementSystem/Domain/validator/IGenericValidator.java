package com.sarh.fich.sarhfich.HRManagementSystem.Domain.validator;

import com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions.ApiUnprocessableEntity;

public interface IGenericValidator<E> {

    void validator(E object) throws ApiUnprocessableEntity;

}
