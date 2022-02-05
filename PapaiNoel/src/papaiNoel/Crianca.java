package papaiNoel;

public class Crianca {
    private String _name;
    private Personality _personality;

    public void name(String name) {
        _name = name;
    }

    public String name() {
        return _name;
    }

    public void personality(Personality personality) {
        _personality = personality;
    }

    public Personality personality() {
        return _personality;
    }
}
