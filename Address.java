public class Address{
    private String city;
    private String country;
    private String street;
    private String postalCode;

    public Address(String city, String country, String street, String postalCode){
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
    }

    public void changeAdress(String city, String country, String street, String postalCode){
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
    }

}