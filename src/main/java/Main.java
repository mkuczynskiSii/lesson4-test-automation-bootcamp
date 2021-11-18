import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country france = new Country("France", 'F');
        Country belgium = new Country("Belgium", 'B');
        Country norway = new Country("Norway", 'N');

        List<Country> businessMarketCountryList = new ArrayList<>();
        businessMarketCountryList.add(germany);
        businessMarketCountryList.add(france);
        businessMarketCountryList.add(norway);
        businessMarketCountryList.add(belgium);

        List<Country> cargoMarketCountryList = new ArrayList<>();
        cargoMarketCountryList.add(poland);
        cargoMarketCountryList.add(germany);
        cargoMarketCountryList.add(france);

        List<Country> transportMarketCountryList = new ArrayList<>();
        transportMarketCountryList.add(germany);
        transportMarketCountryList.add(france);
        transportMarketCountryList.add(norway);
        transportMarketCountryList.add(poland);
        transportMarketCountryList.add(belgium);

        List<Country> taxiMarketCountryList = new ArrayList<>();
        taxiMarketCountryList.add(belgium);
        taxiMarketCountryList.add(france);
        taxiMarketCountryList.add(germany);

        List<Country> busMarketCountryList = new ArrayList<>();
        busMarketCountryList.add(poland);
        busMarketCountryList.add(belgium);
        busMarketCountryList.add(norway);

        Market businessMarket = new Market(MarketName.BUSINESS, businessMarketCountryList);
        Market cargoMarket = new Market(MarketName.CARGO, cargoMarketCountryList);
        Market transportMarket = new Market(MarketName.TRANSPORT, transportMarketCountryList);
        Market taxiMarket = new Market(MarketName.TAXI, taxiMarketCountryList);
        Market busMarket = new Market(MarketName.BUS, busMarketCountryList);

        Dimension dimension1 = new Dimension(150, 400, 120);
        List<Dimension> dimension1List = new ArrayList<>();
        dimension1List.add(dimension1);
        Dimension dimension2 = new Dimension(160, 450, 140);
        List<Dimension> dimension2List = new ArrayList<>();
        dimension2List.add(dimension2);
        Dimension dimension3 = new Dimension(170, 480, 150);
        List<Dimension> dimension3List = new ArrayList<>();
        dimension3List.add(dimension3);
        Dimension dimension4 = new Dimension(180, 490, 310);
        List<Dimension> dimension4List = new ArrayList<>();
        dimension4List.add(dimension4);
        Dimension dimension5 = new Dimension(190, 500, 290);
        List<Dimension> dimension5List = new ArrayList<>();
        dimension5List.add(dimension5);
        Dimension dimension6 = new Dimension(200, 510, 450);
        List<Dimension> dimension6List = new ArrayList<>();
        dimension6List.add(dimension6);
        Dimension dimension7 = new Dimension(260, 630, 290);
        List<Dimension> dimension7List = new ArrayList<>();
        dimension7List.add(dimension7);
        Dimension dimension8 = new Dimension(270, 600, 310);
        List<Dimension> dimension8List = new ArrayList<>();
        dimension8List.add(dimension8);
        Dimension dimension9 = new Dimension(260, 1400, 250);
        List<Dimension> dimension9List = new ArrayList<>();
        dimension9List.add(dimension9);
        Dimension dimension10 = new Dimension(280, 1600, 350);
        List<Dimension> dimension10List = new ArrayList<>();
        dimension10List.add(dimension10);

        Producer bmwX3 = new Producer("BMW", "X3");
        Producer bmwZ3 = new Producer("BMW", "Z3");
        Producer bmwCargo = new Producer("BMW", "Cargo");
        Producer bmwTransport = new Producer("BMW", "Transporter");
        Producer audiA8 = new Producer("Audi", "A8");
        Producer citroenCargo = new Producer("Citroen", "Cargo");
        Producer renaultTransport = new Producer("Renault", "TIR");
        Producer mazda7 = new Producer("Mazda", "7");
        Producer mercedesBus = new Producer("Mercedes", "Sprinter");
        Producer daciaCargo = new Producer("Dacia", "Cargo");

        Car car1 = new Car(bmwX3, true, businessMarket, Segment.MEDIUM, dimension4List);
        Car car2 = new Car(bmwZ3, false, businessMarket, Segment.PREMIUM, dimension1List);
        Car car3 = new Car(bmwCargo, false, businessMarket, Segment.MEDIUM, dimension3List);
        Car car4 = new Car(bmwTransport, false, transportMarket, Segment.STANDARD, dimension5List);
        Car car5 = new Car(audiA8, false, taxiMarket, Segment.MEDIUM, dimension6List);
        Car car6 = new Car(citroenCargo, true, cargoMarket, Segment.STANDARD, dimension7List);
        Car car7 = new Car(renaultTransport, false, transportMarket, Segment.MEDIUM, dimension8List);
        Car car8 = new Car(mazda7, true, businessMarket, Segment.PREMIUM, dimension9List);
        Car car9 = new Car(mercedesBus, true, busMarket, Segment.MEDIUM, dimension10List);
        Car car10 = new Car(daciaCargo, false, cargoMarket, Segment.PREMIUM, dimension3List);
        Car car11 = new Car(bmwX3, false, businessMarket, Segment.STANDARD, dimension6List);
        Car car12 = new Car(bmwZ3, false, taxiMarket, Segment.MEDIUM, dimension7List);
        Car car13 = new Car(bmwCargo, false, cargoMarket, Segment.PREMIUM, dimension2List);
        Car car14 = new Car(bmwTransport, false, transportMarket, Segment.MEDIUM, dimension8List);
        Car car15 = new Car(mazda7, false, taxiMarket, Segment.PREMIUM, dimension3List);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);

        Car car = new Car();
        car.printCountryOfBMWProducer(cars);

    }
}
