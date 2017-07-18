package main.java.view.graph.node.node.impl.SampleNode;

import main.java.view.graph.node.blocks.Builder.BlockBuilder;
import main.java.view.graph.node.blocks.impl.HeaderBlock;
import main.java.view.graph.node.blocks.impl.TypeValueBlock;
import main.java.view.graph.node.node.base.controller.ANodeController;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class SampleNodeController extends ANodeController {

    private final String innerViewPath = "/main/resources/views/nodes/blocks/HeaderBlock.fxml";

    @Override
    public String getInnerViewPath() {
        return innerViewPath;
    }


    public void setBlocks() {
        System.out.println("Setting blocks...");
        BlockBuilder builder = new BlockBuilder();
        builder.addBlock(new HeaderBlock())
               .addBlock(new TypeValueBlock())
               .setViews(this, this);


//        Fxml.loadFxml(this.getInnerContainer(), this.getInnerViewPath(), this);
//        Fxml.loadFxml(this.getInnerContainer(), "/main/resources/views/TypeValueBlock.fxml", this);
    }
    public void setConnectors() {
        setIncomingConnectors();
        setOutgoingConnectors();
    }

    public void setIncomingConnectors() {
        System.out.println("Setting incoming connectors..."); // todo set Incoming connectors
    }

    public void setOutgoingConnectors() {
//        for (int i = 0; i < 3; i++) {
//            AConnectorController connector = new SimpleConnector(this);
//            connector.addToNode(this, ((((double) i) * 4.0) + 3.0) / (4.0 * 3.0));
//        }
    }
}