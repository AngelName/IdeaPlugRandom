package com.bxer.action;

import com.bxer.utils.EditorUtil;
import com.bxer.utils.RandomUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import java.util.UUID;

public class RandomLetterAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        CharSequence charSequence = UUID.randomUUID().toString().subSequence(0, 8);
        EditorUtil.wirteIntoCurrentCaret(e,charSequence);
    }
}
