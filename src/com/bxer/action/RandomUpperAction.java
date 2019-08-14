package com.bxer.action;

import com.bxer.utils.EditorUtil;
import com.bxer.utils.RandomUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class RandomUpperAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        String letterCharacter = RandomUtil.getUpperCase8();
        EditorUtil.wirteIntoCurrentCaret(e,letterCharacter);
    }
}
