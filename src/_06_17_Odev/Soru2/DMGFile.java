package _06_17_Odev.Soru2;

public class DMGFile extends File implements IReadFile{
    public DMGFile(String tur, int ebat) {
        super(tur, ebat);
    }

    @Override
    public String open() {
        return "opening.dmg";
    }

    @Override
    public String read() {
        return "reading.dmg";
    }

    @Override
    public String save() {
        return "saving.dmg";
    }

    @Override
    public String close() {
        return "closing.dmg";
    }
}
