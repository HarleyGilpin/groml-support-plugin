package com.github.harleygilpin.gromlsupportplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.tree.IElementType

class GromlSyntaxHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer = GromlLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType.toString()) {
            "COMMENT" -> arrayOf(COMMENT)
            "STRING" -> arrayOf(STRING)
            "NUMBER" -> arrayOf(NUMBER)
            "KEY" -> arrayOf(KEY)
            "EQUALS" -> arrayOf(EQUALS)
            else -> emptyArray()
        }
    }

    companion object {
        val COMMENT = TextAttributesKey.createTextAttributesKey("GROML_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val STRING = TextAttributesKey.createTextAttributesKey("GROML_STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBER = TextAttributesKey.createTextAttributesKey("GROML_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val KEY = TextAttributesKey.createTextAttributesKey("GROML_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val EQUALS = TextAttributesKey.createTextAttributesKey("GROML_EQUALS", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    }
}
