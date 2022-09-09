package com.cg.cropdeal.cropitem.service;
/*
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cg.cropdeal.cropitem.model.cropItem;
import com.cg.cropdeal.cropitem.repository.cropItemRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
/*
@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = {savecropItemTest.class})
public class savecropItemTest {

	@Autowired
    private MockMvc mockMvc;
		
		@InjectMocks
		private cropItemService cropitemService;
		@Autowired
		private ObjectMapper objectMapper;
		@Mock
		private cropItemRepository cropitemRepository;

		List<cropItem> list=new ArrayList<>();

		cropItem createcropItem() {
			var cropitem=new cropItem();
			cropitem.setId(1L);
			cropitem.setCropname("Bajra");
			cropitem.setCroptype("cereal");
			cropitem.setCropqnt("1kg");
			cropitem.setCropprice("200");
			
			
			 given(cropitemService.savecropItem(any(cropItem.class)))
             .willAnswer((invocation)-> invocation.getArgument(0));

     // when - action or behaviour that we are going test
     ResultActions response = mockMvc.perform(post("/api/cropitems")
         .contentType(MediaType.APPLICATION_JSON)
         .content(objectMapper.writeValueAsString(cropitem)));

     // then - verify the result or output using assert statements
     response.andDo(print()).
             andExpect(status().isCreated())
             .andExpect(jsonPath("$.cropName",
                     is(cropitem.getCropname())))
             .andExpect(jsonPath("$.cropType",
                     is(cropitem.getCroptype())))
             .andExpect(jsonPath("$.cropQnt",
                     is(cropitem.getCropqnt())))
             .andExpect(jsonPath("$.cropPrice",
                     is(cropitem.getCropprice())));

}
}*/
