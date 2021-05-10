package com.hs.MingLing;

import java.util.Stack;

/**
 * @author Huasheng
 * @Date 2021/05/10/20:11
 * 历史记录
 * @Description
 */
public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        return history.pop();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}
