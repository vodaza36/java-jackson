package at.hochbichler.jackson;


import lombok.Data;

@Data
public class AddressDTO {
    private String streetName;
    private String streetNumber;
    private String city;
    private int zip;
}
