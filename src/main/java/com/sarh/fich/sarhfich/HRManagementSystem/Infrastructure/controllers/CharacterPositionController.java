package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.CharacterPositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/characters")
public class CharacterPositionController {

    private final ICreateCharacterPositionUseCase saveCharacterPosition;

    private final IUpdateCharacterPositionUseCase updateCharacterPositionPort;

    private final IRetrieveCharacterPositionUseCase retrieveCharacterPosition;

    public CharacterPositionController(ICreateCharacterPositionUseCase saveCharacterPosition,
                                       IUpdateCharacterPositionUseCase updateCharacterPositionPort,
                                       IRetrieveCharacterPositionUseCase retrieveCharacterPosition) {
        this.saveCharacterPosition = saveCharacterPosition;
        this.updateCharacterPositionPort = updateCharacterPositionPort;
        this.retrieveCharacterPosition = retrieveCharacterPosition;
    }


    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CharacterPosition>> getAllCharacterPosition() {

        return ResponseEntity.ok(retrieveCharacterPosition.getAllCharactersPositions());
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody  CharacterPosition characterPosition){

        CharacterPositionCommand command = CharacterPositionCommand.builder()
                .nameCharacter(characterPosition.getName())
                .characterPosition(characterPosition.getCharacterPosition())
                .build();
        saveCharacterPosition.saveCharacterPosition(command);
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable("id")  Long id, @RequestBody CharacterPosition character ){
        CharacterPositionCommand command = CharacterPositionCommand.builder()
                .nameCharacter(character.getName())
                .characterPosition(character.getCharacterPosition()).build();

        updateCharacterPositionPort.updateCharecterPosition(id, command);
    }

}
