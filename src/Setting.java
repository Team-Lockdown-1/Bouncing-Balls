import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;

//scene muss in 800x600 erstellt werden.
public class Setting extends Application {
    private static Stage guiStage;

    public static Stage getStage() {
        return guiStage;
    }
    public static HBox getVBox(){

        //Boxen und kombinationen, Grundstruktur bzw. Grundordnung der Scene
        HBox mainBox = new HBox();
        VBox leftMainBox = new VBox();
        VBox rightMainBox = new VBox();
        HBox leftMainBoxUpperHalf = new HBox();
        HBox leftMainBoxLowerHalf = new HBox();
        VBox rightMainBoxVertical = new VBox();
        HBox ball = new HBox();
        HBox tempo = new HBox();
        HBox infiz = new HBox();
        HBox regeneration = new HBox();

        //Boxen zusammenfügen
        mainBox.getChildren().add(leftMainBox);
        mainBox.getChildren().add(rightMainBox);
        leftMainBox.getChildren().add(leftMainBoxUpperHalf);
        leftMainBox.getChildren().add(leftMainBoxLowerHalf);
        leftMainBoxUpperHalf.getChildren().add(rightMainBoxVertical);

        //Positionen, damit der text an der richtigen Stelle angezeigt wird. muss für jede Box extra gesetzt werden.
        leftMainBoxUpperHalf.setAlignment(Pos.CENTER);
        rightMainBoxVertical.setAlignment(Pos.TOP_CENTER);
        ball.setAlignment(Pos.TOP_CENTER);
        tempo.setAlignment(Pos.TOP_CENTER);
        infiz.setAlignment(Pos.TOP_CENTER);
        regeneration.setAlignment(Pos.TOP_CENTER);
        leftMainBoxLowerHalf.setAlignment(Pos.CENTER);

        //Label - der ganze Label Text
        Label settings = new Label("Settings");
        Label numberOfBalls = new Label("Anzahl der Bälle");
        Label geschwindigkeit = new Label("Geschwindigkeit");
        Label infiziert = new Label("Chance zum infizieren");
        Label heilung = new Label("Heilung");

        //Font size - der ganze Label Text wird größer und fett geschrieben, für die lesbarkeit
        settings.setStyle("-fx-font-size: 20;"+"-fx-font-weight: bold");
        numberOfBalls.setStyle("-fx-font-weight: bold");
        geschwindigkeit.setStyle("-fx-font-weight: bold");
        infiziert.setStyle("-fx-font-weight: bold");
        heilung.setStyle("-fx-font-weight: bold");

        //In der rechten oberen hälfte werden alle Labels und radio buttons eingefügt
        rightMainBoxVertical.getChildren().add(settings);
        rightMainBoxVertical.getChildren().add(numberOfBalls);
        rightMainBoxVertical.getChildren().add(ball);
        rightMainBoxVertical.getChildren().add(geschwindigkeit);
        rightMainBoxVertical.getChildren().add(tempo);
        rightMainBoxVertical.getChildren().add(infiziert);
        rightMainBoxVertical.getChildren().add(infiz);
        rightMainBoxVertical.getChildren().add(heilung);
        rightMainBoxVertical.getChildren().add(regeneration);


        //--------------------Radio Button werden erstellt----------------------------------------------------------------------
        //radio Buttons für Bälle
        RadioButton einHundert = new RadioButton("100");
        RadioButton zweiHundert = new RadioButton("200");
        RadioButton dreiHundert = new RadioButton("300");
        RadioButton vierHundert = new RadioButton("400");

        //radio Buttons für Geschwindigkeit
        RadioButton langsam = new RadioButton("Langsam");
        RadioButton mittel = new RadioButton("Mittel");
        RadioButton schnell = new RadioButton("Schnell");

        //Radio buttons für infi
        RadioButton treffer1 = new RadioButton("1 Treffer");
        RadioButton treffer2 = new RadioButton("2 Treffer");
        RadioButton treffer4 = new RadioButton("4 Treffer");

        //Radio buttons für genesung
        RadioButton h30 = new RadioButton("30");
        RadioButton h60 = new RadioButton("60");
        RadioButton h120 = new RadioButton("120");
        //---------------------------------------------------------------------------------------------------------------------

        //-------------------Radio buttons werden eingefügt-----------------------------------------------------------------------------

        //einfügen bälle
        ball.getChildren().add(einHundert);
        ball.getChildren().add(zweiHundert);
        ball.getChildren().add(dreiHundert);
        ball.getChildren().add(vierHundert);

        //Einfügen der geschwindigkeit
        tempo.getChildren().add(langsam);
        tempo.getChildren().add(mittel);
        tempo.getChildren().add(schnell);

        //Einfügen der infizierten
        infiz.getChildren().add(treffer1);
        infiz.getChildren().add(treffer2);
        infiz.getChildren().add(treffer4);

        //Einfügen der Heilung
        regeneration.getChildren().add(h30);
        regeneration.getChildren().add(h60);
        regeneration.getChildren().add(h120);

        //Gruppen für radio buttons
        ToggleGroup bälle = new ToggleGroup();
        ToggleGroup geschwind = new ToggleGroup();
        ToggleGroup infi = new ToggleGroup();
        ToggleGroup genesung = new ToggleGroup();

        //Radio button groups - bälle
        einHundert.setToggleGroup(bälle);
        zweiHundert.setToggleGroup(bälle);
        dreiHundert.setToggleGroup(bälle);
        vierHundert.setToggleGroup(bälle);

        //Radio button groups - geschwind
        langsam.setToggleGroup(geschwind);
        mittel.setToggleGroup(geschwind);
        schnell.setToggleGroup(geschwind);

        //Radio button groups - infi
        treffer1.setToggleGroup(infi);
        treffer2.setToggleGroup(infi);
        treffer4.setToggleGroup(infi);

        //radio button groups - genesung
        h30.setToggleGroup(genesung);
        h60.setToggleGroup(genesung);
        h120.setToggleGroup(genesung);

        //--------------------------------------------------------------------------------------------------------------

        //---------------------Fixierte höhe der einzelnen segmente-------------------------------
        //Height and width
        rightMainBoxVertical.setMinWidth(300);
        rightMainBoxVertical.setMinHeight(100);
        leftMainBox.setMinWidth(400);
        rightMainBox.setMinWidth(400);
        leftMainBoxUpperHalf.setMinHeight(400);
        leftMainBoxLowerHalf.setMinHeight(180);
        //---------------------------------------------------

        //Spacing - abstände zwischen den wörtern und mehr Abstand zu den andern Zeilen
        ball.setSpacing(10);
        tempo.setSpacing(10);
        infiz.setSpacing(10);
        regeneration.setSpacing(10);
        settings.setPadding(new Insets(35,5,15,5));
        ball.setPadding(new Insets(5,5,15,5));
        tempo.setPadding(new Insets(5,5,15,5));
        infiz.setPadding(new Insets(5,5,15,5));
        regeneration.setPadding(new Insets(5,5,10,5));

        //Border & Farbe
        rightMainBoxVertical.setStyle(
                "-fx-border-style: solid inside;" +
                        "-fx-border-width: 5;" +
                        "-fx-border-color: black;");
        rightMainBox.setStyle(
                "-fx-border-style: solid inside;" +
                        "-fx-border-width: 0 0 0 5;" +

                        "-fx-border-color: blue;");



        //-----------------------------------------------------------------------------
        // Zweiter Teil - linke untere Hälfte

        Button speichern = new Button("Speichern & Exit");
        leftMainBoxLowerHalf.getChildren().add(speichern);
        speichern.setMinSize(200,80);

        //------------------------------------------------------------------------------
        //Dritter Teil - rechte Hälfte

        //Labels
        Label szenarien = new Label("Szenarien");

        //adding labels
        rightMainBox.getChildren().add(szenarien);

        //Styling
        szenarien.setStyle("-fx-font-size: 20;"+"-fx-font-weight: bold");
        rightMainBox.setAlignment(Pos.TOP_CENTER);

        //Abstände
        szenarien.setPadding(new Insets(35,5,15,5));

        //boxen
        HBox firstHBox = new HBox();
        HBox secondHBox = new HBox();
        HBox thirdHBox = new HBox();

        //einfügen
        rightMainBox.getChildren().add(firstHBox);
        rightMainBox.getChildren().add(secondHBox);
        rightMainBox.getChildren().add(thirdHBox);

        // Button erstellen & hinzufügen
        Button wien = new Button("");
        Button haus = new Button("");
        Button venedig = new Button("");
        Button amsterdam = new Button("");
        Button newyork = new Button("");
        Button platzhalter = new Button("");

        firstHBox.getChildren().add(wien);
        firstHBox.getChildren().add(haus);
        secondHBox.getChildren().add(venedig);
        secondHBox.getChildren().add(amsterdam);
        thirdHBox.getChildren().add(newyork);
        thirdHBox.getChildren().add(platzhalter);

        //Button größe umstellen
        wien.setMinSize(150,150);
        haus.setMinSize(150,150);
        venedig.setMinSize(150,150);
        amsterdam.setMinSize(150,150);
        newyork.setMinSize(150,150);
        platzhalter.setMinSize(150,150);

        //zentrieren
        firstHBox.setAlignment(Pos.TOP_CENTER);
        secondHBox.setAlignment(Pos.TOP_CENTER);
        thirdHBox.setAlignment(Pos.TOP_CENTER);

        //Styling
        firstHBox.setPadding(new Insets(5,5,10,5));
        secondHBox.setPadding(new Insets(5,5,10,5));
        thirdHBox.setPadding(new Insets(5,5,10,5));
        firstHBox.setSpacing(10);
        secondHBox.setSpacing(10);
        thirdHBox.setSpacing(10);

        //------------------------------------------------------------------------------------------
        //---------------------------Funktionen-----------------------------------------------------
        //------------------------------------------------------------------------------------------
        HashMap<String, String> list = new HashMap<>();

        speichern.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.put("bälle", ""+bälle.getSelectedToggle());
                list.put("geschwindigkeit", ""+geschwind.getSelectedToggle());
                list.put("infizierte", ""+infi.getSelectedToggle());
                list.put("heilung", ""+genesung.getSelectedToggle());
                System.out.println(list);
                Stage stage = (Stage) speichern.getScene().getWindow();
                stage.close();
            }
        });



        //return
        return mainBox;
    }

    @Override
    public void start(Stage primaryStage) {
        guiStage = primaryStage;


    }
}
