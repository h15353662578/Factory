package com.hs.MingLing;

/**
 * @author Huasheng
 * @Date 2021/05/10/20:06
 * 复制方法
 * @Description
 */
public class CopyCommand extends Command{

    public CopyCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute(){
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
