package _06_17_Odev.Soru2;

public class TxtFile extends File implements IReadFile{
    public TxtFile(String tur, int ebat) {
        super(tur, ebat);
    }

    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
