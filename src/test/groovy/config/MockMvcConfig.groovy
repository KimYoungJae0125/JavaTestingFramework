package config

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

@WebMvcTest
class MockMvcConfig extends Specification{

    protected MockMvc mockMvc

    def setMockMvc(Object controllerInstance) {
        this.mockMvc = MockMvcBuilders.standaloneSetup(controllerInstance).build()
    }

}
