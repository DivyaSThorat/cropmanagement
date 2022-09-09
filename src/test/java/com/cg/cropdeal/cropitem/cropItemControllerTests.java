package com.cg.cropdeal.cropitem;
/*
import com.cg.cropdeal.cropitem.model.cropItem;
import com.cg.cropdeal.cropitem.service.cropItemService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
/*
@WebMvcTest
public class cropItemControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private cropItemService cropitemService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void givencropItemObject_whenCreatecropItem_thenReturnSavedcropItem() throws Exception{

        // given - precondition or setup
        cropItem cropitem = cropItem.builder()
                .cropName("Jawar")
                .cropType("cereal")
                .cropQnt("1Kg")
                .cropPrice("100")
                .build();
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

    // JUnit test for Get All employees REST API
    @Test
    public void givenListOfcropItems_whenGetAllcropItems_thenReturncropItemsList() throws Exception{
        // given - precondition or setup
        List<cropItem> listOfcropItems = new ArrayList<>();
        listOfcropItems.add(cropItem.builder().cropName("Jawar").cropType("cereal").cropQnt("1kg").cropPrice("100").build());
        listOfcropItems.add(cropItem.builder().cropName("Bajra").cropType("cereal").cropQnt("1kg").cropPrice("200").build());
        given(cropitemService.getAllcropItems()).willReturn(listOfcropItems);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/api/cropitems"));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()",
                        is(listOfcropItems.size())));

    }

    // positive scenario - valid employee id
    // JUnit test for GET employee by id REST API
    @Test
    public void givencropItemId_whenGetcropItemById_thenReturncropItemObject() throws Exception{
        // given - precondition or setup
        long cropitemId = 1L;
        cropItem cropitem = cropItem.builder()
                .cropName("jawar")
                .cropType("cereal")
                .cropQnt("1kg")
                .cropPrice("100")
                .build();
        given(cropitemService.getcropItemById(cropitemId)).willReturn(Optional.of(cropitem));

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/api/cropitems/{id}", cropitemId));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.cropName", is(cropitem.getCropname())))
                .andExpect(jsonPath("$.cropType", is(cropitem.getCroptype())))
                .andExpect(jsonPath("$.cropQnt", is(cropitem.getCropqnt())))
                .andExpect(jsonPath("$.cropPrice", is(cropitem.getCropprice())));

    }

    // negative scenario - valid employee id
    // JUnit test for GET employee by id REST API
    @Test
    public void givenInvalidcropItemId_whenGetcropItemById_thenReturnEmpty() throws Exception{
        // given - precondition or setup
        long cropitemId = 1L;
        cropItem cropitem = cropItem.builder()
                .cropName("jawar")
                .cropType("cereal")
                .cropQnt("1kg")
                .cropPrice("100")
                .build();
        given(cropitemService.getcropItemById(cropitemId)).willReturn(Optional.empty());

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/api/cropitems/{id}", cropitemId));

        // then - verify the output
        response.andExpect(status().isNotFound())
                .andDo(print());

    }
    // JUnit test for update employee REST API - positive scenario
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

// JUnit test for delete employee REST API
    @Test
    public void givencropItemId_whenDeletecropItem_thenReturn200() throws Exception{
        // given - precondition or setup
        long employeeId = 1L;
        willDoNothing().given(cropitemService).deletecropItem(cropitemId);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(delete("/api/cropitems/{id}", cropitemId));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print());
    }
}
*/


