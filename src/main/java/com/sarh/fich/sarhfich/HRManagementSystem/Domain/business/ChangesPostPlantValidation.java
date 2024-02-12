package com.sarh.fich.sarhfich.HRManagementSystem.Domain.business;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.*;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;

import java.util.List;


public class ChangesPostPlantValidation {

        private final IRetrievePostPlantPort retrievePostPlant;
        private final IRetrievePostStatusPort retrievePostStatus;
        private final IRetrievePositionPort retrievePosition;
        private final IUpdatePostPlantPort updatePostPlant;

        private final IUpdatePositionPort updatePosition;
        public ChangesPostPlantValidation(IRetrievePostPlantPort retrievePostPlant,
                                          IRetrievePostStatusPort retrievePostStatus,
                                          IRetrievePositionPort retrievePositionPort,
                                          IUpdatePostPlantPort updatePostPlant,
                                          IUpdatePositionPort updatePosition) {
                this.retrievePostPlant = retrievePostPlant;
                this.retrievePostStatus = retrievePostStatus;
                this.retrievePosition = retrievePositionPort;
                this.updatePostPlant = updatePostPlant;
                this.updatePosition = updatePosition;
        }

        void changeStatusCargoByAgent(Agent agent, String poststatus){

                PostStatus postStatus = retrievePostStatus.fetchByPostStatus(poststatus);

                if(agent == null){
                    return;
                }

                if(agent.isDeceased()){
                        List<PostPlant> postPlantList = retrievePostPlant.fetchByAgent(agent);
                        postPlantList.forEach(plant ->{
                                Position position = retrievePosition.fetchById(plant.getPosition().getId());
                                position.setPostStatus(postStatus);
                                plant.setTerminationDate(agent.getLeavingDate());

                                updatePosition.update(position);
                                updatePostPlant.update(plant);
                        });

                }

        }


}
