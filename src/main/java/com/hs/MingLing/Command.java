package com.hs.MingLing;

/**
 * @author Huasheng
 * @Date 2021/05/10/19:58
 * 抽象基础命令
 * @Description
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor){
        this.editor = editor;
    }

    void backup(){
        backup = editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
