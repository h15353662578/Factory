package com.hs.MingLing;

/**
 * @author Huasheng
 * @Date 2021/05/10/20:07
 * 粘贴方法
 * @Description
 */
public class PasteCommand extends Command{

    public PasteCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute(){
        if (editor.clipboard == null || editor.clipboard.isEmpty())
            return false;
        backup();
        editor.textField.insert(editor.clipboard,editor.textField.getCaretPosition());
        return true;
    }
}
