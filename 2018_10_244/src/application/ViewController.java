package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

    @FXML
    private MenuItem menuItemNevjegy;
    
    @FXML
    private TableView<?> tabla;

    @FXML
    private TableColumn<?, ?> tablaID;

    @FXML
    private TableColumn<?, ?> tablaVezetekNev;

    @FXML
    private TableColumn<?, ?> tablaKeresztNev;

    @FXML
    private TableColumn<?, ?> tablaSzulDatum;

    @FXML
    private TextField szovegmezoID;

    @FXML
    private TextField szovegmezoVezetekNev;

    @FXML
    private TextField szovegmezoKeresztNev;

    @FXML
    private TextField szovegmezoSzulDatum;

    @FXML
    void gombHozzaad(ActionEvent event) {
//    	System.out.println(szovegmezoID.getText()); // ezekkel tesztelem a szovegmezőket
//    	System.out.println(szovegmezoKeresztNev.getText());
//    	System.out.println(szovegmezoVezetekNev.getText());
//    	System.out.println(szovegmezoSzulDatum.getText());
    }

    @FXML
    void menuItemKilepes(ActionEvent event) {
    	Platform.exit(); // ezzel lépek ki
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
