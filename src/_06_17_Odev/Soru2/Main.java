package _06_17_Odev.Soru2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TxtFile txt=new TxtFile("txt",1);
        PowerPointFile ppt=new PowerPointFile("ppt",2);
        DMGFile dmg=new DMGFile("dmg",3);
        EXEFile exe=new EXEFile("exe",4);


        ArrayList<File> list=new ArrayList<>();
        list.add(txt);
        list.add(ppt);
        list.add(dmg);
        list.add(exe);

        for (File f: list){
            System.out.println();
            System.out.println(f.getClass().getSimpleName());
            System.out.println("----------------------");
            System.out.println("dosya türü: "+f.getTur());
            System.out.println("dosya ebatı: "+f.getEbat());
            System.out.println();

            if (f instanceof TxtFile){
                System.out.println(((TxtFile) f).open());
                System.out.println(((TxtFile) f).read());
                System.out.println(((TxtFile) f).save());
                System.out.println(((TxtFile) f).close());
            }
            if (f instanceof PowerPointFile){
                System.out.println(((PowerPointFile) f).open());
                System.out.println(((PowerPointFile) f).read());
                System.out.println(((PowerPointFile) f).save());
                System.out.println(((PowerPointFile) f).close());
            }
            if (f instanceof DMGFile){
                System.out.println(((DMGFile) f).open());
                System.out.println(((DMGFile) f).read());
                System.out.println(((DMGFile) f).save());
                System.out.println(((DMGFile) f).close());
            }
            if (f instanceof EXEFile){
                System.out.println(((EXEFile) f).open());
                System.out.println(((EXEFile) f).read());
                System.out.println(((EXEFile) f).save());
                System.out.println(((EXEFile) f).close());
            }
        }







    }
}
