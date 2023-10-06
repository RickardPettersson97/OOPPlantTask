public enum PlantEnum {                       //enumen sparar konstanterna KRANVATTEN, PROTEINDRICKA, MINERALVATTEN, vid initiering anropas konstruktorn!
    KRANVATTEN ("kranvatten"),
    PROTEINDRICKA ("proteindricka"),
    MINERALVATTEN ("mineralvatten");


    public final String vattenTyp;                     //final, går inte att ändra på när värdet givits

    PlantEnum(String sort) {           //konstruktor, String sort parametern är antingen "kranvatten", "proteindricka" eller "mineralvatten" beroende på vilken konstant som initiliseras.
        vattenTyp = sort;

    }
}