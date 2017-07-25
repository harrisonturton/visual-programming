package main.java.view.graph.node.blocks.base;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import main.java.view.util.Fxml;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by harrisonturton on 25/7/17.
 */
public abstract class ANodeBlock implements INodeBlock, Initializable {

    @FXML
    private VBox leftConnectorParent;
    private VBox rightConnectorParent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        System.out.println("left connector children " + leftConnectorParent.getChildren().size());
    }

    @Override
    public <T extends Node> void setView(T root) {
        Fxml.loadFxml(root, this.getViewPath(), this);
    }
}
