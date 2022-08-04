package _06_17_Odev.Soru3;

public class Bicycle implements IVehicle{
    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
        setSpeed(speed);
        setGear(gear);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void changeGear(int num) {
        setGear(getGear()+num);
        System.out.println("vites değiştirildi.vites= "+getGear());
    }

    @Override
    public void speedUp(int num) {
        setSpeed(getSpeed()+num);
        System.out.println("hız arttırıldı.hız= "+getSpeed());
    }

    @Override
    public void applyBrakes(int num) {
        setSpeed(getSpeed()-num);
        System.out.println("fren uygunlandı.hız= "+getSpeed());

    }

    @Override
    public String printAll() {
        return "current speed is "+getSpeed()+" gear count is "+getGear();
    }
}
