public class taxi {
    int taxiNumber;
    int fuel=20;
    int speed=20;
    String destination;
    int bDistance = 20;
    int toDistance;
    int totalPrice;
    int bPrice = 2000;
    int addPrice=200;
    public enum possible {
        탑승가능, 탑승불가;
    }
    public static possible po;
    public enum status {
        운행, 일반;
    }

    public static status type;

    public taxi(int num) {
        this.taxiNumber = num;
        taxi.type = status.일반;
    }

    public void startDriving(){
        if(fuel>10){
            taxi.type = status.운행;
        }
    }

    public void passengerTake() {
        if(taxi.type == status.일반){
            taxi.po = possible.탑승가능;
            taxi.type = status.운행;
            }else{
            taxi.po = possible.탑승불가;
            }
        }

    public void changeSpeed(int inputSpeed){

        this.speed = this.speed + inputSpeed;

    }

    public void pricePlus(){
        if(toDistance-bDistance>0){
            this.totalPrice = toDistance-bDistance * addPrice;
        }else{
            this.totalPrice = bPrice;
        }
    }

    public void payment(){
        System.out.println(totalPrice);
    }


}








