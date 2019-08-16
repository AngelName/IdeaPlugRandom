package com.bxer.action;

import com.bxer.utils.EditorUtil;
import com.bxer.utils.RandomUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class RandomPasswordAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        String letterCharacter = RandomUtil.getPasswordRandom();
        EditorUtil.wirteIntoCurrentCaret(anActionEvent,letterCharacter);
    }
}
