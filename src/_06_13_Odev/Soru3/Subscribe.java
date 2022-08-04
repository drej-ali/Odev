package _06_13_Odev.Soru3;

public class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public Subscribe(String name, boolean doYouWanaSubscribe) {
        setName(name);
        setDoYouWanaSubscribe(doYouWanaSubscribe);
    }

    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        setName(name);
        setDoYouWanaSubscribe(doYouWanaSubscribe);
        setWhichMember(whichMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        if (doYouWanaSubscribe==false)
            System.out.println("**Welcome to membership "+getName()+". Your membership is 10 dollar for month you can enjoy the videos.");
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        if (whichMember.equalsIgnoreCase("Gold"))
            System.out.println("**Welcome to membership "+getName()+". Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.");
        if (whichMember.equalsIgnoreCase("Sılver"))
            System.out.println("**Welcome to membership "+getName()+". Your membership is 20 dollar for month you can enjoy the videos and all homework.");
        if (whichMember.equalsIgnoreCase("Bronze"))
            System.out.println("**Welcome to membership "+getName()+". Your membership is 10 dollar for month you can enjoy the videos.");

        this.whichMember = whichMember;
    }
}
