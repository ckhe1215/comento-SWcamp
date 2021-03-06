package com.github.homework.program.repository;

import com.github.homework.program.domain.Program;
import com.github.homework.program.model.ProgramViewDetailDto;
import com.github.homework.program.model.ProgramViewDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program, Long>, ProgramCustomRepository {
	List<ProgramViewDetailDto> findAllByName(String name);
	List<ProgramViewDto> findTop10ByOrderByCountDesc();
}