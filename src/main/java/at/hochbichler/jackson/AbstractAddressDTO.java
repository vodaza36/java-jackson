package at.hochbichler.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class AbstractAddressDTO {
    @JsonProperty("street")
    private String streetName;
    @JsonProperty("houseno")
    private String streetNumber;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private int zip;


}
