package com.alunos.api.alunos.repositories;

import com.alunos.api.alunos.models.AlunosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AlunosRepository extends JpaRepository<AlunosModel, UUID> {
}
