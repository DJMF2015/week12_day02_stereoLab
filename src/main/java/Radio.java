public class Radio extends Component implements IPlay{

    public Radio(String make, String model){
        super(make, model);
    }

    public String playMusic(){
        return "MUSIC";
    }

    public String tuneRadio(){
        return "Radio 1";
    }

}
