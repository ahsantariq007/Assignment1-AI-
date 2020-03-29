/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ehsan
 */
public class NodeClass{
    int state;
    int action;
    int cost;
    NodeClass parent;
    
    public NodeClass(int state, int action, int cost, NodeClass parent) {
        this.state = state;
        this.action = action;
        this.cost = cost;
        this.parent = parent;
    }
    
}
