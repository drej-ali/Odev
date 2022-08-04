package _06_17_Odev.Soru2;

public class EXEFile extends File implements IReadFile{
    public EXEFile(String tur, int ebat) {
        super(tur, ebat);
    }

    @Override
    public String open() {
        return "opening.exe";
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
