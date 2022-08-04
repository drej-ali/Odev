package _06_13_Odev.Soru4;

public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        setName(name);
        setRoomCount(roomCount);
        setBalconyOrNo(balconyOrNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }
    public static void rent (rentApartments uye){
        if (uye.isBalconyOrNo()==true){
            switch (uye.getRoomCount()){
                case 0:
                    System.out.println("hello "+uye.getName()+" rent:1600");break;
                case 1:
                    System.out.println("hello "+uye.getName()+" rent:1900");break;
                case 2:
                    System.out.println("hello "+uye.getName()+" rent:2400");break;
                case 3:
                    System.out.println("hello "+uye.getName()+" rent:2900");break;
            }
        }
        else {
            switch (uye.getRoomCount()){
                case 0:
                    System.out.println("hello "+uye.getName()+" rent:1400");break;
                case 1:
                    System.out.println("hello "+uye.getName()+" rent:1700");break;
                case 2:
                    System.out.println("hello "+uye.getName()+" rent:2200");break;
                case 3:
                    System.out.println("hello "+uye.getName()+" rent:2700");break;
            }
        }
    }

}
