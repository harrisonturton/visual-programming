package main.java.view.window.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import main.java.view.graph.node.node.NodeFactory;
import main.java.view.graph.node.node.base.ENode;

public class WindowController {

    @FXML
    private AnchorPane canvas;

    public void add(ActionEvent actionEvent) {
        NodeFactory factory = new NodeFactory();
        factory.createNode(ENode.SAMPLE).addToScene(canvas);
    }
}