//pa
//ckage com.cg.cropdeal.cropitem.service;
/*
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.cropdeal.cropitem.model.cropItem;
import com.cg.cropdeal.cropitem.repository.cropItemRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
/*
@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = {getcropItemTest.class})
public class getcropItemTest {
	@Autowired
    private MockMvc mockMvc;
		
		@InjectMocks
		private cropItemService cropitemService;
		@Autowired
		private ObjectMapper objectMapper;
		@Mock
		private cropItemRepository cropitemRepository;

		List<cropItem> list=new ArrayList<>();
		
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
}*/