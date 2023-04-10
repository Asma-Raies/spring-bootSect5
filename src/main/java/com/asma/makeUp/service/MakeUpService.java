package com.asma.makeUp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.asma.makeUp.entities.MakeUp;

public interface MakeUpService {
	MakeUp saveMakeUp(MakeUp p);
	MakeUp updateMakeUp(MakeUp p);
	void deleteMakeUp(MakeUp p);
	 void deleteMakeUpById(Long id);
	 MakeUp getMakeUp(Long id);
	List<MakeUp> getAllMakeUp();
	Page<MakeUp> getAllMakeUpParPage(int page, int size);

}
