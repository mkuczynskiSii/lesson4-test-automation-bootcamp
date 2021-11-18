import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Country {
    private String countryName;
    private char countrySign;

    @Override
    public String toString() {
        return countryName + " - " + countrySign;
    }
}
