package com.bxer.action;

import com.bxer.utils.EditorUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class RandomLetterAndNumberAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        CharSequence charSequence = UUID.randomUUID().toString().subSequence(0, 8);
        EditorUtil.wirteIntoCurrentCaret(e,charSequence);
    }
}
