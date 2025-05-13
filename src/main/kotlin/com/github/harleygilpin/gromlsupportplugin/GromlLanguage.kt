package com.github.harleygilpin.gromlsupportplugin

import com.intellij.lang.Language

object GromlLanguage : Language("Groml") {
    private fun readResolve(): Any = GromlLanguage

    init {
        println(">> GromlLanguage initialized")
    }
}
