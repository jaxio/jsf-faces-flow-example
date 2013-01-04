package org.jcp.jsr344.experiment;

import javax.faces.flow.FlowScoped;
import java.io.Serializable;

import javax.inject.Named;

@Named
@FlowScoped(id = "flow_b")
public class BeanForFlowB implements Serializable {
    private static final long serialVersionUID = 1L;
    private String returnedValue;

    public String getHelloMessage() {
        return "Hello from " + getClass().getSimpleName() + " which reside in flow 'flow_b'";
    }

    public String getReturnedValue() {
        return returnedValue;
    }

    public void setReturnedValue(String returnedValue) {
        this.returnedValue = returnedValue;
    }
}
