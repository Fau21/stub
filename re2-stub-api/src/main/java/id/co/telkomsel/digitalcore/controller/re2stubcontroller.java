package id.co.telkomsel.digitalcore.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.telkomsel.digitalcore.stub.dto.RE2Notify;
import id.co.telkomsel.digitalcore.stub.dto.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class re2stubcontroller {

    @PostMapping("/re2stub")
    public Response re2stub(@RequestBody RE2Notify request) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        log.info("RE2 Stub for Testing Purpose. "+objectMapper.writeValueAsString(request));
        Response resp = new Response();
        resp.setResp("response stub");
        return resp;
    }
}
