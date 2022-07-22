package lesson_7;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lesson.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherJson {
    @JsonProperty("fact")
    Fact FactObject;
    @JsonProperty("geo_object")


    GeoObject GeoObjectObject;

    public Fact getFactObject() {
        return FactObject;
    }

    public void setFactObject(Fact factObject) {
        FactObject = factObject;
    }

    public GeoObject getGeoObjectObject() {
        return GeoObjectObject;
    }

    public void setGeoObjectObject(GeoObject geoObjectObject) {
        GeoObjectObject = geoObjectObject;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Locality {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
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


}