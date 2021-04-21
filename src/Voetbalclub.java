public class Voetbalclub {
    private String naam;
    private int wedGewonnen;
    private int wedGelijk;
    private int wedVerloren;
    private int wedGespeeld;
    private int aantalPunten;


    public Voetbalclub(String name){
        naam = name;
        if(naam == null){
            naam = "FC";
        }
    }

    public void verwerkResultaat(char ch){
        if(ch == 'w'){
            wedGewonnen = wedGewonnen +1;
        }
        if(ch == 'g'){
            wedGelijk = wedGelijk +1;
        }
        if(ch == 'v'){
            wedVerloren = wedVerloren +1;
        }
    }

    public String getNaam() {
        return naam;
    }

    public int aantalPunten(){
        int punten = 0;
        punten = punten + wedGelijk;
        punten = punten + (wedGewonnen * 3);
        aantalPunten = punten;
        return punten;
    }

    public int aantalGespeeld(){
        int gespeeld = wedGewonnen + wedGelijk + wedVerloren;
        wedGespeeld = gespeeld;
        return gespeeld;
    }

    public String toString() {
        aantalGespeeld();
        aantalPunten();
        return "Voetbalclub" +
                "naam ='" + naam + '\'' +
                ", wedGewonnen = " + wedGewonnen +
                ", wedGelijk = " + wedGelijk +
                ", wedVerloren = " + wedVerloren +
                ", gespeeld = " + wedGespeeld +
                ", punten = " + aantalPunten;
    }
}
