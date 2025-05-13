package com.github.harleygilpin.gromlsupportplugin

import com.github.harleygilpin.gromlsupportplugin.lexer.GromlLexer
import com.intellij.lexer.FlexAdapter
import java.io.Reader

class GromlLexerAdapter : FlexAdapter(GromlLexer(null as Reader?))
