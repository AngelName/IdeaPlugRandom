package com.bxer.action;

import com.bxer.utils.EditorUtil;
import com.bxer.utils.RandomColor;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class RandomColorAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        String letterCharacter = RandomColor.randomColor();
        EditorUtil.wirteIntoCurrentCaret(anActionEvent,letterCharacter);
    }
}
