package classes.Houses;

public class Accommodation {
    private int roomCount;
    private int livingRoomCount;
    private int price;
    private int squareMeters;

    public Accommodation(int roomCount, int livingRoomCount, int price, int squareMeters) {
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
        this.price = price;
        this.squareMeters = squareMeters;
    }
    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }
}
