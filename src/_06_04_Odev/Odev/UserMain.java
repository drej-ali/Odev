package _06_04_Odev.Odev;

import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) {
        // 1- filedları id, username, password, active (boolean), signedIn (boolean), userRole(ADMIN, OGRENCI, CALISAN, HOCA)
        //    olan User isimli bir class tanımlayınız.
        // 2- bütün fieldları parametre alan bir concructor tanımlayınız.
        // 3- bütün fieldları için getter ve setter metodları oluşturunuz.
        // 4- UserMain isminde main için bir class oluşturunuz.
        // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        //    active ve signedIn default olarak true veya false atayabilirsiniz.
        //    id yi sistem otomatik versin.,
        // 6- eğer password 6 dan küçük olursa yeniden istesin.passwordun
        //    6 karakterden küçük olup olmadığını (classın içinde) kontrol ediniz.
        ArrayList<User> userList=new ArrayList<>();
        User user1=new User("ali","", Role.ADMIN);
        userList.add(user1);
        System.out.println("userList = " + userList);
        User user2=new User("faruk","",Role.HOCA);
        userList.add(user2);
        System.out.println("userList = " + userList);
        User user3=new User("ömer","",Role.CALISAN);
        userList.add(user3);
        System.out.println("userList = " + userList);







    }
}
