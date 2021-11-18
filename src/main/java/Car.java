import enums.Segment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private Segment segment;
    private List<Dimension> dimensions;

    public void printCountryOfBMWProducer(List<Car> cars) {
        cars
                .stream()
                .filter(car -> car.producer.getBrand().equals("BMW"))
                .filter(car -> car.dimensions.get(0).getTrunkCapacity() > 300)
                .filter(car -> car.isAutomaticGear)
                .map(car -> car.market.getCountries())
                .forEach(countries -> {
                    for (Country country : countries) {
                        System.out.println(country.toString());
                    }
                });
    }
}
