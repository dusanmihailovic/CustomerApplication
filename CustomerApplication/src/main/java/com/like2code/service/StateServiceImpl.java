package com.like2code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.like2code.model.State;

@Service("customerService")
public class StateServiceImpl implements StateService {
	
	public List<State> findAllStates(){
		
		List<State> states = new ArrayList <State>();
		
		State eng = new State();
		eng.setDesc("England");
		states.add(eng);
		
		State ser = new State();
		ser.setDesc("Serbia");
		states.add(ser);
		
		State fra = new State();
		fra.setDesc("France");
		states.add(fra);
		
		return states;
	}

}
