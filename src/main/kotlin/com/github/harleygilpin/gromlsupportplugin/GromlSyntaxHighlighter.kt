package com.github.harleygilpin.gromlsupportplugin

import com.github.harleygilpin.gromlsupportplugin.psi.GromlTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.tree.IElementType

class GromlSyntaxHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer = GromlLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        when (tokenType) {
            GromlTypes.KEY -> arrayOf(KEY)
            GromlTypes.STRING -> arrayOf(STRING)
            GromlTypes.NUMBER -> arrayOf(NUMBER)
            GromlTypes.EQUALS -> arrayOf(EQUALS)
            GromlTypes.GROML_COMMENT -> arrayOf(COMMENT)
            else -> emptyArray()
        }

    companion object {
        val COMMENT: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("GROML_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val STRING: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("GROML_STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBER: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("GROML_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val KEY: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("GROML_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val EQUALS: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("GROML_EQUALS", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    }
}
