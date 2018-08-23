package at.hochbichler;

import at.hochbichler.jackson.AddressConverter;
import at.hochbichler.jackson.AddressDTO;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AddressConverter converter = new AddressConverter();
        try {
            AddressDTO dto = converter.toAddressDTO("address.json");
            System.out.println("Address: " + dto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
