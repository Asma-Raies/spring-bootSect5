package com.asma.makeUp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.asma.makeUp.entities.MakeUp;
import com.asma.makeUp.repos.MakeUpRepository;
@Service
public class MakeUpServiceImpl implements MakeUpService {
	@Autowired
	MakeUpRepository makeUpRepository;
	@Override
	public MakeUp saveMakeUp(MakeUp p) {
	return makeUpRepository.save(p); 
	}
	@Override
	public MakeUp updateMakeUp(MakeUp p) {
	return makeUpRepository.save(p);
	}
	@Override
	public void deleteMakeUp(MakeUp p) {
		makeUpRepository.delete(p);
	}
	 @Override
	public void deleteMakeUpById(Long id) {
		 makeUpRepository.deleteById(id);
	}
	@Override
	public MakeUp getMakeUp(Long id) {
	return makeUpRepository.findById(id).get();
	}
	@Override
	public List<MakeUp> getAllMakeUp() {
	return makeUpRepository.findAll();
	}
	@Override
	public Page<MakeUp> getAllMakeUpParPage(int page, int size) {
	return makeUpRepository.findAll(PageRequest.of(page, size));
	}
}
