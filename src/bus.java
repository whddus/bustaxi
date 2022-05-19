public class bus{
    int passengerMax=30;
    int passengerCount=0;
    int money=0;
    int busNumber;
    int fuel = 100;
    int speed = 0;
    enum status{
        운행,차고지행
    }
    public static status type;


    public bus() {
        this.busNumber = (int) Math.random()*1000000000;
       bus.type = status.운행;
    }

    public void statusChange() {
        if (fuel < 1){
            bus.type = status.차고지행;
        }else if(fuel < 10){
            System.out.println("주유가 필요하다");
        }
    }

    public void stopWork(){
        bus.type = status.차고지행;
    }

    public void passengerTake() {
        if(passengerCount<passengerMax){
            if(bus.type == status.운행){
                this.passengerCount++;
                this.money+=1000;
            }
        }
    }
    public void changeSpeed(int speedChange){
        if(fuel<10){
            System.out.println("주유량을 확인해 주세요");
        }else{
        this.speed = this.speed + speedChange;
        }
    }
}
