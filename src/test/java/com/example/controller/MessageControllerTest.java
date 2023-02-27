package com.example.controller;

import com.example.service.MessageService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class MessageControllerTest {

    @Test
    public void testSendMessage() throws Exception {
        // MessageService messageService = Mockito.mock(MessageService.class);

        // MessageController controller = new MessageController(messageService);
        // MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        // String message = "Hello, world!";

        // mockMvc.perform(post("/api/messages")
        //         .contentType(MediaType.TEXT_PLAIN)
        //         .content(message))
        //         .andExpect(status().isOk());

        // Mockito.verify(messageService, Mockito.times(1)).sendMessage(message);
    }
}
