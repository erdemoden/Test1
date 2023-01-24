package classes.Service;

import classes.Houses.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service {
    Generate generate = new Generate();
    private List<SummerHouse> summerHouses = generate.getListOfSummerHouses();
    private List<Villa> villas = generate.getListOfVillas();
    private List<House> houses = generate.getListOfHouses();
    public int totalPriceOfHouses(){
        int total = houses.stream().mapToInt(i->i.getPrice()).sum();
        return total;
    }
    public int totalPriceOfVillas(){
        int total = villas.stream().mapToInt(i->i.getPrice()).sum();
        return total;
    }
    public int totalPriceOfSummerHouses(){
        int total = summerHouses.stream().mapToInt(i->i.getPrice()).sum();
        return total;
    }
    public int totalPriceOfAllAccommodations(){
        int total = totalPriceOfHouses()+totalPriceOfVillas()+totalPriceOfSummerHouses();
        return total;
    }
    public int averageSquareMeterOfHouses(){
    int avg = houses.stream().mapToInt(i-> i.getSquareMeters()).sum()/houses.size();
    return avg;
    }
    public int averageSquareMeterOfVillas(){
        int avg = villas.stream().mapToInt(i-> i.getSquareMeters()).sum()/villas.size();
        return avg;
    }
    public int averageSquareMeterOfSummerHouses(){
        int avg = summerHouses.stream().mapToInt(i-> i.getSquareMeters()).sum()/summerHouses.size();
        return avg;
    }
    public int averageSquareMeterOfAllAccommodations(){
        int avg = (averageSquareMeterOfHouses()+averageSquareMeterOfVillas()+averageSquareMeterOfSummerHouses())/3;
        return avg;
    }

    public List<Accommodation> filterByRooms(int roomAmount,int livingRoomAmount){
        List<Accommodation> allhouses = Stream.of(houses,villas,summerHouses).flatMap(Collection::stream).filter(i->i.getRoomCount()==roomAmount&&i.getLivingRoomCount()==livingRoomAmount).collect(Collectors.toList());
    return allhouses;
    }
}
