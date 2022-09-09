package com.cg.cropdeal.cropitem.service;
/*
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.cropdeal.cropitem.repository.cropItemRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
/*
@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = {updatecropItemTest.class})
public class updatecropItemTest {
	@InjectMocks
	private cropItemService cropitemService;
	@Autowired
	private ObjectMapper objectMapper;
	@Mock
	private cropItemRepository cropitemRepository;

	 @Test
     public void givenUpdatedcropItem_whenUpdatecropItem_thenReturnUpdatecropItemObject() throws Exception{
         // given - precondition or setup
         long cropitemId = 1L;
         cropItem savedcropItem = cropItem.builder()
         		 .cropName("jawar")
                  .cropType("cereal")
                  .cropQnt("1kg")
                  .cropPrice("100")
                  .build();

         cropItem updatedcropItem = cropItem.builder()
         		 .cropName("Bajra")
                  .cropType("cereal")
                  .cropQnt("1kg")
                  .cropPrice("100")
                  .build();
         given(cropitemService.getcropItemById(cropitemId)).willReturn(Optional.of(savedcropItem));
         given(cropitemService.updatecropItem(any(cropItem.class)))
                 .willAnswer((invocation)-> invocation.getArgument(0));

         // when -  action or the behaviour that we are going test
         ResultActions response = mockMvc.perform(put("/api/cropitems/{id}", cropitemId)
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content(objectMapper.writeValueAsString(updatedcropItem)));


         // then - verify the output
         response.andExpect(status().isOk())
                 .andDo(print())
                 .andExpect(jsonPath("$.cropName", is(updatedcropItem.getCropname())))
                 .andExpect(jsonPath("$.cropType", is(updatedcropItem.getCroptype())))
                 .andExpect(jsonPath("$.cropQnt", is(updatedcropItem.getCropqnt())))
                 .andExpect(jsonPath("$.cropPrice", is(updatedcropItem.getCropprice())));
     }

 // JUnit test for update employee REST API - negative scenario
 @Test
 public void givenUpdatedcropItem_whenUpdatecropItem_thenReturn404() throws Exception{
     // given - precondition or setup
     long cropitemId = 1L;
     cropItem savedcropItem = cropItem.builder()
     		.cropName("jawar")
             .cropType("cereal")
             .cropQnt("1kg")
             .cropPrice("100")
             .build();

     cropItem updatedcropItem = cropItem.builder()
     		.cropName("Bajra")
             .cropType("cereal")
             .cropQnt("1kg")
             .cropPrice("100")
             .build();
     given(cropitemService.getcropItemById(cropitemId)).willReturn(Optional.empty());
     given(cropitemService.updatecropItem(any(cropItem.class)))
             .willAnswer((invocation)-> invocation.getArgument(0));

     // when -  action or the behaviour that we are going test
     ResultActions response = mockMvc.perform(put("/api/cropitems/{id}", cropitemId)
             .contentType(MediaType.APPLICATION_JSON)
             .content(objectMapper.writeValueAsString(updatedcropItem)));

     // then - verify the output
     response.andExpect(status().isNotFound())
             .andDo(print());
 }

}*/
