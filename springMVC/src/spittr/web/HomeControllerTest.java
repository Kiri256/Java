package spittr.web;

import org.junit.Test;
import static org.springframework.test
        .web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test
        .web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test
        .web.servlet.setup.MockMvcBuilders.standaloneSetup;
import org.springframework.test.web.servlet.MockMvc;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
        HomeController homeController=new HomeController();
        MockMvc mockMvc=standaloneSetup(homeController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}