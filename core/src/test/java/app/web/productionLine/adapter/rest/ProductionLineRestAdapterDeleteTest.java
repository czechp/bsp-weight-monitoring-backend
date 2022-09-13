package app.web.productionLine.adapter.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.transaction.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@ActiveProfiles({"test"})
class ProductionLineRestAdapterDeleteTest {
    private static final String URL = "/api/production-lines";
    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser(roles = "ADMIN")
    void deleteProductionLineTest() throws Exception {
        //given
        final var productionLineId = 1L;
        final var requestBuilder = MockMvcRequestBuilders.delete(URL + "/{id}", productionLineId);
        //when
        //then
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    @Test
    @WithMockUser(roles = "ADMIN")
    void deleteProductionLineNotFoundTest() throws Exception {
        //given
        final var productionLineId = Long.MAX_VALUE;
        final var requestBuilder = MockMvcRequestBuilders.delete(URL + "/{id}", productionLineId);
        //when
        //then
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    @WithMockUser(roles = "USER")
    void deleteProductionLineAdminOnlyTest() throws Exception {
        //given
        final var productionLineId = Long.MAX_VALUE;
        final var requestBuilder = MockMvcRequestBuilders.delete(URL + "/{id}", productionLineId);
        //when
        //then
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isForbidden());
    }


}
