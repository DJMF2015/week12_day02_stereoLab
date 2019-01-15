import java.util.ArrayList;

public class CDPlayer extends Component{

    private ArrayList<CD> cdSelection;

    public CDPlayer(String make, String model){
        super(make , model);
        this.cdSelection = new ArrayList<>();
    }

    public String playMusic(){
        return "MUSIC";
    }

    public void addCDToPlayer(CD compactDisk){
        cdSelection.add(compactDisk);

    }

    public int getSelectionSize(){
        return cdSelection.size();
    }
}
