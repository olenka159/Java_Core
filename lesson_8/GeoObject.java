package lesson_8;



import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoObject {
    @JsonProperty("locality")
    Locality LocalityObject;

    public Locality getLocalityObject() {
        return LocalityObject;
    }

    public void setLocalityObject(Locality localityObject) {
        LocalityObject = localityObject;
    }

}