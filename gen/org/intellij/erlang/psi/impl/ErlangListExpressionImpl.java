// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangListExpressionImpl extends ErlangExpressionImpl implements ErlangListExpression {

  public ErlangListExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitListExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ErlangExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ErlangExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getBracketLeft() {
    return findNotNullChildByType(ERL_BRACKET_LEFT);
  }

  @Override
  @Nullable
  public PsiElement getBracketRight() {
    return findChildByType(ERL_BRACKET_RIGHT);
  }

  @Override
  @Nullable
  public PsiElement getComma() {
    return findChildByType(ERL_COMMA);
  }

  @Override
  @Nullable
  public PsiElement getOpOr() {
    return findChildByType(ERL_OP_OR);
  }

}
