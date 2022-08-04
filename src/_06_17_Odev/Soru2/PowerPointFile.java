package _06_17_Odev.Soru2;

public class PowerPointFile extends File implements IReadFile{
    public PowerPointFile(String tur, int ebat) {
        super(tur, ebat);
    }

    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "reading.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String close() {
        return "closing.ppt";
    }
}
