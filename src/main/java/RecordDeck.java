import java.util.ArrayList;

public class RecordDeck extends Component{

    private ArrayList<CD> recordSelection;

    public RecordDeck(String make, String model){
        super(make , model);
        this.recordSelection = new ArrayList<>();
    }

    public String playMusic(){
        return "MUSIC";
    }
}
