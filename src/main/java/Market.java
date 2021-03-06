import enums.MarketName;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Market {
    private MarketName name;
    private List<Country> countries;
}
