package com.github.harleygilpin.gromlsupportplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object GromlFileType : LanguageFileType(GromlLanguage) {
    init {
        println(">> GromlFileType initialized")
    }

    override fun getName() = "Groml"

    override fun getDescription() = "Groml config file"

    override fun getDefaultExtension() = "groml"

    override fun getIcon(): Icon = IconLoader.getIcon("/icons/file_icon.svg", javaClass)

}

