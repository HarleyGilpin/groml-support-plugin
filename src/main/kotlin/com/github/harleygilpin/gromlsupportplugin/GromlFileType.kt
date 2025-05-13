package com.github.harleygilpin.gromlsupportplugin

import com.intellij.openapi.fileTypes.LanguageFileType

object GromlFileType : LanguageFileType(GromlLanguage) {
    init {
        println(">> GromlFileType initialized")
    }

    override fun getName() = "Groml"

    override fun getDescription() = "Groml config file"

    override fun getDefaultExtension() = "groml"

    override fun getIcon() = null
}
