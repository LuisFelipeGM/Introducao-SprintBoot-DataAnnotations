package com.alunos.api.alunos.services;

import com.alunos.api.alunos.models.AlunosModel;
import com.alunos.api.alunos.repositories.AlunosRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AlunosService {

    final
    AlunosRepository alunosRepository;

    public AlunosService(AlunosRepository alunosRepository){
        this.alunosRepository = alunosRepository;
    }

    @Transactional
    public AlunosModel save(AlunosModel alunosModel){
        return alunosRepository.save(alunosModel);
    }

}
