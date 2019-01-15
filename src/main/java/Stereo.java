public class Stereo {

    private String name;
    private Radio radio;
    private CDPlayer player;
    private RecordDeck recordDeck;

    public Stereo(String name, Radio radio, CDPlayer player, RecordDeck recordDeck){
        this.name = name;
        this.radio = radio;
        this.player = player;
        this.recordDeck = recordDeck;
    }

    public String getName() {
        return name;
    }

    public Radio getRadio() {
        return radio;
    }

    public CDPlayer getPlayer() {
        return player;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }

    public String tuneRadio(Radio radio){
        return radio.tuneRadio();
    }
}
