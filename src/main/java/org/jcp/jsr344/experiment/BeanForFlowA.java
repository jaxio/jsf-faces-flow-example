package org.jcp.jsr344.experiment;

import javax.faces.flow.FlowScoped;
import java.io.Serializable;

import javax.inject.Named;

@Named
@FlowScoped(id = "flow_a")
public class BeanForFlowA implements Serializable {
    private static final long serialVersionUID = 1L;

    private String param1 = "value1fromA";
    private String param2 = "value2fromA";

    public String getHelloMessage() {
        return "Hello from " + getClass().getSimpleName() + " which reside in flow 'flow_a'";
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }
}
