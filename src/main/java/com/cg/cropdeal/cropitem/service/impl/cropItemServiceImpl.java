package com.cg.cropdeal.cropitem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cropdeal.cropitem.EmailSenderService;
import com.cg.cropdeal.cropitem.exception.ResourceNotFoundException;
import com.cg.cropdeal.cropitem.model.cropItem;
//import com.cg.cropdeal.cropitem.model.TestcropItem;
import com.cg.cropdeal.cropitem.repository.cropItemRepository;
import com.cg.cropdeal.cropitem.service.cropItemService;


@Service
public class cropItemServiceImpl implements cropItemService{

	private cropItemRepository cropitemRepository;
	
	@Autowired
	EmailSenderService emailsenderService;
	
	public cropItemServiceImpl(cropItemRepository cropitemRepository) {
		super();
		this.cropitemRepository = cropitemRepository;
	}

	@Override
	public cropItem savecropItem(cropItem cropitem) {
		// crop=cropitem.getCropname()+cropitem.getCroptype()+cropitem.getCropprice()+cropitem.getCropqnt();
		 
		 emailsenderService.sendSimpleEmail("divyathorat2255@gmail.com",cropitem.getCropname() +"     "+cropitem.getCroptype()+"     "+cropitem.getCropqnt()+"     "+cropitem.getCropprice(),"This is the new crop added in the list please check......");
			 return cropitemRepository.save(cropitem);
	}
	

	@Override
	public List<cropItem> getAllcropItems() {
		return cropitemRepository.findAll();
	}

	@Override
	public cropItem getcropItemById(long cropid) {
	/*	Optional<cropItem> cropitem=cropitemRepository.findById(cropid);
		
		if(cropitem.isPresent()) {
			return cropitem.get();
		}else {
			throw new ResourceNotFoundException("cropItem","cropId",cropid);
		}*/
		
		return cropitemRepository.findById(cropid).orElseThrow(() -> 
		                      new ResourceNotFoundException("cropItem","cropId",cropid));	
	}

	@Override
	public cropItem updatecropItem(cropItem cropitem, long cropid) {
		
		cropItem existingcropItem=cropitemRepository.findById(cropid).orElseThrow(
				() ->new ResourceNotFoundException("cropItem","cropId",cropid));
		
		existingcropItem.setCropname(cropitem.getCropname());
		existingcropItem.setCroptype(cropitem.getCroptype());
		existingcropItem.setCropqnt(cropitem.getCropqnt());
		existingcropItem.setCropprice(cropitem.getCropprice());
		
		cropitemRepository.save(existingcropItem);
		return existingcropItem;
	}

	@Override
	public void deletecropItem(long cropid) {
		cropitemRepository.findById(cropid).orElseThrow(()->
		        new ResourceNotFoundException("cropItem","cropId",cropid));
		cropitemRepository.deleteById(cropid);
		
	}
	
}
