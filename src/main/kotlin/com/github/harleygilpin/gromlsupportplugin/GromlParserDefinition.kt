package com.github.harleygilpin.gromlsupportplugin

import com.github.harleygilpin.gromlsupportplugin.parser.GromlParser
import com.github.harleygilpin.gromlsupportplugin.psi.GromlTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class GromlParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = GromlLexerAdapter()

    override fun createParser(project: Project): PsiParser = GromlParser()

    override fun getFileNodeType(): IFileElementType = GromlElementTypes.FILE

    override fun getCommentTokens(): TokenSet = TokenSet.EMPTY

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: com.intellij.lang.ASTNode) = GromlTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = GromlFile(viewProvider)

    override fun spaceExistanceTypeBetweenTokens(
        left: ASTNode,
        right: ASTNode,
    ) = ParserDefinition.SpaceRequirements.MAY
}
