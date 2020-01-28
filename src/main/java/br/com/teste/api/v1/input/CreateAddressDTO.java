package br.com.teste.api.v1.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(value = "true")
public class CreateAddressDTO {

    @JsonProperty("street_name")
    @ApiModelProperty(required = true,allowableValues ="Ocean Dr")
    private String streetName;

    @JsonProperty("number")
    @ApiModelProperty(required = true,allowableValues ="555")
    private Integer number;

    @JsonProperty("complement")
    @ApiModelProperty(allowableValues ="Ap 4")
    private String complement;

    @JsonProperty("neighbourhood")
    @ApiModelProperty(required = true,allowableValues ="South Beach")
    private String neighbourhood;

    @JsonProperty("city")
    @ApiModelProperty(required = true,allowableValues ="Miami Beach")
    private String city;

    @JsonProperty("state")
    @ApiModelProperty(required = true,allowableValues ="FL")
    private String state;

    @JsonProperty("country")
    @ApiModelProperty(required = true,allowableValues ="US")
    private String country;

    @JsonProperty("zip_code")
    @ApiModelProperty(required = true,allowableValues ="29582")
    private String zipcode;

    @JsonProperty("latitude")
    @ApiModelProperty(allowableValues ="25.7768972802915")
    private Double latitude;

    @JsonProperty("longitude")
    @ApiModelProperty(allowableValues ="-80.1303725197085")
    private Double longitude;

    public String getStreetName() {
        return streetName;
    }

    public Integer getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
