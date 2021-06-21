package id.co.telkomsel.digitalcore.stub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class Response {
    @NotNull
    private String resp;
}
