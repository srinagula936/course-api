/*package com.harsha;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.harsha.topic.TopicController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ TopicController.class})
public class TopicControllerTest {

	private MockMvc mockMvc;

    private TopicController topicController;

    @Before
    public void setUp() {
       this.mockMvc = MockMvcBuilders.standaloneSetup(TopicController.class).build();
    }

    @Test
    public void testgetAllTopics() throws Exception {
      this.mockMvc.perform(get("/topics"))
           .andExpect(status().isOk());
    }

}
*/